package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.repositories.TicketRepository;
import com.felece.ticketapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImp implements TicketService {
    TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImp(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }
}
