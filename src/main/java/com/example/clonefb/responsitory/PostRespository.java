package com.example.clonefb.responsitory;

import com.example.clonefb.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRespository  extends JpaRepository<PostEntity,Long> {
}
