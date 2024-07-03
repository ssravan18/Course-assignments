package com.app.controller;
import com.app.repository.RecordRepository;
import com.app.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/select")

public class SelectController {
	@Autowired
    private RecordRepository recordRepository;

    @HystrixCommand(fallbackMethod = "getRecordByIdFallback")
    @GetMapping("/{id}")
    public Optional<Record> getRecordById(@PathVariable Long id) {
        return recordRepository.findById(id);
    }

    @HystrixCommand(fallbackMethod = "getAllRecordsFallback")
    @GetMapping("/")
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public Optional<Record> getRecordByIdFallback(Long id) {
        return Optional.empty();
    }
  public List<Record> getAllRecordsFallback(){
	  return Collections.emptyList();
  }   
}




