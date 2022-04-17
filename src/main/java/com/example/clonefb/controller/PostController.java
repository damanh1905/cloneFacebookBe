package com.example.clonefb.controller;

import com.example.clonefb.exception.NotfoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PostController {
    @GetMapping("/add")
    public ResponseEntity<?> addPost(@RequestParam String name){
      if(!name.equalsIgnoreCase("a")){
          throw  new NotfoundException("not found name");
      }
      return ResponseEntity.ok(name);
    }
    @GetMapping("/")
    public String index() {
        return "Welcome to user";
    }
}
