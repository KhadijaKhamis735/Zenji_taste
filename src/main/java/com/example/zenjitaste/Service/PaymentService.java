package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.Payment;
import com.example.zenjitaste.Repository.PaymentRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public Payment recordPayment(Payment payment) {
        // You can add validation or payment processing logic here
        return paymentRepository.save(payment);
    }
}
