package com.example.shipment_model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shipment_model.Entity.Shipment;

import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
    Optional<Shipment> findByTrackNo(String trackNo);
}
