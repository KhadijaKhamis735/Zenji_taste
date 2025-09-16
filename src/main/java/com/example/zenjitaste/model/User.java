package com.example.zenjitaste.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
    public abstract class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String email;
        private String password; // Should be encrypted in a real application
        private String name;

        // Getters and Setters
    }

