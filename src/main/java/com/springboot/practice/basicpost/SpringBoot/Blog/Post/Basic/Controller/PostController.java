package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Controller;

import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Dto.PostDto;
import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    public PostService postService;
                                                            // no need to write @Autowired her  since having only inne constructor
   public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping("/api/create")                     //  link:     http://localhost:8080/api/create
    public ResponseEntity<PostDto> create( @RequestBody PostDto createRequest) {
        return  new ResponseEntity<>(postService.createPost(createRequest), HttpStatus.CREATED);
    }

    @GetMapping("api/getAll")                      //      http://localhost:8080/api/getAll
    public  ResponseEntity<List<PostDto>> getAllPosts(@RequestBody PostDto getAllRequest) {
        return  new ResponseEntity<>(postService.getAllPosts(getAllRequest), HttpStatus.OK);
    }
}
