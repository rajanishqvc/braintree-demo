package com.qvc.demo;

import com.braintreegateway.BraintreeGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientTokenController {

    @Autowired
    private BraintreeGateway gateway;

    @CrossOrigin(origins = "*")
    @RequestMapping("/client_token")
    public String getToken() {
        return gateway.clientToken().generate() + "\n";
    }
}
