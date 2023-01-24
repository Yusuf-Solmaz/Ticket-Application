package com.felece.ticketapp.repositories;

import com.felece.ticketapp.dtos.TicketActiveDto;
import com.felece.ticketapp.dtos.UserFilterDto;
import com.felece.ticketapp.entities.Ticket;
import com.felece.ticketapp.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Qualifier("user")
public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "SELECT NEW com.felece.ticketapp.dtos.UserFilterDto" +
            "(t.id)" +
            "FROM User t" +
            " where (:userId IS NULL OR t.id =: userId) ")
    UserFilterDto filterById(Long userId);

    @Query(value = "SELECT t FROM Ticket t " +
            " where (:ticketId IS NULL OR t.id =: ticketId) ")
    Ticket doCancel(Long ticketId);

    User findByFirstname(String name);

    Optional<User> findByEmail(String email);
}
