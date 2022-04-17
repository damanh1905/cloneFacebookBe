package com.example.clonefb.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private long postID;

    private String post;

    private String name;

    private String email;

    private String image;

    private String profilePic;

    private String timeStamp;

    private String imageName;
}
