package com.example.backendredditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendredditclone.model.Post;
import com.example.backendredditclone.model.Subreddit;
import com.example.backendredditclone.model.User;

public interface PostRepository extends JpaRepository<Post, Long>{

	List<Post> findAllBySubreddit(Subreddit subreddit);
	
	List<Post> findByUser(User user);
}
