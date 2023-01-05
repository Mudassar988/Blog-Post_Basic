package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Dto;

import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
@ResponseBody
public class PostDto {

    private  long id;
    private  String title;
    private  String content;

}
