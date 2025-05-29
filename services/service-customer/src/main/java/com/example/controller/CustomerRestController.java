package com.example.controller;


import _event.EventMessage;
import com.example.service.CustomerService;
import customer_server.customer.AddCustomerInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/customerInfo")
//@CrossOrigin(origins = {"*"})
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/findCustomer")
    public void findCustomer() {
        System.out.println("findCustomer");
    }


    @PostMapping("/addCustomerInfo")
    public EventMessage<String> addCustomerInfo(@RequestBody AddCustomerInfoDto addCustomerInfoDto) {
        return customerService.addCustomerInfo(addCustomerInfoDto);
    }

}
