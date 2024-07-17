package com.example.curtainmodel.service;

import com.example.curtainmodel.model.Curtain;
import com.example.curtainmodel.repository.CurtainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurtainService {

    @Autowired
    private CurtainRepository curtainRepository;
    
    public Curtain createCurtain(Curtain curtain) {
        return curtainRepository.save(curtain);
    }
    
    public List<Curtain> getAllCurtains() {
        return curtainRepository.findAll();
    }
    
    public Optional<Curtain> getCurtainById(int id) {
        return curtainRepository.findById(id);
    }

    public List<Curtain> getIdByPrice(int price) {
        return curtainRepository.getIdByPrice(price);
    }

    public List<Curtain> getIdByBrand(String brand) {
        return curtainRepository.getIdByBrand(brand);
    }
    
    public void deleteCurtain(int id) {
        curtainRepository.deleteById(id);
    }
}

