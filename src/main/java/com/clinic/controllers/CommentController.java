package com.clinic.controllers;


import com.clinic.models.Comment;
import com.clinic.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @CrossOrigin
    @RequestMapping( method = RequestMethod.GET)
    public List<Comment> getAll(){
        return commentService.findAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Comment getOne(@PathVariable long id){
        return commentService.findOne(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        commentService.delete(id);
    }

    @CrossOrigin
    @RequestMapping( method = RequestMethod.PUT)
    public void save(@RequestBody Comment comment){
        commentService.save(comment);
    }
}
