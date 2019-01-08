package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Hotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class InMemoryHotelService implements HotelService {

    static Map<Long, Hotel> hotelsDB = new HashMap<>();

    @Override
    public List<Hotel> findAll() {
        return new ArrayList<>(hotelsDB.values());
    }

    @Override
    public void saveAll(List<Hotel> hotels) {
        long nextId = getNextId();
        for (Hotel hotel : hotels) {
            if (hotel.getId() == 0) {
                hotel.setId(nextId++);
            }
        }

        Map<Long, Hotel> hotelMap = hotels.stream()
            .collect(Collectors.toMap(Hotel::getId, Function.identity()));

        hotelsDB.putAll(hotelMap);
    }

    private Long getNextId() {
        return hotelsDB.keySet()
            .stream()
            .mapToLong(value -> value)
            .max()
            .orElse(0) + 1;
    }
}
