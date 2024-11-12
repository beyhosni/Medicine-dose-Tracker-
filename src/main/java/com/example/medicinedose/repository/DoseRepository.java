package com.example.medicinedose.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.medicinedose.model.Dose;

public interface DoseRepository extends MongoRepository<Dose, String> {
    List<Dose> findByUserId(String userId);
}

