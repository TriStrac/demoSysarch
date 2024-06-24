package com.busal.demo.repository;

import java.util.List;

import com.busal.demo.model.Post;

public interface SearchRepository{
    
    List<Post> findByText(String text);
}