package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

import entity.user;
import repository.userRepository;

@Controller
public class userController {
    
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    private userRepository repo;
    
    @GetMapping("/signin")
    public String login() {
        return "login";
    }
    
    @GetMapping("/register")
    public String signup(Model model) {
        model.addAttribute("user", new user());
        return "register";
    }
}
