package com.hobbycircle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HobbyCircle {
    @GetMapping("/hello")
    public String sayHello(Model model){
                return "home";
    }
}
