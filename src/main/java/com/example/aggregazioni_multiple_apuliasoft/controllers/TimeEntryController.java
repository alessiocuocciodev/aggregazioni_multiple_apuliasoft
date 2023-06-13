package com.example.aggregazioni_multiple_apuliasoft.controllers;

import com.example.aggregazioni_multiple_apuliasoft.entities.TimeEntry;
import com.example.aggregazioni_multiple_apuliasoft.services.TimeEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TimeEntryController {

    @Autowired
    TimeEntryService timeEntryService;

    @CrossOrigin
    @GetMapping("/getListOfTimeEntries")
    public ResponseEntity<List<TimeEntry>> getAllTimeEntries() {
        return ResponseEntity.ok(timeEntryService.findAll());
    }
}
