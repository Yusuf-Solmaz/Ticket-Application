package com.felece.ticketapp.repositories;

import com.felece.ticketapp.entities.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("user")
public interface UserRepository extends JpaRepository<User,Long> {
}
