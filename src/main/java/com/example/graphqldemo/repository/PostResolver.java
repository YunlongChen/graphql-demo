package com.example.graphqldemo.repository;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphqldemo.model.Author;
import com.example.graphqldemo.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostResolver implements GraphQLResolver<Post> {

    public Author getAuthor(Post post) {
        Author author = new Author();
        author.setId("001");
        author.setName("stan");
        post.setText("设置了标题了");
        return author;
    }
}