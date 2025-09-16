package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Touristrepository extends JpaRepository<Tourist, Long> {
}
