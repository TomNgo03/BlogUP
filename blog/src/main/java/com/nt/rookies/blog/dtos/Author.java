package com.nt.rookies.blog.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Author {
  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private LocalDate birthDate;
  private LocalDateTime createdAt;
}
