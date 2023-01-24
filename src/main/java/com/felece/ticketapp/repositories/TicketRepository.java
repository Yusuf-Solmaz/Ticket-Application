package com.felece.ticketapp.repositories;

import com.felece.ticketapp.dtos.TicketActiveDto;
import com.felece.ticketapp.dtos.TicketFilterDto;
import com.felece.ticketapp.entities.Ticket;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("ticket")
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    @Query(value = "SELECT NEW com.felece.ticketapp.dtos.TicketFilterDto" +
            "(tf.id, tf.date,tf.price,tf.isActive,tf.status,tf.user.id,tf.vehicle.id)"+
            "FROM Ticket tf" +
            " where (:userId IS NULL OR tf.user.id =: userId) ")
    List<TicketFilterDto> filterByUserId(Long userId);

    List<Ticket> findByUserId(Long userId);

    @Query(value = "SELECT NEW com.felece.ticketapp.dtos.TicketActiveDto" +
            "(tf.id, tf.date,tf.price,tf.isActive,tf.status,tf.user.id,tf.vehicle)"+
            "FROM Ticket tf" +
            " where (:userId IS NULL OR tf.user.id =: userId AND tf.status='ALINDI') ")
    List<TicketActiveDto> getAllActiveTickets(Long userId);





}
