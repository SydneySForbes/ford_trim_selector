package edu.kennesaw.swegroup3.fordtrimselector.controller;

import edu.kennesaw.swegroup3.fordtrimselector.document.Vehicle;
import edu.kennesaw.swegroup3.fordtrimselector.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        return new ResponseEntity<List<Vehicle>>(vehicleService.allVehicles(), HttpStatus.OK);
    }

    @GetMapping("/{model}/{year}")
    public ResponseEntity<Vehicle> getSingleVehicle(@PathVariable String model, @PathVariable String year){
        Optional<Vehicle> vehicle = vehicleService.singleVehicle(model, year);
        if (vehicle.isPresent()) {
            return new ResponseEntity<>(vehicle.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
