package com.example.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.travel.entity.TripPackage;
import com.example.travel.repository.TripRepository;

@Service
public  class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;
	
	@Override
	public TripPackage createTrip(TripPackage tripPackage) {
		return tripRepository.save(tripPackage);
	}
	@Override
	public List<TripPackage> getAllTrips(){
		return tripRepository.findAll();
	}
	
}
