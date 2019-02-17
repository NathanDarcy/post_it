package com.nathan.post_it.Controller;

import com.nathan.post_it.Entity.Discussion;
import com.nathan.post_it.Entity.User;
import com.nathan.post_it.Repository.UserRepository;
import com.nathan.post_it.Service.DiscussionService;
import com.nathan.post_it.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscussionService discussionService;

    @RequestMapping({"/", "", "/home"})
    public ModelAndView home(){
        return new ModelAndView("index");
    }

    @RequestMapping("/list")
    public ModelAndView list(Model model){
        Iterable<Discussion> discussions = discussionService.findall();


        model.addAttribute("discussions", discussions);
        return new ModelAndView("list");
    }
}
