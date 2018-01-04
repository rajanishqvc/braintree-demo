package com.qvc.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.braintreegateway.BraintreeGateway;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class BraintreeGatewayConfig {

    @Bean
    public BraintreeGateway braintreeGateway(BraintreeProperties btProps) {
        log.info("btProps = {}", btProps);
        return new BraintreeGateway(btProps.getEnvironment(), btProps.getMerchantId(), btProps.getPublicKey(), btProps.getPrivateKey());
    }
}
