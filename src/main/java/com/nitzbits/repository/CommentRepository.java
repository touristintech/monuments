package com.nitzbits.repository;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.nitzbits.model.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel, Integer> {
    List<CommentModel> getCommentsByPostId(Integer id);
}
