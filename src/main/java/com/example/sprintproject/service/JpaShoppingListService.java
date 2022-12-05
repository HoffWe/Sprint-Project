package com.example.sprintproject.service;

import com.example.sprintproject.dto.ShoppingListDto;
import com.example.sprintproject.model.ShoppingList;
import com.example.sprintproject.model.UserApp;
import com.example.sprintproject.repository.ShoppingListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class JpaShoppingListService implements ShoppingListService{

    private final ShoppingListRepository shoppingListRepository;

    public JpaShoppingListService(ShoppingListRepository shoppingListRepository) {
        this.shoppingListRepository = shoppingListRepository;
    }


    @Override
    public ShoppingList add(ShoppingListDto newShoppingList) {
        ShoppingList shoppingList = ShoppingList.builder()
                .name(newShoppingList.getName())
                .user(UserApp.builder()
                        .id(newShoppingList.getUserId())
                        .build())
                .shoppingListElements(Set.of())
                .build();
        return shoppingListRepository.save(shoppingList);
    }

    @Override
    public List<ShoppingList> findByUserId(long userId) {
        return shoppingListRepository.findByUser_Id(userId);
    }

    @Override
    public Optional<ShoppingList> findById(long id) {
        return shoppingListRepository.findById(id);
    }

    @Override
    public List<ShoppingList> findAll() {
        return shoppingListRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
    shoppingListRepository.deleteById(id);
    }

}
