package com.felece.ticketapp.repositories;


import com.felece.ticketapp.entities.AllUsers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("allUsers")
public interface AllUsersRepository extends JpaRepository<AllUsers,Long> {
}
