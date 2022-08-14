package com.nt.rookies.blog.controllers;

import com.nt.rookies.blog.dtos.Post;
import com.nt.rookies.blog.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("posts")
public class PostController {
  private PostService service;
  public PostController(PostService service) {
    this.service = Objects.requireNonNull(service);
  }

  @GetMapping("/")
  public ResponseEntity<List<Post>> getAll() {
    return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Post> getById(@PathVariable Integer id) {
    return new ResponseEntity<>(service.getId(id), HttpStatus.OK);
  }

  @PostMapping("/")
  public ResponseEntity<Post> addPost(@RequestBody Post post) {
    return new ResponseEntity<>(service.addPost(post), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Integer> deleteById(@PathVariable Integer id) {
    return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
  }
}
