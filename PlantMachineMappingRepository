package com.parleagro.backend.repository;

import com.parleagro.backend.entity.PlantMachineMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantMachineMappingRepository extends JpaRepository<PlantMachineMapping, Long> {

    List<PlantMachineMapping> findByPlant_id(Long plantId);

    PlantMachineMapping findByPlant_idAndMachine_id(Long plantId, Long machineId);
}
