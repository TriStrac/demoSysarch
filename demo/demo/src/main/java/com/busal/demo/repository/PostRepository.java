package com.busal.demo.repository;


import com.busal.demo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post,String>{
    
}
