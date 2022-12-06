package com.example.sprintproject.Controller;


import com.example.sprintproject.dto.ShoppingListElementDto;
import com.example.sprintproject.mapper.ShoppingListElementMapper;
import com.example.sprintproject.model.ShoppingListElement;
import com.example.sprintproject.service.ShoppingListElementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/shoppinglistelement")
public class ShoppingListElementController {

    private final ShoppingListElementService shoppingListElementService;

    public ShoppingListElementController(ShoppingListElementService shoppingListElementService) {
        this.shoppingListElementService = shoppingListElementService;
    }

    public ResponseEntity<ShoppingListElement> add(@RequestBody ShoppingListElementDto shoppingListElementDto){
        return ResponseEntity.ok(shoppingListElementService.add(shoppingListElementDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShoppingListElementDto> findById(@PathVariable long id) {
        Optional<ShoppingListElement> optionalShoppingListElement = shoppingListElementService.findById(id);
        return optionalShoppingListElement.map(shoppingListElement -> ResponseEntity.ok
                (ShoppingListElementMapper.mapToDto(shoppingListElement)))
                .orElseGet(() -> ResponseEntity.of(Optional.empty()));
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable long id){
        shoppingListElementService.deleteById(id);
    }
}
