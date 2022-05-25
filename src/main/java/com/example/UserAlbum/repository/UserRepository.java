package com.example.UserAlbum.repository;

import com.example.UserAlbum.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllById(String userID);

    }
