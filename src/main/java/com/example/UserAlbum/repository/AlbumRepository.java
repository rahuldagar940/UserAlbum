package com.example.UserAlbum.repository;

import com.example.UserAlbum.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {
    List<Album> findAllById(String albumID);
}
