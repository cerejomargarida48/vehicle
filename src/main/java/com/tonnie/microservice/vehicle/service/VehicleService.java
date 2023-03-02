package com.tonnie.microservice.vehicle.service;

import com.tonnie.microservice.vehicle.model.Vehicle;
import com.tonnie.microservice.vehicle.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public List<Vehicle> get() {
        return repository.findAll();
    }

    public Vehicle post(Vehicle vehicle) {
        return repository.save(vehicle);
    }
}
