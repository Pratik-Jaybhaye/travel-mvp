package com.example.travel.service;

import java.util.List;

import com.example.travel.entity.Booking;

public interface BookingService {
	Booking createBooking(Booking booking);
	List<Booking>getAllBookings();

}

