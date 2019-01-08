package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> findAll();

    void saveAll(List<Hotel> hotels);
}
