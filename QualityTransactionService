package com.parleagro.backend.service;

import com.parleagro.backend.dto.DateAndDataDTO;
import com.parleagro.backend.dto.QualityTransactionDTO;
import com.parleagro.backend.entity.PlantMachineMapping;
import com.parleagro.backend.entity.QualityTransaction;
import com.parleagro.backend.repository.QualityTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class QualityTransactionService {

    @Autowired
    QualityTransactionRepository qualityTransactionRepository;

    @Autowired
    PlantMachineMappingService plantMachineMappingService;

    public List<QualityTransactionDTO> getQualityTransactions(Long plantId, Long machineId) {
        PlantMachineMapping plantMachineMapping = plantMachineMappingService.getMappingByPlantIdAndMachineId(plantId, machineId);
        List<QualityTransaction> qualityTransactions = qualityTransactionRepository.findByPlantMachineMapping_id(plantMachineMapping.getId());

        List<QualityTransactionDTO> qualityTransactionDTOS = new ArrayList<>();
        Map<String, List<QualityTransaction>> result = qualityTransactions.stream()
                .collect(Collectors.groupingBy(obj -> obj.getQuality().getName(),
                        Collectors.mapping(obj -> obj, Collectors.toList())));

        result.forEach((qualityName, qualityTransaction) -> {
            QualityTransactionDTO qualityTransactionDTO = new QualityTransactionDTO();
            qualityTransactionDTO.setQualityName(qualityName);
            qualityTransaction.forEach(obj -> {
                DateAndDataDTO dateAndDataDTO = new DateAndDataDTO();
                dateAndDataDTO.setData(obj.getData());
                dateAndDataDTO.setDataType(obj.getQuality().getDataType());
                dateAndDataDTO.setDescription(obj.getQuality().getDescription());
                dateAndDataDTO.setClassName(obj.getQuality().getClassName());
                dateAndDataDTO.setDate(obj.getTime().getName());

                addDateData(qualityTransactionDTO, obj, dateAndDataDTO);
            });
            qualityTransactionDTOS.add(qualityTransactionDTO);
        });
        return qualityTransactionDTOS;
    }

    private void addDateData(QualityTransactionDTO qualityTransactionDTO, QualityTransaction obj, DateAndDataDTO dateAndDataDTO) {
        switch (obj.getTime().getName()) {
            case "07_00_07_30":
                qualityTransactionDTO.setDataAt07_00_07_30(dateAndDataDTO);
                break;
            case "07_30_08_00":
                qualityTransactionDTO.setDataAt07_30_08_00(dateAndDataDTO);
                break;
            case "08_00_08_30":
                qualityTransactionDTO.setDataAt08_00_08_30(dateAndDataDTO);
                break;
            case "08_30_09_00":
                qualityTransactionDTO.setDataAt08_30_09_00(dateAndDataDTO);
                break;
            case "09_00_09_30":
                qualityTransactionDTO.setDataAt09_00_09_30(dateAndDataDTO);
                break;
            case "09_30_10_00":
                qualityTransactionDTO.setDataAt09_30_10_00(dateAndDataDTO);
                break;
            case "10_00_10_30":
                qualityTransactionDTO.setDataAt10_00_10_30(dateAndDataDTO);
                break;
            case "10_30_11_00":
                qualityTransactionDTO.setDataAt10_30_11_00(dateAndDataDTO);
                break;
            case "11_00_11_30":
                qualityTransactionDTO.setDataAt11_00_11_30(dateAndDataDTO);
                break;
            case "11_30_12_00":
                qualityTransactionDTO.setDataAt11_30_12_00(dateAndDataDTO);
                break;
            case "12_00_12_30":
                qualityTransactionDTO.setDataAt12_00_12_30(dateAndDataDTO);
                break;
            case "12_30_01_00":
                qualityTransactionDTO.setDataAt12_30_01_00(dateAndDataDTO);
                break;
            case "01_00_01_30":
                qualityTransactionDTO.setDataAt01_00_01_30(dateAndDataDTO);
                break;
            case "01_30_02_00":
                qualityTransactionDTO.setDataAt01_30_02_00(dateAndDataDTO);
                break;
            default:
                break;
        }
    }

    public List<QualityTransaction> saveAll(List<QualityTransaction> qualityTransactions) {
        return qualityTransactionRepository.saveAll(qualityTransactions);
    }
}
