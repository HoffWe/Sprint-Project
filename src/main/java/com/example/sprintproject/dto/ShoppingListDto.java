package com.example.sprintproject.dto;

import com.example.sprintproject.model.ShoppingListElement;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Set;


@Data
@Builder
public class ShoppingListDto {

    @NotNull
    @Length (min = 3, max = 50)
    private String name;
    @NotNull
    @Pattern(regexp = " [1-9][0-9]*|0")
    private long userId;
    private Set<ShoppingListElementDto> shoppingListElements;

}
