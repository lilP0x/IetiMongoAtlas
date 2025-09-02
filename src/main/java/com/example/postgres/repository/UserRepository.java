package com.example.postgres.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.postgres.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
