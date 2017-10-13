package com.achala.fms.service.impl;

import com.achala.fms.domain.VehicleEntity;
import com.achala.fms.repository.VehicleCheckInRepository;
import com.achala.fms.service.VehicleCheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class VehicleCheckInServiceImpl implements VehicleCheckInService {

    @Autowired
    private VehicleCheckInRepository vehicleCheckInRepository;

    @Override
    public List<VehicleEntity> loadAll() {
        return vehicleCheckInRepository.findAll();
    }

    @Override
    public VehicleEntity checkinVehicle(VehicleEntity newVehicle) {
        /**
         * TODO lots of things to do before save
         */
        return vehicleCheckInRepository.save(newVehicle);

    }
}
