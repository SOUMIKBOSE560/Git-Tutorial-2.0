package net.gittutorial.gitdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/test1")
    public String test1(){
        return "This is a testing message;";
    }

}
