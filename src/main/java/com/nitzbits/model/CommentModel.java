package com.nitzbits.model;

import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "comments")
public class CommentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Integer id;

    @Column(name = "author")
    String author;

    @Column(name = "email")
    String email;
    @Column(name = "comment")
    String comment;

    @Column(name = "post_id")
    Integer postId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPostId() { return postId; }

    public void setPostId(Integer postId) { this.postId = postId; }
}
