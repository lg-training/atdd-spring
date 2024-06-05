package com.lgt.jvm.steps;

import com.lgt.jvm.support.BlankWorld;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    private final BlankWorld blankWorld;

    public MyStepdefs(BlankWorld blankWorld) {
        this.blankWorld = blankWorld;
    }

    @Given("some customer details{int}")
    public void someCustomerDetaisls(int arg0) {
        System.out.println("Hola");
    }

    @When("I invoke the create customer operation with the customer details{int}")
    public void iInvokeTheCreateCustomerOperationWithTheCustomerDetailss(int arg0) {
    }

    @Then("the customer details should be persisted{int}")
    public void theCustomerDetailsShouldBePersisteds(int arg0) {
    }
}
