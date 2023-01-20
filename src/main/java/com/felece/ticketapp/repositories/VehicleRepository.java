package com.felece.ticketapp.repositories;

import com.felece.ticketapp.entities.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("vehicle")
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
