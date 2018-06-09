package com.clinic.service;

import com.clinic.models.Comment;
import com.clinic.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment findOne(Long id){
        return commentRepository.findOne(id);
    }
    public List<Comment> findAll(){
        return commentRepository.findAll();
    }
    public void save(Comment comment){
        commentRepository.save(comment);
    }
    public void delete(Long id){
        commentRepository.delete(id);
    }
}
