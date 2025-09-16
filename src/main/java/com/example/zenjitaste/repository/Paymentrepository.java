package com.example.zenjitaste.repository;

import com.example.zenjitaste.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Paymentrepository extends JpaRepository<Payment, Long> {
}
