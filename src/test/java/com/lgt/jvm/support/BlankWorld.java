package com.lgt.jvm.support;


import org.springframework.stereotype.Component;

@Component
public class BlankWorld {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
