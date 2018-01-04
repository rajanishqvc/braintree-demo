package com.qvc.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("bt")
@Data
public class BraintreeProperties {
    private String environment;
    private String merchantId;
    private String publicKey;
    private String privateKey;
}
