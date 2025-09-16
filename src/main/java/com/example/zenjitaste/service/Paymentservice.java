package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Payment;
import com.example.zenjitaste.repository.Paymentrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Paymentservice {

    private final Paymentrepository paymentRepository;

    public Payment recordPayment(Payment payment) {
        // You can add validation or payment processing logic here
        return paymentRepository.save(payment);
    }
}
