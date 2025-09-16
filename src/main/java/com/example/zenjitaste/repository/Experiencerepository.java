package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Experiencerepository extends JpaRepository<Experience, Long> {
}
