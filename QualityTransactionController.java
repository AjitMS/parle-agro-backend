package com.parleagro.backend.controller;

import com.parleagro.backend.dto.QualityTransactionDTO;
import com.parleagro.backend.entity.PlantMachineMapping;
import com.parleagro.backend.entity.Quality;
import com.parleagro.backend.entity.QualityTransaction;
import com.parleagro.backend.service.QualityTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class QualityTransactionController {

    @Autowired
    QualityTransactionService qualityTransactionService;

    @GetMapping("quality-transaction/{plantId}/{machineId}")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<QualityTransactionDTO> qualityTransactions(@PathVariable("plantId") Long plantId, @PathVariable("machineId") Long machineId) {
        return qualityTransactionService.getQualityTransactions(plantId, machineId);
    }

    @PutMapping("quality-transaction/update")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<QualityTransaction> updateQualityTrasactions(@RequestBody List<QualityTransaction> qualityTransactions) {
        return qualityTransactionService.saveAll(qualityTransactions);
    }
}
