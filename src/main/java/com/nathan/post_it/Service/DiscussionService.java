package com.nathan.post_it.Service;

import com.nathan.post_it.Entity.Discussion;
import com.nathan.post_it.Repository.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public Iterable<Discussion> findall(){
        return discussionRepository.findAll();
    }
}
