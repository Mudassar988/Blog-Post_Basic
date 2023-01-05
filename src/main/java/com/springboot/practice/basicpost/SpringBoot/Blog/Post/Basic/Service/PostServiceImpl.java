package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Service;

import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Dto.PostDto;
import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Entity.Post;
import com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements  PostService{

    private PostRepository postRepository;
    public PostServiceImpl(PostRepository postRpository) {
        this.postRepository = postRpository;
    }

    @Override
    public PostDto createPost(PostDto pSvc_Intfc_Create) {
        Post post  = DtoToEntity(pSvc_Intfc_Create);
        Post saved =  postRepository.save(post);
        PostDto  postDto = EntityToDto(saved);
        return  postDto;
    }

    @Override
    public List<PostDto> getAllPosts(PostDto pSrvIntrfcGetAll) {
        Post getAll = new Post();
       List AllPosts =  postRepository.findAll();
       return  AllPosts;
    }





    // conversion from incoming Dto format to Entity type
    public Post DtoToEntity(PostDto postDto) {
        Post post = new Post();
        post.setId(post.getId());
        post.setTitle(post.getTitle());
        post.setContent(post.getContent());
        return  post;
    }

    // conversion of entity format to Dto format
    public  PostDto EntityToDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        return  postDto;
    }
}
