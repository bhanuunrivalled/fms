package com.achala.fms.service;

import com.achala.fms.domain.VehicleEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface VehicleCheckInService {

    public List<VehicleEntity> loadAll();

    public VehicleEntity checkinVehicle(VehicleEntity newVehicle);
}
