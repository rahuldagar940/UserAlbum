package com.example.UserAlbum.resource;

import com.example.UserAlbum.model.Album;
import com.example.UserAlbum.service.AlbumService;
import com.example.UserAlbum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {
    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody Album album)
    {
        return albumService.saveAlbum(album);
    }
    @GetMapping
    public List<Album> getAllAlbum()
    {
        return albumService.getAllAlbum();
    }
    @GetMapping("/albumID")
    public List<Album> getById(@RequestParam(name = "albumID") String albumID)
    {
        return albumService.getByID(albumID);
    }
    @PutMapping
    public Album updateAlbum(@RequestBody Album album)
    {
        return albumService.updateAlbum(album);
    }
    @DeleteMapping
    public void deleteAlbum(@RequestParam(name="albumID") String albumID)
    {
        albumService.deleteAlbum(albumID);
    }
}
