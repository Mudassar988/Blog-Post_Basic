package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Service;

import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Dto.PostDto;

import java.util.List;

// interfacce which contains onnly methods that are declared 

public interface PostService {

    PostDto createPost(PostDto pSvc_Intfc_Create);

    List<PostDto> getAllPosts(PostDto pSrvIntrfcGetAll);
}
