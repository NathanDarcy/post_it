package com.nathan.post_it.Repository;

import com.nathan.post_it.Entity.Discussion;
import org.springframework.data.repository.CrudRepository;

public interface DiscussionRepository extends CrudRepository<Discussion, Long> {
    Iterable<Discussion> findAll();
}
