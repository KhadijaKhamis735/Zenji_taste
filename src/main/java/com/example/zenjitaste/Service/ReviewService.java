package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.Review;
import com.example.zenjitaste.Repository.ReviewRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public Review submitReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> findAllReviewsByExperienceId(Long experienceId) {
        // Custom query to find reviews for a specific experience
        return reviewRepository.findAll(); // Placeholder, you would add a custom method to the repo for this
    }
}
