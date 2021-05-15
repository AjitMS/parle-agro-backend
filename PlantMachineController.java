package com.parleagro.backend.controller;

import com.parleagro.backend.entity.PlantMachineMapping;
import com.parleagro.backend.service.PlantMachineMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlantMachineController {

    @Autowired
    PlantMachineMappingService plantMachineMappingService;

    @GetMapping("plant-machine-mapping/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<PlantMachineMapping> plantMachineMapping(@PathVariable("id") Long id) {
        return plantMachineMappingService.getMappingByPlantId(id);
    }

}
