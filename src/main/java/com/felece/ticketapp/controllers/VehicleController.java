package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@CrossOrigin(origins = "*")
public class VehicleController {

    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAll(){
        return vehicleService.getAll();
    }

    @PostMapping
    public Vehicle save(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }
}
