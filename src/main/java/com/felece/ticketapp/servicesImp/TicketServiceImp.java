package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.dtos.TicketActiveDto;
import com.felece.ticketapp.dtos.TicketFilterDto;
import com.felece.ticketapp.dtos.UserFilterDto;
import com.felece.ticketapp.entities.Status;
import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.entities.User;
import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.repositories.TicketRepository;
import com.felece.ticketapp.repositories.UserRepository;
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
    UserRepository userRepository;

    @Autowired
    public TicketServiceImp(TicketRepository ticketRepository,VehicleService vehicleService,UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.vehicleService=vehicleService;
        this.userRepository=userRepository;
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

    @Override
    public List<TicketFilterDto> filterByUserId(Long userId) {
        UserFilterDto userFilterDto = userRepository.filterById(userId);
        return ticketRepository.filterByUserId(userFilterDto.getUserId());
    }

    @Override
    public List<Ticket> getAllTickets(Optional<Long> userId) {
        if(userId.isPresent())
            return ticketRepository.findByUserId(userId.get());
        return ticketRepository.findAll();

    }

    @Override
    public List<TicketActiveDto> getAllActiveTickets(Long userId) {
        UserFilterDto userFilterDto = userRepository.filterById(userId);
        return ticketRepository.getAllActiveTickets(userFilterDto.getUserId());
    }

    @Override
    public Ticket updateTicketCancel(Long ticketId) {
        Optional<Ticket> ticket = ticketRepository.findById(ticketId);
        if (ticket.isPresent()){
            Ticket foundTicket = ticket.get();
            foundTicket.setStatus(Status.IPTAL_EDILDI);
            ticketRepository.save(foundTicket);
            return foundTicket;
        }
        else {
            return null;
        }
    }


}
