package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.repositories.VehicleRepository;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImp implements VehicleService {
    VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImp(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
