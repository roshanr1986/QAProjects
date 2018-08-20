package com.mercuryTravels.Steps;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.commonUtils.property;

public class stepsTestBranchAddress {


    public static WebDriver driver;
    public commonDriver comDriver;
    public  MtHomePage homepage;
    public String actualaddress;
    public String expectedaddress;



    @Given("^I navigate MT homepage$")
    public void iNavigateMTHomepage() throws Throwable {
        comDriver=new commonDriver("Chrome");
        comDriver.openBrowserAndGetURL(property.url);
        driver = comDriver.getDriver();
        System.out.println("I navigate MT homepage");
    }

    @And("^I select ([^\"]*)$")
    public void iSelectBranchname(String branchname) throws Throwable {
        System.out.println("iSelectBranchname");
        homepage = new MtHomePage(driver);
        homepage.selectBranch(branchname);

    }

    @Then("^I fetch the ([^\"]*) and ([^\"]*)$")
    public void iFetchTheAddressprefixAndAddresssuffix(String addressprefix, String addresssuffix) throws Throwable {
        System.out.println("iFetch The Addressprefix And Addresssuffix");
        actualaddress = homepage.getBranchAddress();
        expectedaddress = addressprefix + "\n" + addresssuffix;
    }

    @Then("^Verify the address with branch$")
    public void verifyTheAddressWithBranch() throws Throwable {
        System.out.println("Verify the address with branch");
        Assert.assertEquals(actualaddress, expectedaddress);
    }

    @Then("^close the browser$")
    public void closeTheBrowser() throws Throwable {
        System.out.println("Close the browser");
        comDriver.closeBrowser();

    }
}
