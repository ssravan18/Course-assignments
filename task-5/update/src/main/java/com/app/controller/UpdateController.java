package com.app.controller;
import com.app.repository.RecordRepository;
import com.app.model.Record;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/update")

public class UpdateController {
	 @Autowired
	    private RecordRepository recordRepository;

	    @HystrixCommand(fallbackMethod = "updateRecordFallback")
	    @PutMapping("/{id}")
	    public String updateRecord(@PathVariable Long id, @RequestBody Record updatedRecord) {
	        Optional<Record> optionalRecord = recordRepository.findById(id);
	        if (optionalRecord.isPresent()) {
	            Record existingRecord = optionalRecord.get();
	            existingRecord.setName(updatedRecord.getName());
	            existingRecord.setValue(updatedRecord.getValue());
	            recordRepository.save(existingRecord);
	            return "Record updated successfully";
	        } else {
	            throw new RecordNotFoundException("Record not found with id: " + id);
	        }
	    }
       public String updateRecordFallback(Long id, Record updatedRecord) {
    	   return "Fallback: Unable to update record with id " +id;
       }
	   

}

