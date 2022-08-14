package com.nt.rookies.blog.controllers;

import com.nt.rookies.blog.dtos.Author;
import com.nt.rookies.blog.dtos.PongMessage;
import com.nt.rookies.blog.services.AuthorService;
import com.nt.rookies.blog.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorService authorService;
    public AuthorController(AuthorService service) {
        this.authorService = Objects.requireNonNull(service);
    }


    @GetMapping("/")
    public ResponseEntity getAllAuthor() {
        return new ResponseEntity<>(authorService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity getByUsername(@PathVariable String username) {
        return new ResponseEntity<>(authorService.getUsername(username), HttpStatus.OK);
    }
}
