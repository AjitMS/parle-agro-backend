package com.parleagro.backend.service;

import com.parleagro.backend.entity.PlantMachineMapping;
import com.parleagro.backend.repository.PlantMachineMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantMachineMappingService {

    @Autowired
    PlantMachineMappingRepository plantMachineMappingRepository;

    public List<PlantMachineMapping> getMappingByPlantId(Long plantId) {
        return plantMachineMappingRepository.findByPlant_id(plantId);
    }

    public PlantMachineMapping getMappingByPlantIdAndMachineId(Long plantId, Long machineId) {
        return plantMachineMappingRepository.findByPlant_idAndMachine_id(plantId, machineId);
    }
}
