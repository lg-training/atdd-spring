package com.lgt.jvm.steps;

import com.lgt.jvm.support.BlankWorld;
import io.cucumber.java.en.Given;


public class GivenStep {

    private final BlankWorld blankWorld;

    public GivenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }

    @Given("some customer details")
    public void someCustomerDetails() {
        blankWorld.setBaseUrl("https://www.google.com");
        System.out.println("some customer details");
    }
}
