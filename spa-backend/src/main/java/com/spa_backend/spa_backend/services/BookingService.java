package com.spa_backend.spa_backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spa_backend.spa_backend.models.Booking;
import com.spa_backend.spa_backend.repositories.BookingRepository;

@Service
public class BookingService {
    
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking deleteBooking(String id) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        if (booking != null) {
            bookingRepository.delete(booking);
        }
        return booking;
    }
}
