package com.example.sprintproject.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Data
@Builder
public class EventDto {

    @NotNull
    @Length(min = 3, max = 50)
    private String name;
    @NotNull
    private LocalDate date;
    @NotNull
    @Length(min = 3, max = 150)
    private String content;
    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long userId;
}
