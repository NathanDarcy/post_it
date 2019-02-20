package com.nathan.post_it;

import com.nathan.post_it.Entity.Discussion;
import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Service.DiscussionService;
import com.nathan.post_it.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostItApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private DiscussionService discussionService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void contextLoads() {
    }

    @Test
    public void retrieveUserByUsername() {

        User testUser = userService.findUserByUsername("testUsername");

        // Check if user entered password ("testPassword") matches hash stored in DB (in testUser Object)
        assert (bCryptPasswordEncoder.matches("testPassword", testUser.getPassword()));
    }

    @Test
    public void testFetchAllDiscussions(){

        Iterable<Discussion> discussions = discussionService.findall();
        assertNotNull("Discussion list populated", discussions );

    }



}

