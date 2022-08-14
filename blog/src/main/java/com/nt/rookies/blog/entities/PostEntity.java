package com.nt.rookies.blog.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "posts")
public class PostEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "title", nullable = false)
  private String title;
  @Column(name = "description")
  private String description;
  @Column(name = "content")
  private String content;

  @ManyToOne
  @JoinColumn(name = "author")
  private AuthorEntity author;

  @Column(name = "created_at")
  private LocalDateTime createdAt;
}
