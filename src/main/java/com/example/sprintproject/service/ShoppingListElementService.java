package com.example.sprintproject.service;

import com.example.sprintproject.dto.ShoppingListElementDto;
import com.example.sprintproject.model.ShoppingListElement;
import java.util.Optional;

public interface ShoppingListElementService {

    ShoppingListElement add (ShoppingListElementDto shoppingListElementDto);
    Optional<ShoppingListElement> findById(long id);
    ShoppingListElement update(ShoppingListElement shoppingListElement);
    void deleteById(long id);

}
