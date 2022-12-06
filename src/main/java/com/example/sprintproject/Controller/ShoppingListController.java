package com.example.sprintproject.Controller;

import com.example.sprintproject.dto.ShoppingListDto;
import com.example.sprintproject.mapper.ShoppingListMapper;
import com.example.sprintproject.model.ShoppingList;
import com.example.sprintproject.service.ShoppingListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/shoppinglist")
public class ShoppingListController {

    private final ShoppingListService shoppingListService;


    public ShoppingListController(ShoppingListService shoppingListService) {
        this.shoppingListService = shoppingListService;
    }

    @PostMapping("")
    public ResponseEntity<ShoppingList> add(@RequestBody ShoppingListDto shoppingListDto){
        return ResponseEntity.ok(shoppingListService.add(shoppingListDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ShoppingListDto> findById(@PathVariable long id){
        Optional<ShoppingList> optionalShoppingList = shoppingListService.findById(id);
        return optionalShoppingList.map(shoppingList -> ResponseEntity
                        .ok(ShoppingListMapper.mapToDto(shoppingList)))
                        .orElseGet(()-> ResponseEntity.of(Optional.empty()));
    }
    @GetMapping("")
    public List<ShoppingListDto> findAll(){
        return shoppingListService.findAll().stream()
                .map(ShoppingListMapper::mapToDto)
                .collect(Collectors.toList());
    }
    @GetMapping("/{userid}")
    public List<ShoppingListDto> findByUserId(@PathVariable long userid){
        return shoppingListService.findByUserId(userid).stream()
                .map(ShoppingListMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        shoppingListService.deleteById(id);
    }
}
