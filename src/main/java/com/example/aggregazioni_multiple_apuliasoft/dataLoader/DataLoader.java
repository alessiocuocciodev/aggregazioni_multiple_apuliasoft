package com.example.aggregazioni_multiple_apuliasoft.dataLoader;

import com.example.aggregazioni_multiple_apuliasoft.entities.Employee;
import com.example.aggregazioni_multiple_apuliasoft.entities.Project;
import com.example.aggregazioni_multiple_apuliasoft.entities.TimeEntry;
import com.example.aggregazioni_multiple_apuliasoft.utilities.Utility;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {

    public static Employee mario = Employee.builder().id(1).name("Mario").build();
    public static Employee giovanni = Employee.builder().id(2).name("Giovanni").build();
    public static Employee lucia = Employee.builder().id(3).name("Lucia").build();


    public static Project rover = Project.builder().id(1).name("Mars Rover").build();
    public static Project manhattan = Project.builder().id(2).name("Manhattan").build();


    public static TimeEntry timeEntry1 = TimeEntry.builder().id(1).project(rover).employee(mario).date(Utility.fromStringToLocalDateTime("2021-08-26 22:00:00")).hours(5).build();
    public static TimeEntry timeEntry2 = TimeEntry.builder().id(2).project(manhattan).employee(giovanni).date(Utility.fromStringToLocalDateTime("2021-08-30 22:00:00")).hours(3).build();
    public static TimeEntry timeEntry3 = TimeEntry.builder().id(3).project(rover).employee(mario).date(Utility.fromStringToLocalDateTime("2021-08-31 22:00:00")).hours(3).build();
    public static TimeEntry timeEntry4 = TimeEntry.builder().id(4).project(rover).employee(lucia).date(Utility.fromStringToLocalDateTime("2021-08-31 22:00:00")).hours(3).build();
    public static TimeEntry timeEntry5 = TimeEntry.builder().id(5).project(manhattan).employee(mario).date(Utility.fromStringToLocalDateTime("2021-08-26 22:00:00")).hours(2).build();
    public static TimeEntry timeEntry6 = TimeEntry.builder().id(6).project(manhattan).employee(giovanni).date(Utility.fromStringToLocalDateTime("2021-08-31 22:00:00")).hours(4).build();
    public static List<TimeEntry> timeEntryList = List.of(timeEntry1, timeEntry2, timeEntry3, timeEntry4, timeEntry5, timeEntry6);

}
