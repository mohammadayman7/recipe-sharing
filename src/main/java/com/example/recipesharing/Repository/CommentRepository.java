package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<comment,Long> {
}
