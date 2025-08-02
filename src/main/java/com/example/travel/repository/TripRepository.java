package com.example.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.travel.entity.TripPackage;

public interface TripRepository extends JpaRepository<TripPackage, Long> {

}
