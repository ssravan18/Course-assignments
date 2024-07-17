package com.example.curtainmodel.controller;

import com.example.curtainmodel.model.Curtain;
import com.example.curtainmodel.service.CurtainService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/curtain")
public class CurtainController {

    @Autowired
    private CurtainService curtainService;
    
    @PostMapping
    public Curtain createCurtain(@RequestBody Curtain curtain) {
        return curtainService.createCurtain(curtain);
    }

    @GetMapping
    public List<Curtain> getAllCurtains() {
        return curtainService.getAllCurtains();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curtain> getCurtainById(@PathVariable int id) {
        return curtainService.getCurtainById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurtain(@PathVariable int id) {
        curtainService.deleteCurtain(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/greatter_price/{price}")
    public List<Curtain> getIdByPrice(@PathVariable int price) {
        return curtainService.getIdByPrice(price);
    }

    @GetMapping("/brand")
    public List<Curtain> getIdByBrand(@RequestParam String brand) {
        return curtainService.getIdByBrand(brand);
    }
}
