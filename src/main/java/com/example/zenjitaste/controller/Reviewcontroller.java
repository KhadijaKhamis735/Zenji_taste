package com.example.zenjitaste.controller;

import com.example.zenjitaste.model.Review;
import com.example.zenjitaste.service.Reviewservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class Reviewcontroller {

    private final Reviewservice reviewService;

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
