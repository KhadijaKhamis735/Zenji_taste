package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Restaurant;
import com.example.zenjitaste.repository.Restaurantrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Restaurantservice {

    private final Restaurantrepository restaurantRepository;

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant findRestaurantById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));
    }
}
