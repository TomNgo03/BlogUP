package com.nt.rookies.blog.services;

import com.nt.rookies.blog.dtos.Post;
import com.nt.rookies.blog.entities.PostEntity;
import com.nt.rookies.blog.exceptions.NotFoundException;
import com.nt.rookies.blog.mappers.PostMapper;
import com.nt.rookies.blog.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PostService {
    private PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    public List<Post> getAll() {
        return PostMapper.toDtoList(this.repository.findAll());
    }

    public Post getId(Integer id) {
        return PostMapper.toDto( repository.findById(id).orElseThrow(() -> new NotFoundException("Post Id : " + id + " Not Found")));
    }

    public Post addPost(Post post) {
        PostEntity e = repository.save(PostMapper.toEntity(post));
        return PostMapper.toDto(e);
    }

    public int deleteById(Integer id) {
        repository.deleteById(id);
        return id;
    }

}
