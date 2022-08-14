package com.nt.rookies.blog.repositories;

import com.nt.rookies.blog.entities.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity, Integer> {
}
