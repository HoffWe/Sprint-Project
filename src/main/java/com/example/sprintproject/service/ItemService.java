package com.example.sprintproject.service;

import com.example.sprintproject.dto.ItemDto;
import com.example.sprintproject.model.Item;

import java.util.List;

public interface ItemService {
    Item add(ItemDto itemDto);
    List<Item> findAll();
    void deleteById(long id);




}
