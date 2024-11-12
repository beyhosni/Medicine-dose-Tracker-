package com.example.medicinedose.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicinedose.model.Dose;
import com.example.medicinedose.service.DoseService;

@RestController
@RequestMapping("/api/doses")
public class DoseController {
    @Autowired
    private DoseService doseService;

    @GetMapping("/{userId}")
    public List<Dose> getAllDoses(@PathVariable String userId) {
        return doseService.getAllDoses(userId);
    }

    @PostMapping
    public Dose addDose(@RequestBody Dose dose) {
        return doseService.addDose(dose);
    }

    @DeleteMapping("/{id}")
    public void deleteDose(@PathVariable String id) {
        doseService.deleteDose(id);
    }

    @PutMapping
    public Dose updateDose(@RequestBody Dose dose) {
        return doseService.updateDose(dose);
    }
}

