package com.example.zenjitaste.controller;

import com.example.zenjitaste.model.Tourist;
import com.example.zenjitaste.service.Touristservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/tourists")
@RequiredArgsConstructor
public class Touristcontroller {

    private final Touristservice touristService;

    @PostMapping
    public ResponseEntity<Tourist> createTourist(@RequestBody Tourist tourist) {
        Tourist savedTourist = touristService.saveTourist(tourist);
        return ResponseEntity.ok(savedTourist);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tourist> getTouristById(@PathVariable Long id) {
        Tourist tourist = touristService.findTouristById(id);
        return ResponseEntity.ok(tourist);
    }
}
