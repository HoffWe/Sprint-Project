package com.example.sprintproject.Controller;

import com.example.sprintproject.dto.UserAppDto;
import com.example.sprintproject.model.UserApp;
import com.example.sprintproject.service.UserAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserAppController {

    private final UserAppService userAppService;

    public UserAppController(UserAppService userAppService) {
        this.userAppService = userAppService;
    }

    @PostMapping("")
    public ResponseEntity<UserApp> add(@RequestBody UserAppDto userAppDto){
        return ResponseEntity.ok(userAppService.add(userAppDto));
    }

    @GetMapping("")
    public List<UserApp> findAll(){
        return new ArrayList<>(userAppService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserApp>> findById(@PathVariable long id){
        Optional<UserApp> optionalUserApp = userAppService.findById(id);
        return optionalUserApp.map(userApp -> ResponseEntity.ok(optionalUserApp))
                .orElseGet(()->ResponseEntity.of(Optional.empty()));
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        userAppService.deleteById(id);
    }

    @PutMapping("")
    public ResponseEntity<UserApp> update(@RequestBody UserApp userApp) {
        if (userAppService.findById(userApp.getId()).isPresent())
            return ResponseEntity.ok(userAppService.update(userApp));
        else
            return ResponseEntity.status(HttpStatus.CREATED).body(userAppService.update(userApp));
    }

}
