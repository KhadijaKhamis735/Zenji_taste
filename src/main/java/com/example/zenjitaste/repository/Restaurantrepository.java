package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Restaurantrepository extends JpaRepository<Restaurant, Long> {
}