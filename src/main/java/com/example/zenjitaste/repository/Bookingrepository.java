package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookingrepository extends JpaRepository<Booking, Long> {
}
