package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException {

    private HttpStatus status;
    private  String message;

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BlogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
