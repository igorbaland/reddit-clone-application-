package com.example.backendredditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendredditclone.model.Comment;
import com.example.backendredditclone.model.Post;
import com.example.backendredditclone.model.User;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByPost(Post post);
	
	List<Comment> findAllByUser(User user);
}
