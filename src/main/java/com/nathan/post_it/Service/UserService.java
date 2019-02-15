package com.nathan.post_it.Service;

import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserByUsernameAndPassword(String username, String password){

        return userRepository.findUserByUsernameAndPassword(username, password);
    }
}
