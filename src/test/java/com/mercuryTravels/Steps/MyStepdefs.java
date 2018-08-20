package com.mercuryTravels.Steps;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.commonUtils.ReadExcelData;
import utils.commonUtils.property;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


public class MyStepdefs {
    public WebDriver driver;
    public commonDriver comdriver;
    public String ExpectedAddress;
    public String returnedBranchName;
    public String SelectedBranchName;
    public String actualAddress;
    MtHomePage homePage;


    @Given("^I navigate to home page$")
    public void iNavigateToHomePage() throws Throwable {
        comdriver = new commonDriver("Chrome");
        comdriver.openBrowserAndGetURL(property.url);
        driver=comdriver.getDriver();
        homePage=new MtHomePage(driver);

    }

    @Then("^Following branches should have following addresses$")

    public void followingBranchesShouldHaveFollowingAddresses( DataTable table) throws Throwable {
        //Storing the data from the test data table into a list of list of string array
        int rows = table.getGherkinRows().size();
        int colmuns=table.cells(0).size();

        System.out.println("Rows :"+rows);
        System.out.println("Columns :"+colmuns);

        for(Map<String, String> Testdata : table.asMaps(String.class, String.class)){

            SelectedBranchName= Testdata.get("BranchName").toString().trim();
           String ExpectedAddressPrefix= Testdata.get("AddressPrefix").toString().trim();
           String ExpectedAddressSuffix=Testdata.get("AddressSuffix").toString().trim();

            ExpectedAddress=ExpectedAddressPrefix+"\n"+ExpectedAddressSuffix;

           // System.out.println("Branch -"+SelectedBranchName );
          //  System.out.println("Expected address -"+ExpectedAddress );
            homePage.selectBranch(SelectedBranchName);
            System.out.println("Currently testing for branch - "+SelectedBranchName+" Selected Branch in the dropdown - "+homePage.getSelectedBranchName());
            returnedBranchName=homePage.getSelectedBranchName();
            actualAddress=homePage.getBranchAddress();

           if(returnedBranchName.equalsIgnoreCase(SelectedBranchName)) {
               actualAddress=homePage.getBranchAddress();
           } else {
               System.out.println("Expected - "+ SelectedBranchName + " But returned - "+ returnedBranchName);
           }

            try {
                Assert.assertEquals(actualAddress, ExpectedAddress);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    @Then("^close browser$")
    public void closeBrowser() throws Throwable {
        System.out.println("Close Browser");

    }



}
