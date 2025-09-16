package com.example.zenjitaste.controller;

import com.example.zenjitaste.model.Restaurant;
import com.example.zenjitaste.service.Restaurantservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class Restaurantcontroller {

    private final Restaurantservice restaurantService;

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant savedRestaurant = restaurantService.saveRestaurant(restaurant);
        return ResponseEntity.ok(savedRestaurant);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.findRestaurantById(id);
        return ResponseEntity.ok(restaurant);
    }
}
