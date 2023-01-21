package com.felece.ticketapp.servicesImp;

import com.felece.ticketapp.entities.Vehicle;
import com.felece.ticketapp.repositories.VehicleRepository;
import com.felece.ticketapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Vehicle> filterById(Long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public Vehicle updateVehicle(Long vehicleId, Vehicle newVehicle) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(vehicleId);
        if (vehicle.isPresent()){
            Vehicle foundVehicle = vehicle.get();
            foundVehicle.setNumberOfEmptySeats(newVehicle.getNumberOfEmptySeats());
            foundVehicle.setPlateNumber(newVehicle.getPlateNumber());
            foundVehicle.setBrand(newVehicle.getBrand());
            foundVehicle.setActive(newVehicle.isActive());
            foundVehicle.setRoute(newVehicle.getRoute());
            vehicleRepository.save(foundVehicle);
            return foundVehicle;
        }
        else {
            System.out.println("Belirtilen id ile bağlantılı araç bulunamadı.");
            return null;
        }
    }
}
