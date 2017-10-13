package com.achala.fms.app.web;

import com.achala.fms.domain.VehicleEntity;
import com.achala.fms.service.VehicleCheckInService;
import com.achala.fms.service.impl.com.achala.fms.util.ReflectionUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class VehicleCheckInController {

    private Date createdDate  = new Date();

    @Autowired
    private VehicleCheckInService vehicleCheckInService;

    @RequestMapping(value = "/getAllVehicles", method = RequestMethod.GET)
    /**
     * TODO test method remove later
     */
    public List<VehicleEntity> getAllVillages() {
        String[] vehicles = {"AUDI", "BMW" , "JAGUAR"};
        int vehicleRandom = new Random().nextInt(vehicles.length);
        final String manufacturer = vehicles[vehicleRandom];
        VehicleEntity newVehicle = new VehicleEntity();
        newVehicle.setManufacturer(manufacturer);
        vehicleCheckInService.checkinVehicle(newVehicle);
        return  vehicleCheckInService.loadAll();
    }



}
