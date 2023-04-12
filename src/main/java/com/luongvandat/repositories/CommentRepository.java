package com.luongvandat.repositories;

import com.luongvandat.entities.Category;
import com.luongvandat.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
}