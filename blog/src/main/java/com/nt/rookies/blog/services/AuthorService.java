package com.nt.rookies.blog.services;

import com.nt.rookies.blog.dtos.Author;
import com.nt.rookies.blog.dtos.Post;
import com.nt.rookies.blog.exceptions.NotFoundException;
import com.nt.rookies.blog.mappers.AuthorMapper;
import com.nt.rookies.blog.mappers.PostMapper;
import com.nt.rookies.blog.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAll() {
        return AuthorMapper.toDtoList(this.authorRepository.findAll());
    }

    public Author getUsername(String username) {
        return AuthorMapper.toDto( authorRepository.findById(username).orElseThrow(() ->
                new NotFoundException("Author Username : " + username + " Not Found")));
    }


}
