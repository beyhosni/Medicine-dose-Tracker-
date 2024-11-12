package com.example.medicinedose.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "doses")
public class Dose {
    @Id
    private String id;
    private String userId;
    private String medicineName;
    private String dosage;
    private String scheduleTime;
    private boolean taken;

    // Getters, setters, constructeurs, etc.
}

