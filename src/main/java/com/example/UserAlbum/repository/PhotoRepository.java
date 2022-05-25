package com.example.UserAlbum.repository;

import com.example.UserAlbum.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo, String> {
    List<Photo> findAllById(String photoID);
}
