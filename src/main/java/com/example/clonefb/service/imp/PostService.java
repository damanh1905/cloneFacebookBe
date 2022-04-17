package com.example.clonefb.service.imp;

import com.example.clonefb.entity.PostEntity;
import com.example.clonefb.exception.NotfoundException;
import com.example.clonefb.model.dto.PostDto;
import com.example.clonefb.responsitory.PostRespository;
import com.example.clonefb.service.IPostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class PostService implements IPostService {
    @Autowired
    private PostRespository postRespository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public PostDto addPost(PostDto postDto) {
        try {
            PostEntity postEntity = new PostEntity();
            postEntity = this.mapper.map(postDto, PostEntity.class);
            postEntity.setTimeStamp(new Date().toString());
            if (postDto.getImage() != null && !postDto.getImage().equalsIgnoreCase("null")) {
                postEntity.setImage(postDto.getImage());
            } else {
                postEntity.setImage(null);
            }
            postEntity = postRespository.save(postEntity);
            postDto.setPostID(postEntity.getPostID());
        } catch (Exception e) {
            throw new NotfoundException("could not save Post");
        }
        return postDto;
    }

    @Override
    public List<PostDto> getListPost() {
        List<PostEntity> listPostEntity = postRespository.findAll();
        List<PostDto> listPostDto = new ArrayList<>();
        listPostDto = listPostEntity.stream()
                .map((postEntity) ->
                        PostDto.builder()
                                .postID(postEntity.getPostID())
                                .email(postEntity.getEmail())
                                .post(postEntity.getPost())
                                .image(postEntity.getImage())
                                .profilePic(postEntity.getProfilePic())
                                .imageName(postEntity.getImageName())
                                .timeStamp(postEntity.getTimeStamp())
                                .build()
                ).collect(Collectors.toList());
        return  listPostDto;
    }
}
