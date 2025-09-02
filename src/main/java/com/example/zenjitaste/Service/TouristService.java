package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.Tourist;
import com.example.zenjitaste.Repository.TouristRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TouristService {

    private final TouristRepository touristRepository;

    public Tourist saveTourist(Tourist tourist) {
        return touristRepository.save(tourist);
    }

    public Tourist findTouristById(Long id) {
        return touristRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tourist not found"));
    }
}