package com.nitzbits.service;

import com.nitzbits.model.CommentModel;
import com.nitzbits.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    private static final String PIC_PATH = "E:\\MyApp\\pics";

    @Autowired
    private CommentRepository commentRepository;

    public List<CommentModel> getAllComment(){
        List<CommentModel> commentList = new ArrayList<>();
        commentList = commentRepository.findAll();
        return commentList;
    }

    public List<CommentModel> getAllCommentsOfPostId(Integer postId){
        List<CommentModel> postCommentList = new ArrayList<>();
        postCommentList = commentRepository.getCommentsByPostId(postId);
        return postCommentList;
    }

//    public void saveFile(MyFile mf){
//        mf.fileLocation = PIC_PATH+mf.name;
//    }

    public void saveComment(CommentModel comment){
        commentRepository.save(comment);
    }
}
