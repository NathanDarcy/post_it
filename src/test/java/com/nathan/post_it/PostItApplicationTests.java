package com.nathan.post_it;

import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostItApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void contextLoads() {
    }

    @Test
    public void retrieveUser(){
        User testUser = userService.findUserByUsername("testUsername");

        // Check if user entered password ("testPassword") matches hash stored in DB
        if (bCryptPasswordEncoder.matches("testPassword", testUser.getPassword())){
            System.out.println("Username/Password pair found");
        }
        else {
            System.out.println("Password did not match");
        }
    }

    @Test
    public void testBCrypt(){

        String plain = "testPassword";
        String encoded = bCryptPasswordEncoder.encode(plain); //$2a$10$nCdnBnsHuIo7rrkXBdqdeOKClCdJFSwcREbyDbZc.s7P2mP/puLAO

        System.out.println("input : hash =" + plain + " : " + encoded);

    }

}

