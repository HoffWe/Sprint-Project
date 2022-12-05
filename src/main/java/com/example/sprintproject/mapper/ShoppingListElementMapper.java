package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.ShoppingListElementDto;
import com.example.sprintproject.model.ShoppingListElement;

public class ShoppingListElementMapper {

    public static ShoppingListElementDto mapToDto(ShoppingListElement shoppingListElement){
        return ShoppingListElementDto.builder()
                .itemId(shoppingListElement.getItem().getId())
                .quantity(shoppingListElement.getQuantity())
                .isBought(shoppingListElement.isBought())
                .build();
    }
}
