package com.example.travel.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.travel.entity.TripPackage;

public interface TripService  {
	TripPackage createTrip(TripPackage tripPackage);
	List<TripPackage> getAllTrips();
	
}
