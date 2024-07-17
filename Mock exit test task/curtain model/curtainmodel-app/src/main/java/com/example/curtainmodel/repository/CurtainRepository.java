package com.example.curtainmodel.repository;

import com.example.curtainmodel.model.Curtain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CurtainRepository extends JpaRepository<Curtain, Integer> {

    @Query("SELECT c FROM Curtain c WHERE c.price > :givenPrice")
    List<Curtain> getIdByPrice(@Param("givenPrice") int givenPrice);

    @Query("SELECT c FROM Curtain c WHERE c.brand = :brand")
    List<Curtain> getIdByBrand(@Param("brand") String brand);
}

