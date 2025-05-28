package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {


    @GetMapping("/findCustomer")
    public void findCustomer() {
        System.out.println("findCustomer");
    }

}
