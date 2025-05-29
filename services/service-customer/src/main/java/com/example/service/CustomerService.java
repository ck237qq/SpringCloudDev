package com.example.service;

import _event.EventMessage;
import customer_server.customer.AddCustomerInfoDto;

public interface CustomerService {

    EventMessage<String> addCustomerInfo(AddCustomerInfoDto addCustomerInfoDto);

}
