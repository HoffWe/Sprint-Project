package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.ShoppingListDto;
import com.example.sprintproject.model.ShoppingList;

import java.util.stream.Collectors;

public class ShoppingListMapper {

   public static ShoppingListDto mapToDto(ShoppingList shoppingList){
        return ShoppingListDto.builder()
                .name(shoppingList.getName())
                .userId(shoppingList.getUser().getId())
                .shoppingListElements(shoppingList.getShoppingListElements().stream()
                        .map(ShoppingListElementMapper::mapToDto)
                        .collect(Collectors.toSet()))
                .build();

}
}

