package com.example.UserAlbum.service;

import com.example.UserAlbum.model.Photo;
import com.example.UserAlbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public Photo savePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public List<Photo> getPhotos() {
        return photoRepository.findAll();
    }

    public Photo updatePhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    public void deletePhoto(String photoID) {
        photoRepository.deleteById(photoID);
    }

    public List<Photo> getById(String photoID) {
        return photoRepository.findAllById(photoID);
    }
}
