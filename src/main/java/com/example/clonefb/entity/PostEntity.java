package com.example.clonefb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    @Column
    private String post;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String image;
    @Column
    private String profilePic;
    @Column
    private String timeStamp;
    @Column
    private String imageName;


}
