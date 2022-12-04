package com.example.sprintproject.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ShoppingListElementDto {


    private long itemId;
    private long quantity;
    private long shoppingListId;
}
