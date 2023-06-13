package com.example.aggregazioni_multiple_apuliasoft.repositories;

import com.example.aggregazioni_multiple_apuliasoft.entities.TimeEntry;

import java.util.List;

public interface TimeEntryRepository {

    List<TimeEntry> findAll();
}
