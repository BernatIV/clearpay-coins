package com.example.Clearpay.controller;

import com.example.Clearpay.model.User;
import com.example.Clearpay.model.Wallet;
import com.example.Clearpay.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public List<Wallet> getWalletsByUser(String userId) {

        return null;
    }

    @PutMapping
    public void sendMoney(String sendingWalletId, String targetWalletId) {

    }
}
