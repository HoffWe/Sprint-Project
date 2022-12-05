package com.example.sprintproject.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ShoppingListElementDto {

    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long itemId;
    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long quantity;
    private boolean isBought;
}
