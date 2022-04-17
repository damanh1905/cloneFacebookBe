package com.example.clonefb.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreatePostReq {
    private String post;

    private String name;

    private String email;

    private String image;

    private String profilePic;

}
