package com.example.shipment_model.service;

import com.example.shipment_model.Entity.Shipment;
import com.example.shipment_model.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;
    
    public Shipment createShipment(Shipment shipment) {
    	return shipmentRepository.save(shipment);
    }
    
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
    
    public Optional<Shipment> getShipmentById(int id) {
        return shipmentRepository.findById(id);
    }

    public Optional<Shipment> getShipmentByTrackNo(String trackNo) {
        return shipmentRepository.findByTrackNo(trackNo);
    }

    public void deleteShipmentById(int shipId) {
        shipmentRepository.deleteById(shipId);
    }

}
