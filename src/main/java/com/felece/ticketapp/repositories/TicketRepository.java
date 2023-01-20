package com.felece.ticketapp.repositories;

import com.felece.ticketapp.entities.Ticket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("ticket")
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
