package com.example.zenjitaste.Controllers;

import com.example.zenjitaste.Models.Review;
import com.example.zenjitaste.Service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> submitReview(@RequestBody Review review) {
        Review newReview = reviewService.submitReview(review);
        return ResponseEntity.ok(newReview);
    }

    @GetMapping("/experience/{experienceId}")
    public ResponseEntity<List<Review>> getReviewsByExperienceId(@PathVariable Long experienceId) {
        List<Review> reviews = reviewService.findAllReviewsByExperienceId(experienceId);
        return ResponseEntity.ok(reviews);
    }
}
