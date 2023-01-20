package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.repositories.VehicleRepository;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImp implements VehicleService {
    VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImp(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }
}
