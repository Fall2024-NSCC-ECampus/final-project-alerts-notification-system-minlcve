package com.safetyalerts.service;

import com.safetyalerts.exception.ResourceNotFoundException;
import com.safetyalerts.model.Person;
import com.safetyalerts.model.FireStation;
import com.safetyalerts.repository.PersonRepository;
import com.safetyalerts.repository.FireStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlertService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private FireStationRepository fireStationRepository;

    // Get people by fire station
    public List<Person> getPeopleByFireStation(int stationNumber) {
        FireStation fireStation = fireStationRepository.findById(stationNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Fire station not found with station number: " + stationNumber));

        return personRepository.findAll().stream()
                .filter(person -> person.getAddress().equals(fireStation.getAddress()))
                .collect(Collectors.toList());
    }
}
