package com.spa_backend.spa_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spa_backend.spa_backend.models.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {
    
}
