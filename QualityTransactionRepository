package com.parleagro.backend.repository;

import com.parleagro.backend.entity.QualityTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QualityTransactionRepository extends JpaRepository<QualityTransaction, Long> {

    List<QualityTransaction> findByPlantMachineMapping_id(Long plantMachingMappingId);
}
