package com.mercuryTravels.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @Given("^I navigate to home page$")
    public void iNavigateToHomePage() throws Throwable {
        System.out.println("===== I navigate to home page");
        // Write code here that turns the phrase above into concrete actions
      //  throw new PendingException();
    }

    @And("^I select a branch$")
    public void iSelectABranch() throws Throwable {
        System.out.println("===== I select a branch");
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^I should see the correct address for selected branch$")
    public void iShouldSeeTheCorrectAddressForSelectedBranch() throws Throwable {
        System.out.println("===== I should see the correct address for selected branch");
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
}
