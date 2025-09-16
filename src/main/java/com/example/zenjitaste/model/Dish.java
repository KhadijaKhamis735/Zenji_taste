package com.example.zenjitaste.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Dish {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long dishId;

        @ManyToOne
        @JoinColumn(name = "provider_id")
        private Provider provider;

        private String name;
        private String description;
        private double price;
        private String culturalStory;
        private String imageUrl;
    }


