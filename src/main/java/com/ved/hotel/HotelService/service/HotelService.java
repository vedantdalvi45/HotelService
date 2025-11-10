package com.ved.hotel.HotelService.service;

import com.ved.hotel.HotelService.model.Hotel;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotel(String id);

}
