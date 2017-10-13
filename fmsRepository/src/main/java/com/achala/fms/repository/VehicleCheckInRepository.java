package com.achala.fms.repository;

import com.achala.fms.domain.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCheckInRepository extends JpaRepository<VehicleEntity,Long>{

    public VehicleEntity findById(Long id);



}
