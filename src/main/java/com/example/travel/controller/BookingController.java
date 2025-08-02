package com.example.travel.controller;

import java.util.List;
//@org.springframework.beans.factory.annotation.Autowired(required=true)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.example.travel.entity.Booking;
import com.example.travel.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins="*")
public class BookingController {
	
	@Autowired 
	private BookingService bookingService;
	
	@PostMapping
	public Booking createBooking(@RequestBody Booking booking) {
		
		return bookingService.createBooking(booking);
	}
	
	@GetMapping
	public List<Booking>getAllBookings(){
		return bookingService.getAllBookings();
	}
	

}
