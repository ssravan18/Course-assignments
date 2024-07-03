package com.app.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.app.repository.RecordRepository;
import com.app.model.Record;

@RestController
@RequestMapping("/insert")
public class InsertController {
	@Autowired
    private RecordRepository recordRepository;

    @HystrixCommand(fallbackMethod = "insertRecordFallback")
    @PostMapping("/")
    public Record insertRecord(@RequestBody Record record) {
        return recordRepository.save(record);
    }
    public Record insertRecordFallback(Record record) {
    	Record fallbackRecord=new Record();
    	fallbackRecord.setName("Fallback");
    	fallbackRecord.setValue("Fallback value");
    	return fallbackRecord;
    }
    
}
