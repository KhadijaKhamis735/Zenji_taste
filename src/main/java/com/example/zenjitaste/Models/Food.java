package com.example.zenjitaste.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private boolean isHalal;
    private boolean isVegetarian;

    @ElementCollection
    private List<String> ingredients;

    // Getters and Setters
}
