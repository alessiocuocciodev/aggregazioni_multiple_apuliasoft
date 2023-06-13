package com.example.aggregazioni_multiple_apuliasoft.services;

import com.example.aggregazioni_multiple_apuliasoft.dataLoader.DataLoader;
import com.example.aggregazioni_multiple_apuliasoft.entities.TimeEntry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeEntryServiceImpl implements TimeEntryService{
    @Override
    public List<TimeEntry> findAll() {
        return DataLoader.timeEntryList;
    }
}
