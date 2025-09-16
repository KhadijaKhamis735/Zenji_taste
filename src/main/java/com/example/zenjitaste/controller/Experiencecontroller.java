package com.example.zenjitaste.controller;

import com.example.zenjitaste.model.Experience;
import com.example.zenjitaste.service.Experienceservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/experiences")
@RequiredArgsConstructor
public class Experiencecontroller {

    private final Experienceservice experienceService;

    @PostMapping
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience) {
        Experience newExperience = experienceService.saveExperience(experience);
        return ResponseEntity.ok(newExperience);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable Long id) {
        Experience experience = experienceService.findExperienceById(id);
        return ResponseEntity.ok(experience);
    }

    @GetMapping
    public ResponseEntity<List<Experience>> getAllExperiences() {
        List<Experience> experiences = experienceService.findAllExperiences();
        return ResponseEntity.ok(experiences);
    }
}
