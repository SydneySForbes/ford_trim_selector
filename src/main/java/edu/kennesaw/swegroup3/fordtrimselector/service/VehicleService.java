package edu.kennesaw.swegroup3.fordtrimselector.service;

import edu.kennesaw.swegroup3.fordtrimselector.document.Vehicle;
import edu.kennesaw.swegroup3.fordtrimselector.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class VehicleService {
    private static final Logger logger = Logger.getLogger(VehicleService.class.getName());
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> allVehicles(){
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> singleVehicle(String model, String year) {
        logger.info("Querying for vehicle with model: " + model + " and year: " + year);
        Optional<Vehicle> vehicle = vehicleRepository.findByModelAndYear(model, year);
        if (vehicle.isPresent()) {
            logger.info("Vehicle found: " + vehicle.get());
        } else {
            logger.warning("Vehicle not found for model: " + model + " and year: " + year);
        }
        return vehicle;
    }

    public Optional<Vehicle> singleVehicleById(String id) {
        logger.info("Querying for vehicle with id: " + id);
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        if (vehicle.isPresent()) {
            logger.info("Vehicle found: " + vehicle.get());
        } else {
            logger.warning("Vehicle not found for id: " + id);
        }
        return vehicle;
    }
}
