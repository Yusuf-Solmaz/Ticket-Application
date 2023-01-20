package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.repositories.TicketRepository;
import com.felece.ticketapp.services.TicketService;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImp implements TicketService {
    TicketRepository ticketRepository;
    VehicleService vehicleService;

    @Autowired
    public TicketServiceImp(TicketRepository ticketRepository,VehicleService vehicleService) {
        this.ticketRepository = ticketRepository;
        this.vehicleService=vehicleService;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {

        Optional<Vehicle> vehicleDto = vehicleService.filterById(ticket.getVehicle().getId());
        if (vehicleDto.get().getNumberOfEmptySeats()>0){
            ticket.getVehicle().setNumberOfEmptySeats( vehicleDto.get().getNumberOfEmptySeats()-1);
            return ticketRepository.save(ticket);
        }
        else {
            System.out.println("Boş koltuk yok.");
            return null;
        }

    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public void deleteTicket(Long id) {
        Ticket ticket = ticketRepository.getById(id);
        ticketRepository.delete(ticket);
    }
}
