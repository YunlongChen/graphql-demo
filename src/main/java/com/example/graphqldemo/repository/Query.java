package com.example.graphqldemo.repository;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqldemo.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class Query implements GraphQLQueryResolver {

    public List<Post> getRecentPosts(int count, int offset) {
        Post post = new Post();
        post.setId("1");
        post.setTitle("标题");
        post.setAuthorId("123");
        post.setCategory("123");
        return Collections.singletonList(post);
    }
}