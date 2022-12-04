package com.example.sprintproject.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDto {

    @NotNull
    @Pattern(regexp = "[A-Za-z0-9'.\\-\\s,]")
    private String name;
}
