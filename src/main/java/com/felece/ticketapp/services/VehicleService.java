package com.felece.ticketapp.services;

import com.felece.ticketapp.entities.Vehicle;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);
    List<Vehicle> getAll();
}
