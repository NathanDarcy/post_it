package com.nathan.post_it;

import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostItApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUserDB() {
        User testUser = userRepository.findUserByUsernameAndPassword("testUsername", "testPassword");

        System.out.println("User: " + testUser.getUsername() + testUser.getPassword());
    }

}

