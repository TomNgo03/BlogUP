package com.nt.rookies.blog.repositories;

import com.nt.rookies.blog.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<AuthorEntity, String> {
}
