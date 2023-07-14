package com.example.backendredditclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backendredditclone.model.Post;
import com.example.backendredditclone.model.User;
import com.example.backendredditclone.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long>{
	Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
