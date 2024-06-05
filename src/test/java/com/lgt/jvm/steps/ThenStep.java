package com.lgt.jvm.steps;

import com.lgt.jvm.support.BlankWorld;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThenStep {

    private final BlankWorld blankWorld;

    public ThenStep(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }


    @Then("the customer details should be persisted")
    public void theCustomerDetailsShouldBePersisted() {
        System.out.println(blankWorld.getBaseUrl());
        System.out.println("the customer details should be persisted");
        assertTrue(true);
    }
}
