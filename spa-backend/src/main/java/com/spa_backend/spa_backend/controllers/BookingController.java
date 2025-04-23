package com.spa_backend.spa_backend.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.spa_backend.spa_backend.models.Booking;
import com.spa_backend.spa_backend.services.BookingService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = {
"http://localhost:5173",
"https://octopus-app-r7r5o.ondigitalocean.app"})
@RestController
@RequestMapping("/booking")
public class BookingController {
    
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/getAllBookings")
    public List<Booking> getMethodName() {
        return bookingService.getAllBookings();
    }

    @PostMapping("/add")
    public Booking postMethodName(@RequestBody Booking entity) {
        return bookingService.createBooking(entity);
    }

    @DeleteMapping("/delete")
    public Booking deleteMethodName(@RequestParam String id) {
        return bookingService.deleteBooking(id);
    }
    
}
