package com.example.clonefb.controller;

import com.example.clonefb.model.dto.PostDto;
import com.example.clonefb.model.mapper.MapperPost;
import com.example.clonefb.model.request.CreatePostReq;
import com.example.clonefb.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PostController {
    @Autowired
    IPostService postService;

    @PostMapping("/addPost")
    public ResponseEntity<PostDto> addPost(@RequestBody CreatePostReq createPostReq) {
        PostDto postDto = MapperPost.toPostDto(createPostReq);
        postDto = postService.addPost(postDto);
        return ResponseEntity.ok(postDto);

    }

    @GetMapping("/")
    public String index() {
        return "Welcome to user";
    }
    @GetMapping("/getListPost")
    public ResponseEntity<List<PostDto>> getAllPost(){
         List<PostDto> listPost =  postService.getListPost();
        return ResponseEntity.ok(listPost);
    }
}
