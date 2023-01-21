package com.felece.ticketapp.services;

import com.felece.ticketapp.dtos.TicketFilterDto;
import com.felece.ticketapp.entities.Ticket;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public interface TicketService {
    Ticket saveTicket(Ticket ticket);
    List<Ticket> getAll();
    void deleteTicket(Long id);
    List<TicketFilterDto> filterByUserId(Long userId);

    List<Ticket> getAllTickets(Optional<Long> userId);
}
