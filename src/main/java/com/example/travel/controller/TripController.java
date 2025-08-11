package com.example.travel.controller;

import com.example.travel.entity.TripPackage;
import com.example.travel.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "*")
public class TripController {

    @Autowired
    private TripRepository tripRepository;

    @PostMapping
    public TripPackage createTrip(@RequestBody TripPackage tripPackage) {
        return tripRepository.save(tripPackage);
    }

    @GetMapping
    public List<TripPackage> getAllTrips() {
        return tripRepository.findAll();
    }
}
