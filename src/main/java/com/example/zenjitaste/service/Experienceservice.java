package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Experience;
import com.example.zenjitaste.repository.Experiencerepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Experienceservice {

    private final Experiencerepository experienceRepository;

    public Experience saveExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    public Experience findExperienceById(Long id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Experience not found"));
    }

    public List<Experience> findAllExperiences() {
        return experienceRepository.findAll();
    }
}
