package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelsCreationDto {

    private List<Hotel> hotels;

    public HotelsCreationDto() {
        this.hotels = new ArrayList<>();
    }

    public HotelsCreationDto(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }
}
