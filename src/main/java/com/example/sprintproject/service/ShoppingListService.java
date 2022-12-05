package com.example.sprintproject.service;

import com.example.sprintproject.dto.ShoppingListDto;
import com.example.sprintproject.model.ShoppingList;

import java.util.List;
import java.util.Optional;


public interface ShoppingListService {

    ShoppingList add(ShoppingListDto newShoppingList);
    List<ShoppingList> findByUserId(long userId);
    Optional<ShoppingList> findById(long id);
    List<ShoppingList> findAll();
    void deleteById(long id);



}
