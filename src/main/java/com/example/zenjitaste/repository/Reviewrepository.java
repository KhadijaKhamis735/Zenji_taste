package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reviewrepository extends JpaRepository<Review, Long> {
}
