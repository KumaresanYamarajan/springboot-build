package com.learn.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/build")
@Controller
public class TestContoller {
    @GetMapping("/message")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Hello");
    }
}
