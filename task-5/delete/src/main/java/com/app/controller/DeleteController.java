package com.app.controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.app.repository.RecordRepository;
import com.app.model.Record;
import java.util.List;

@RestController
@RequestMapping("/delete")
public class DeleteController {
	@Autowired
    private RecordRepository recordRepository;

    @HystrixCommand(fallbackMethod = "deleteRecordByIdFallback")
    @DeleteMapping("/{id}")
    public String deleteRecordById(@PathVariable Long id) {
        recordRepository.deleteById(id);
        return "Record deleted successfully";
    }

    public String deleteRecordByIdFallback(Long id) {
        return "Fallback: Unable to delete record with id " + id;
    }

    @HystrixCommand(fallbackMethod = "deleteAllRecordsFallback")
    @DeleteMapping("/")
    public String deleteAllRecords() {
        recordRepository.deleteAll();
        return "All records deleted successfully";
    }
    public String deleteAllRecordsFallback() {
    	return "Fallback: Unable to delete all records";
    }
  
}
