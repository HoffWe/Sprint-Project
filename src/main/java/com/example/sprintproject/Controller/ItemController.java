package com.example.sprintproject.Controller;


import com.example.sprintproject.dto.ItemDto;
import com.example.sprintproject.mapper.ItemMapper;
import com.example.sprintproject.model.Item;
import com.example.sprintproject.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("")
    public ResponseEntity<Item> add(@RequestBody ItemDto itemDto){
        return ResponseEntity.ok(itemService.add(itemDto));
    }
    @GetMapping("")
    public List<ItemDto> findAll(){
        return itemService.findAll().stream()
                .map(ItemMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        itemService.deleteById(id);
    }

}
