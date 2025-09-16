package com.example.zenjitaste.repository;


import com.example.zenjitaste.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Foodrepository extends JpaRepository<Food, Long> {
}