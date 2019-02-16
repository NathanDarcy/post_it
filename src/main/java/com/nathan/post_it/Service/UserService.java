package com.nathan.post_it.Service;

import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserByUsername(String username){
        return userRepository.findUserByUsername(username);
    }
}
