package com.nt.rookies.blog.mappers;

import com.nt.rookies.blog.dtos.Post;
import com.nt.rookies.blog.entities.PostEntity;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PostMapper {

  public static Post toDto(PostEntity entity) {
    Post post = new Post();
    post.setId(entity.getId());
    post.setContent(entity.getContent());
    post.setDescription(entity.getDescription());
    post.setTitle(entity.getTitle());
    post.setCreatedAt(entity.getCreatedAt());
    post.setAuthor(AuthorMapper.toDto(entity.getAuthor()));
    return post;
  }

  public static List<Post> toDtoList(List<PostEntity> entities) {
    return entities.stream().map(PostMapper::toDto).collect(Collectors.toList());
  }

  public static List<Post> toDtoList(Iterable<PostEntity> entities) {
    List<Post> posts = new LinkedList<>();
    entities.forEach( e -> posts.add(toDto(e)));
    return posts;
  }

  public static PostEntity toEntity(Post post) {
    PostEntity postEntity = new PostEntity();
    postEntity.setId(post.getId());
    postEntity.setContent(post.getContent());
    postEntity.setDescription(post.getDescription());
    postEntity.setTitle(post.getTitle());
    postEntity.setCreatedAt(post.getCreatedAt());
    postEntity.setAuthor(AuthorMapper.toEntity(post.getAuthor()));
    return postEntity;
  }

}
