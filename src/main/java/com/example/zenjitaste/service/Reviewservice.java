package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Review;
import com.example.zenjitaste.repository.Reviewrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Reviewservice {

    private final Reviewrepository reviewRepository;

    public Review submitReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> findAllReviewsByExperienceId(Long experienceId) {
        // Custom query to find reviews for a specific experience
        return reviewRepository.findAll(); // Placeholder, you would add a custom method to the repo for this
    }
}
