package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Repository;

import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
