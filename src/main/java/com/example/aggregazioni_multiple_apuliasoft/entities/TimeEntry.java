package com.example.aggregazioni_multiple_apuliasoft.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeEntry {


    private Integer id;

    private Project project;

    private Employee employee;

    private LocalDateTime date;

    private int hours;
}
