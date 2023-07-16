package com.org.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public String getUser(Principal user , Model model) {
        model.addAttribute("user",user);
        System.out.println(user.getName());
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        System.out.println("redirecting to dashboard");
        return "dashboard";
    }
}
