package com.example.travel.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="trip_packages")
@Data
public class TripPackage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(length=1000)
	private String description;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private BigDecimal price;
	
	private String duration;
	
	private String availableDates;
	
	private String imageUrl;
	
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
