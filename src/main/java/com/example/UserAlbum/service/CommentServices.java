package com.example.UserAlbum.service;

import com.example.UserAlbum.model.Comment;
import com.example.UserAlbum.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServices {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String commentID) {
        commentRepository.deleteById(commentID);
    }

    public List<Comment> getById(String commentID) {
        return commentRepository.findAllById(commentID);
    }
}
