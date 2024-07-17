package com.example.shipment_model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.shipment_model.Entity.Shipment;
import com.example.shipment_model.service.ShipmentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("/track/{trackNo}")
    public ResponseEntity<Shipment> getShipmentByTrackNo(@PathVariable String trackNo) {
        Optional<Shipment> shipment = shipmentService.getShipmentByTrackNo(trackNo);
        if (shipment.isPresent()) {
            return ResponseEntity.ok(shipment.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PostMapping
    public ResponseEntity<?> createShipment(@RequestBody Shipment shipment) {
        Shipment createdShipment = shipmentService.createShipment(shipment);
        return ResponseEntity.status(HttpStatus.CREATED).body("Shipment created with ID: " + createdShipment.getShipId());
    }

    @GetMapping
    public ResponseEntity<List<Shipment>> getAllShipments() {
        List<Shipment> shipments = shipmentService.getAllShipments();
        return ResponseEntity.ok(shipments);
    }

    @GetMapping("/{shipid}")
    public ResponseEntity<Shipment> getShipmentById(@PathVariable int shipid) {
        Optional<Shipment> shipment = shipmentService.getShipmentById(shipid);
        return shipment.map(ResponseEntity::ok)
                       .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<?> deleteShipmentById(@PathVariable int shipId) {
        shipmentService.deleteShipmentById(shipId);
        return ResponseEntity.ok().body("Successfully Deleted shipments");
    }
}
