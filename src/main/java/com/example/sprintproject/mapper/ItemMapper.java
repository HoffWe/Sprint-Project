package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.ItemDto;
import com.example.sprintproject.model.Item;

public class ItemMapper {

    public static ItemDto mapToDto(Item item){
       return ItemDto.builder()
                .name(item.getName())
                .build();
    }
}
