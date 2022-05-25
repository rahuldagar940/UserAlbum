package com.example.UserAlbum.resource;

import com.example.UserAlbum.model.Photo;
import com.example.UserAlbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo)
    {
        return photoService.savePhoto(photo);
    }
    @GetMapping
    public List<Photo> getPhotos()
    {
        return photoService.getPhotos();
    }
    @GetMapping("/photoID")
    public List<Photo> getById(@RequestParam(name = "photoID") String photoID )
    {
        return photoService.getById(photoID);
    }
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo)
    {
        return photoService.updatePhoto(photo);
    }
    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "photoID") String photoID)
    {
        photoService.deletePhoto(photoID);
    }
}
