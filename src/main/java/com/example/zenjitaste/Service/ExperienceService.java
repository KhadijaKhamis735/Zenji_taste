package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.Experience;
import com.example.zenjitaste.Repository.ExperienceRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

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
