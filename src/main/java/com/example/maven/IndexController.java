package com.example.maven;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements IndexRepository{

    @Override
    public void printMessage(String message) {
        message = "New message";
        System.out.println(message);
    }
}
