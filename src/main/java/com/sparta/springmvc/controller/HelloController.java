package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "GET Method Request";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method Request";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method Request";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method Request";
    }
}
