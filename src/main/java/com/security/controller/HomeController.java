package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    // http://localhost:9190/public/login       no password required for acesing this end point

    @GetMapping("/home")
    public String home(){
        return "Hey there.....Its your newly home page..->";
    }

    @GetMapping("/login")
    public String login(){
        return "Hey there.....Its your newly login page..->";
    }

    @GetMapping("/register")
    public String register(){
        return "Hey there.....Its your newly register page..->";
    }
}
