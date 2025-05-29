package com.example.service.impl;

import _event.EventMessage;
import com.example.service.CustomerService;
import customer_server.customer.AddCustomerInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import utils.EventUtil;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {


    public EventMessage<String> addCustomerInfo(AddCustomerInfoDto addCustomerInfoDto){
        log.info("AddCustomerInfo，參數為: {}",addCustomerInfoDto);

        return EventUtil.setDefaultEventMessage("執行完成");
    }

}
