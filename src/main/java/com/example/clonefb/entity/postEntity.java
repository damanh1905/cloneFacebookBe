package com.example.clonefb.entity;



import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "posts")
public class postEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
