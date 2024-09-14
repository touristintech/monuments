package com.nitzbits.controller;

import com.nitzbits.model.CommentModel;
import com.nitzbits.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<CommentModel> getAllComments(){
        return commentService.getAllComment();

    }

    @GetMapping("/comments/{postId}")
    public List<CommentModel> getCommentsByPost(@PathVariable("postId") Integer postId){
        return commentService.getAllCommentsOfPostId(postId);
    }

    @PostMapping("/comments")
    public String postComments(@RequestBody CommentModel commentModel){
        commentService.saveComment(commentModel);
        return "Comment Added...";
    }

}
