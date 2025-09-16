package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Tourist;
import com.example.zenjitaste.repository.Touristrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Touristservice {

    private final Touristrepository touristRepository;

    public Tourist saveTourist(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    public Tourist findTouristById(Long id) {
        return touristRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
    }
}