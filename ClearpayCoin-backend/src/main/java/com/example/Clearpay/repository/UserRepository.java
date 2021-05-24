package com.example.Clearpay.repository;

import com.example.Clearpay.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
