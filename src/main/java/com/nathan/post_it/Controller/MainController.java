package com.nathan.post_it.Controller;

import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Repository.UserRepository;
import com.nathan.post_it.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String test(){
        return "index";
    }
}
