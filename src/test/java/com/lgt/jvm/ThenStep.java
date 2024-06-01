package com.lgt.jvm;

import io.cucumber.java.en.Then;

public class ThenStep {

    private final BlankWorld blankWorld;

    public ThenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }

    @Then("the customer details should be persisted")
    public void theCustomerDetailsShouldBePersisted() {
        System.out.println(blankWorld.getBaseUrl());
        System.out.println("the customer details should be persisted");
    }
}
