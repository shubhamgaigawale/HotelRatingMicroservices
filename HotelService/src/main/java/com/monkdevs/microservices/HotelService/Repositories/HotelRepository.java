package com.monkdevs.microservices.HotelService.Repositories;

import com.monkdevs.microservices.HotelService.Entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
