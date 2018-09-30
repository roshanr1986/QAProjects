package com.mercuryTravels.DemoSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSteps {


    @Given("^I navigate to homepage$")
    public void iNavigateToHomepage() throws Throwable {
        System.out.println("Executing Background - Navigate to homepage");

    }

    @When("^I fill in username$")
    public void iFillInUsername() throws Throwable {
        System.out.println("Executing Background - Fill in username");
    }

    @And("^I fill in my password$")
    public void iFillInMyPassword() throws Throwable {
        System.out.println("Executing Background - Fill in password");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        System.out.println("Executing Background - Click on login button");
    }

    @Then("^I should be logged in and view welcome message$")
    public void iShouldBeLoggedInAndViewWelcomeMessage() throws Throwable {
        System.out.println("Executing Background - View the welcome message");
    }

    @When("^I click on update Name option$")
    public void iClickOnUpdateNameOption() throws Throwable {
        System.out.println("Executing Test Step - click on update Name");
    }

    @And("^I update \"([^\"]*)\" with \"([^\"]*)\"$")
    public void iUpdateWith(String ExistingName, String NewName) throws Throwable {
        System.out.println("Executing Test Step - Change existing name "+ExistingName+ " to "+NewName);
    }

    @And("^I click save$")
    public void iClickSave() throws Throwable {
        System.out.println("Executing Test Step - click save");
    }

    @Then("^I should see update success message$")
    public void iShouldSeeUpdateSuccessMessage() {
        System.out.println("Executing Test Step - get the success message");
    }

    @When("^I click on update email$")
    public void iClickOnUpdateEmail() throws Throwable {
        System.out.println("Executing Test 2 Step - click on update email");
    }

    @And("^I update old email with new email$")
    public void iUpdateOldEmailWithNewEmail() throws Throwable {
        System.out.println("Executing Test 2 Step - update old email with new email");
    }

    @And("^I click save email$")
    public void iClickSaveEmail() throws Throwable {
        System.out.println("Executing Test 2 Step - click on save email");
    }

    @Then("^I should see new email updated$")
    public void iShouldSeeNewEmailUpdated() throws Throwable {
        System.out.println("Executing Test 2 Step - See email updated successfully");
    }
}
