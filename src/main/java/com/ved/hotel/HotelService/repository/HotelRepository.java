package com.ved.hotel.HotelService.repository;

import com.ved.hotel.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
