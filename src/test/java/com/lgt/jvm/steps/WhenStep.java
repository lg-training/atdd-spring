package com.lgt.jvm.steps;

import com.lgt.jvm.support.BlankWorld;
import io.cucumber.java.en.When;

import static java.lang.Thread.sleep;


public class WhenStep {

    private final BlankWorld blankWorld;

    public WhenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }

    @When("I invoke the create customer operation with the customer details")
    public void iInvokeTheCreateCustomerOperationWithTheCustomerDetails() throws InterruptedException {
        sleep(1000);
        System.out.println("I invoke the create customer operation with the customer details");
    }
}
