package com.example.Clearpay.service;

import com.example.Clearpay.model.User;
import com.example.Clearpay.model.Wallet;
import com.example.Clearpay.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.insert(user);
    }

    public List<Wallet> getWalletsByUser(String userId) {

        return null;
    }

    public void sendMoney(String sendingWalletId, String targetWalletId) {

    }
}
