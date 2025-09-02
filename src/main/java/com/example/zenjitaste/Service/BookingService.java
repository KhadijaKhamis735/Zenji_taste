package com.example.zenjitaste.Service;


import com.example.zenjitaste.Models.Booking;
import com.example.zenjitaste.Repository.BookingRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

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
