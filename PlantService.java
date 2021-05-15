package com.parleagro.backend.service;

import com.parleagro.backend.entity.Plant;
import com.parleagro.backend.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    @Autowired
    PlantRepository plantRepository;

    public List<Plant> findAll() {
        return plantRepository.findAll();
    }
}
