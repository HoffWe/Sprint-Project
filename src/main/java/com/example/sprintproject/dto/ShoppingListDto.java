package com.example.sprintproject.dto;

import com.example.sprintproject.model.ShoppingListElement;
import com.example.sprintproject.model.UserApp;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;


@Data
@Builder
public class ShoppingListDto {


    @ManyToOne(targetEntity = UserApp.class)
    private long userId;
    private Set<ShoppingListElement> shoppingListElements;
}
