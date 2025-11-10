package com.ved.hotel.HotelService.repository;

import com.ved.hotel.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, String> {
    Optional<Hotel> findByName(String name);
}
