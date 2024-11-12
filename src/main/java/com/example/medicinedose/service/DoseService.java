package com.example.medicinedose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicinedose.model.Dose;
import com.example.medicinedose.repository.DoseRepository;

@Service
public class DoseService {
    @Autowired
    private DoseRepository doseRepository;

    public List<Dose> getAllDoses(String userId) {
        return doseRepository.findByUserId(userId);
    }

    public Dose addDose(Dose dose) {
        return doseRepository.save(dose);
    }

    public void deleteDose(String id) {
        doseRepository.deleteById(id);
    }

    public Dose updateDose(Dose dose) {
        return doseRepository.save(dose);
    }
}

