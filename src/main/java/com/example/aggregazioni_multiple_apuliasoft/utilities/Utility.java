package com.example.aggregazioni_multiple_apuliasoft.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utility {

    public static LocalDateTime fromStringToLocalDateTime(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(date, formatter);
    }
}
