package com.example.sprintproject.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data
@Builder
public class TaskDto {


    @NotNull
    @Length(min = 2, max = 100)
    private String title;
    @NotNull
    @Length(min = 2, max = 500)
    private String content;
    @NotNull
    private LocalDateTime creationDate;
    @NotNull
    private LocalDateTime deadline;
    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long userid;

}
