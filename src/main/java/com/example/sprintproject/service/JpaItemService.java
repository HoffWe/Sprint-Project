package com.example.sprintproject.service;

import com.example.sprintproject.dto.ItemDto;
import com.example.sprintproject.model.Item;
import com.example.sprintproject.repository.ItemRepository;

import java.util.List;

public class JpaItemService implements ItemService{

    private final ItemRepository itemRepository;

    public JpaItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item add(ItemDto itemDto) {
        final Item item = Item.builder()
                .name(itemDto.getName())
                .build();
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
    itemRepository.deleteById(id);
    }
}
