package com.example.UserAlbum.service;

import com.example.UserAlbum.model.Album;
import com.example.UserAlbum.model.User;
import com.example.UserAlbum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User saveUser( User user)
    {
        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(String userID)
    {
        userRepository.deleteById(userID);
    }

    public List<User> getById(String userID) {
        return userRepository.findAllById(userID);
    }

}
