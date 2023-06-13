package com.example.aggregazioni_multiple_apuliasoft.services;

import com.example.aggregazioni_multiple_apuliasoft.dataLoader.DataLoader;
import com.example.aggregazioni_multiple_apuliasoft.entities.TimeEntry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TimeEntryServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        // Creare un'istanza del servizio
        TimeEntryServiceImpl timeEntryService = new TimeEntryServiceImpl();

        // Chiamare il metodo findAll()
        List<TimeEntry> result = timeEntryService.findAll();

        // Verificare che il risultato non sia nullo
        assertNotNull(result);

        // Verificare che il numero di elementi nel risultato corrisponda al numero di elementi in DataLoader.timeEntryList
        assertEquals(DataLoader.timeEntryList.size(), result.size());

        // Verificare che gli elementi nel risultato siano gli stessi presenti in DataLoader.timeEntryList
        assertTrue(result.containsAll(DataLoader.timeEntryList));
    }
}