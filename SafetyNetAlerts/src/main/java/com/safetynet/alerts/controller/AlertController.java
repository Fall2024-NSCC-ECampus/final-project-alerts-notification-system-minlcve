package com.safetyalerts.controller;

import com.safetyalerts.model.Person;
import com.safetyalerts.service.AlertService;
import com.safetyalerts.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertController {

    @Autowired
    private AlertService alertService;


    @GetMapping("/firestation")
    public List<Person> getPeopleByFireStation(@RequestParam int stationNumber) {
        if (stationNumber <= 0) {
            throw new BadRequestException("Station number must be greater than 0");
        }
        return alertService.getPeopleByFireStation(stationNumber);
    }
}
