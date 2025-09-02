package com.example.zenjitaste.Controllers;

import com.example.zenjitaste.Models.Tourist;
import com.example.zenjitaste.Service.TouristService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/tourists")
@RequiredArgsConstructor
public class TouristController {

    private final TouristService touristService;

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
