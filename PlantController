package com.parleagro.backend.controller;

import com.parleagro.backend.entity.Plant;
import com.parleagro.backend.entity.PlantMachineMapping;
import com.parleagro.backend.service.PlantMachineMappingService;
import com.parleagro.backend.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlantController {

    @Autowired
    PlantService plantService;

    @GetMapping("plants")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Plant> plantMachineMapping() {
        return plantService.findAll();
    }
}
