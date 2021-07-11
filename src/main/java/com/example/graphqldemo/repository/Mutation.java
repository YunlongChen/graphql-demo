package com.example.graphqldemo.repository;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqldemo.model.Post;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class Mutation implements GraphQLMutationResolver {

    public Post writePost(String title, String text, String category) {
//        return postDao.savePost(title, text, category);
        return new Post();
    }
}
