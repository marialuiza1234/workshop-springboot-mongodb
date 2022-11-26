package com.luizamaria.cursojava.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luizamaria.cursojava.domain.Post;
import com.luizamaria.cursojava.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}
