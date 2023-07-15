package com.monkdevs.microservices.HotelService.Services;

import com.monkdevs.microservices.HotelService.Entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);
}
