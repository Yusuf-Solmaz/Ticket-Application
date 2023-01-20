package com.felece.ticketapp.repositories;

import com.felece.ticketapp.entities.Admin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("admin")
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
