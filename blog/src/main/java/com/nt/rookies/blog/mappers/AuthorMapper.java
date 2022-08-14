package com.nt.rookies.blog.mappers;

import com.nt.rookies.blog.dtos.Author;
import com.nt.rookies.blog.dtos.Post;
import com.nt.rookies.blog.entities.AuthorEntity;
import com.nt.rookies.blog.entities.PostEntity;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthorMapper {
  public static Author toDto(AuthorEntity entity) {
    Author author = new Author();
    author.setUsername(entity.getUsername());
    author.setEmail(entity.getEmail());
    author.setFirstName(entity.getFirstName());
    author.setLastName(entity.getLastName());
    author.setBirthDate(entity.getBirthDate());
    author.setCreatedAt(entity.getCreatedAt());
    return author;
  }

  public static List<Author> toDtoList(List<AuthorEntity> entities) {
    return entities.stream().map(AuthorMapper::toDto).collect(Collectors.toList());
  }

  public static List<Author> toDtoList(Iterable<AuthorEntity> entities) {
    List<Author> posts = new LinkedList<>();
    entities.forEach( e -> posts.add(toDto(e)));
    return posts;
  }

  public static AuthorEntity toEntity(Author author) {
    AuthorEntity authorEntity = new AuthorEntity();
    authorEntity.setUsername(author.getUsername());
    authorEntity.setEmail(author.getEmail());
    authorEntity.setFirstName(author.getFirstName());
    authorEntity.setLastName(author.getLastName());
    authorEntity.setBirthDate(author.getBirthDate());
    authorEntity.setCreatedAt(author.getCreatedAt());
    return authorEntity;
  }
}
