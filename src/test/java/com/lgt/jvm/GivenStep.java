package com.lgt.jvm;

import io.cucumber.java.en.Given;


public class GivenStep {

    private final BlankWorld blankWorld;

    public GivenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }


    public void someCustomerDetails() {
        blankWorld.setBaseUrl("https://www.google.com");
        System.out.println("some customer details");
    }
}
