package com.narendra.xml;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value="/tutorials/", produces= MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Customer> getTutorialById(@RequestBody Customer customer) {

        System.out.println("Country "+ customer.getCountry());
        System.out.println("Number "+ customer.getCustNo());
        System.out.println("Name "+ customer.getName());
        return null;
    }
}
