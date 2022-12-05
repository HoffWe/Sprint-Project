package com.example.sprintproject.repository;

import com.example.sprintproject.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingListRepository extends JpaRepository<ShoppingList,Long> {

    List<ShoppingList> findByUser_Id(long userId);
}
