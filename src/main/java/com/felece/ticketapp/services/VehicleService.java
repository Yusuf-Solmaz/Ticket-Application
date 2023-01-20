package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.Vehicle;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);
    List<Vehicle> getAll();
    Optional<Vehicle> filterById(Long id);
}
