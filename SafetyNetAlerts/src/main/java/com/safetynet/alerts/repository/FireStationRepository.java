package com.safetyalerts.repository;

import com.safetyalerts.model.FireStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireStationRepository extends JpaRepository<FireStation, Integer> {

}
