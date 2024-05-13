package net.gittutorial.gitdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/test1")
    public String test1(){
        return "This is a testing message";
    }

    @GetMapping("/test2")
    public String test2(){
        return "2nd commit in main branch";
    }

    @GetMapping("/test3")
    public String test3(){
        return "3rd commit in main branch";
    }

    @GetMapping("/test4")
    public  String test4(){
        return "2nd commit on feature-1 branch";
    }

    @GetMapping("/test5")
    public  String test5(){
        return "3rd commit on feature-1 branch";
    }
}
