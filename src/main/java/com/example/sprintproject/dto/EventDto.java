package com.example.sprintproject.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
@Builder
public class EventDto {

    @NotNull
    @Length(min = 3, max = 50)
    private String name;
    @NotNull
    private LocalDateTime date;
    @NotNull
    @Length(min = 3, max = 150)
    private String content;
}
