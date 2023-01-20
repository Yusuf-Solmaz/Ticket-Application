package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.repositories.TicketRepository;
import com.felece.ticketapp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImp implements TicketService {
    TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImp(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
