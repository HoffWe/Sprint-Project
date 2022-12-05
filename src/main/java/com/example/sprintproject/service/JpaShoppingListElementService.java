package com.example.sprintproject.service;

import com.example.sprintproject.dto.ShoppingListElementDto;
import com.example.sprintproject.model.Item;
import com.example.sprintproject.model.ShoppingListElement;
import com.example.sprintproject.repository.ShoppingListElementRepository;

import java.util.Optional;

public class JpaShoppingListElementService implements ShoppingListElementService{

    private final ShoppingListElementRepository shoppingListElementRepository;

    public JpaShoppingListElementService(ShoppingListElementRepository shoppingListElementRepository) {
        this.shoppingListElementRepository = shoppingListElementRepository;
    }

    @Override
    public ShoppingListElement add(ShoppingListElementDto shoppingListElementDto) {
      ShoppingListElement shoppingListElement = ShoppingListElement.builder()
              .item(Item.builder()
                      .id(shoppingListElementDto.getItemId())
                      .build())
              .quantity(shoppingListElementDto.getQuantity())
              .isBought(false)
              .build();
        return shoppingListElementRepository.save(shoppingListElement);
    }

    @Override
    public Optional<ShoppingListElement> findById(long id) {
        return shoppingListElementRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
    shoppingListElementRepository.deleteById(id);
    }
}
