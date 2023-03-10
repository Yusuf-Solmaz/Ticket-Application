package com.felece.ticketapp.controllers;

import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("/{vehicleId}")
    public void delete(@PathVariable Long vehicleId){
        vehicleService.deleteVehicle(vehicleId);
    }

    @PutMapping("/{vehicleId}")
    public Vehicle updateVehicle(@PathVariable Long vehicleId,@RequestBody Vehicle newVehicle){
        return vehicleService.updateVehicle(vehicleId,newVehicle);
    }
    @GetMapping
    public List<Vehicle> getAllVehicles(@RequestParam Optional<Long> routeId){
        return vehicleService.getAllVehicles(routeId);
    }
}
