package com.nt.rookies.blog.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Post {
  private Integer id;
  private String title;
  private String description;
  private String content;
  private Author author;
  private LocalDateTime createdAt;
}
