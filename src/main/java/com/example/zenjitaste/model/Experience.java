package com.example.zenjitaste.model;

import jakarta.persistence.*;
        import java.math.BigDecimal;
import java.util.List;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String culturalStory;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "experience_id")
    private List<Food> foods;

    // Getters and Setters
}
