package com.example.sprintproject.dto;

import lombok.Builder;
import lombok.Data;


import java.time.LocalDate;

@Builder
@Data
public class EventDtoOut {


    private long id;
    private String name;
    private LocalDate date;
    private String content;
    private String userName;
}
