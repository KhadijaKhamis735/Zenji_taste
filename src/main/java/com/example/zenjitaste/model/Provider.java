package com.example.zenjitaste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Provider extends User {
    private String location;
    private String story;

    // Getters and Setters
}
