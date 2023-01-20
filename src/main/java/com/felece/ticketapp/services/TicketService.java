package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.Ticket;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface TicketService {
    Ticket saveTicket(Ticket ticket);
    List<Ticket> getAll();
}
