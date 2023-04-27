package com.softmaxsolutionsjenkinsdemo.softmaxsolutionsjenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeConroller {

    @GetMapping("/welcome")
    public String homepage(){
        return "Hi all! \n Welcome to the SoftMAX solution!";
    }


}
