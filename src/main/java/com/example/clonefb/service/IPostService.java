package com.example.clonefb.service;

import com.example.clonefb.model.dto.PostDto;

import java.util.List;

public interface IPostService {
    PostDto addPost(PostDto postDto);

    List<PostDto> getListPost();
}
