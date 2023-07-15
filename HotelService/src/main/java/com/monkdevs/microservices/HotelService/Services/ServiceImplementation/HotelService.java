package com.monkdevs.microservices.HotelService.Services.ServiceImplementation;

import com.monkdevs.microservices.HotelService.Entities.Hotel;
import com.monkdevs.microservices.HotelService.Exceptions.ResourceNotFoundException;
import com.monkdevs.microservices.HotelService.Repositories.HotelRepository;
import com.monkdevs.microservices.HotelService.Services.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelService implements IHotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!"));
    }
}
