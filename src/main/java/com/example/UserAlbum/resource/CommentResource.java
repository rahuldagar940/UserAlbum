package com.example.UserAlbum.resource;

import com.example.UserAlbum.model.Comment;
import com.example.UserAlbum.service.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")

public class CommentResource {
    @Autowired
    private CommentServices commentServices;
    @PostMapping
    public Comment saveComment(@RequestBody Comment comment)
    {
        return commentServices.saveComment(comment);
    }
    @GetMapping
    public List<Comment> getAllComments()
    {
        return commentServices.getAllComments();
    }
    @GetMapping("/commentID")
    public List<Comment> getById(@RequestParam(name = "commentID") String commentID)
    {
        return commentServices.getById(commentID);
    }
    @PutMapping
    public Comment updateComment(@RequestBody Comment comment)
    {
        return commentServices.updateComment(comment);
    }
    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentID") String commentID)
    {
        commentServices.deleteComment(commentID);
    }
}
