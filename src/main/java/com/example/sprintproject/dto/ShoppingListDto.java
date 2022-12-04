package com.example.sprintproject.dto;

import com.example.sprintproject.model.ShoppingListElement;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

import java.util.Set;


@Data
@Builder
public class ShoppingListDto {


    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long userId;
    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private Set<ShoppingListElement> shoppingListElements;
}
