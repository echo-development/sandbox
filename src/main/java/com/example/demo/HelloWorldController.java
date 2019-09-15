package com.example.demo;

import com.example.demo.models.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    @ResponseBody
    public String sayHello() {
        return "Hello world";
    }

}
