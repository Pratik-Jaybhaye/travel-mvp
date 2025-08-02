package com.example.travel.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="bookings")
@Data
public class Booking {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private int numberOfPeople;
	private LocalDate bookingDate;
	
	@ManyToOne
	@JoinColumn(name="trip_id")
	private TripPackage tripPackage;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=LocalDateTime.now();
		this.updatedAt=LocalDateTime.now();
		
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt=LocalDateTime.now();
	}
	
	
}
