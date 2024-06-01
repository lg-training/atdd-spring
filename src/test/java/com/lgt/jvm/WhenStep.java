package com.lgt.jvm;

import io.cucumber.java.en.When;


public class WhenStep {

    private final BlankWorld blankWorld;

    public WhenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }

    @When("I invoke the create customer operation with the customer details")
    public void iInvokeTheCreateCustomerOperationWithTheCustomerDetails() {
        System.out.println("I invoke the create customer operation with the customer details");
    }
}
