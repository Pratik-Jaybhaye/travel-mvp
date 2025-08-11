package com.example.travel.service;

import com.example.travel.entity.Booking;
import com.example.travel.entity.TripPackage;
import com.example.travel.repository.BookingRepository;
import com.example.travel.repository.TripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private TripRepository tripRepository;
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
    	if (booking.getTripPackage() != null && booking.getTripPackage().getId() != null) {
            TripPackage existingTrip = tripRepository
                .findById(booking.getTripPackage().getId())
                .orElseThrow(() -> new RuntimeException("Trip not found"));
            booking.setTripPackage(existingTrip);
        }
    	 return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}
