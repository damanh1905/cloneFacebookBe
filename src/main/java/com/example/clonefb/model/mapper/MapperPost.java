package com.example.clonefb.model.mapper;

import com.example.clonefb.model.dto.PostDto;
import com.example.clonefb.model.request.CreatePostReq;

public class MapperPost {
    public static PostDto toPostDto( CreatePostReq createPostReq){
        PostDto postDto = new PostDto();
        postDto.setPost(createPostReq.getPost());
        postDto.setEmail(createPostReq.getEmail());
        postDto.setName(createPostReq.getName());
        postDto.setImage(createPostReq.getImage());
        postDto.setProfilePic(createPostReq.getProfilePic());

        return postDto;
    }
}
