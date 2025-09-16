package com.example.zenjitaste.service;


import com.example.zenjitaste.model.Booking;
import com.example.zenjitaste.repository.Bookingrepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Bookingservice {

    private final Bookingrepository bookingRepository;

    public Booking createBooking(Booking booking) {
        // You would add business logic here, like checking experience availability
        return bookingRepository.save(booking);
    }

    public Booking findBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    public List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }
}
