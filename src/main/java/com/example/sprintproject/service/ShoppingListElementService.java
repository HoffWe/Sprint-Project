package com.example.sprintproject.service;

import com.example.sprintproject.dto.ShoppingListElementDto;
import com.example.sprintproject.model.ShoppingListElement;

import java.util.List;
import java.util.Optional;

public interface ShoppingListElementService {

    ShoppingListElement add (ShoppingListElementDto shoppingListElementDto);
    Optional<ShoppingListElement> findById(long id);
    void deleteById(long id);

}
