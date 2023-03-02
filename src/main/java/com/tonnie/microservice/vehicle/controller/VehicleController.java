package com.tonnie.microservice.vehicle.controller;

import com.tonnie.microservice.vehicle.model.Vehicle;
import com.tonnie.microservice.vehicle.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> get() {
        return service.get();
    }

    @PostMapping
    public Vehicle post(@RequestBody Vehicle vehicle) {
        return service.post(vehicle);
    }
}
