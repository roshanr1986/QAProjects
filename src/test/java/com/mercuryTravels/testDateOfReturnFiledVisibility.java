/*

Author: Roshan Ranasinghe
 */

package com.mercuryTravels;

import com.mercuryTravel.MtFlightsPage;
import com.mercuryTravel.MtHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import commonLibs.implementation.commonDriver;
import extentReports.ExtentReportsClass;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.commonUtils.property;
import java.lang.reflect.Method;


public class testDateOfReturnFiledVisibility {
    public WebDriver driver;
    public commonDriver comDriver;
    public ExtentReportsClass reports;
    public ExtentTest test;

    @BeforeClass
    public void beforeTest() { //runs ONLY ONCE before all tests starts
        reports = new ExtentReportsClass();
        reports.setupReports();

    }

    @BeforeMethod
    public void beforeMethod(Method method){ // runs EVERY TIME BEFORE start of test execution
        String testCaseName = method.getName().toString();
        reports.startTest(testCaseName);
    }


    @Test(priority = 200)
    public void verifyDateOfReturnFiledVisibility(){

        try {
            comDriver= new commonDriver("chrome");
            comDriver.openBrowserAndGetURL(property.url);
            driver=comDriver.getDriver();
            reports.setLogStatus("Navigated to URL "+property.url);


            MtHomePage homePage = new MtHomePage(driver);
            MtFlightsPage flightsPage= new MtFlightsPage(driver);

            //navigate to flights section
            homePage.goToFlights();
            reports.setLogStatus("Navigated to Flights page");

            //checking if element is present
            if(flightsPage.visibilityOfOneWayOption()){

                //click on one way radio button
                flightsPage.clickOneWayOption();
                reports.setLogStatus("Clicked on 'One way' Radio button ");

                //validate if the return date is not displayed
                Assert.assertFalse(flightsPage.visibilityOfReturnDateElement());
            } else {
                reports.setLogStatus("'One way' Radio button is not visible");
                throw new ElementNotVisibleException("One way option is not visible");

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 100 )
    public void verifyDefaultSelectedTrip() throws Exception{

        comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(property.url);
        reports.setLogStatus("Navigated to URL "+property.url);

        WebDriver driver=comDriver.getDriver();


        MtHomePage homePage = new MtHomePage(driver);
        MtFlightsPage flightsPage= new MtFlightsPage(driver);

        //navigate to flights section
        homePage.goToFlights();
        reports.setLogStatus("Navigated to Flights page");

        Assert.assertTrue(flightsPage.statusOfRoundTrip());

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        reports.getResult(result,driver);
        comDriver.closeBrowser();
    }

    @AfterClass
    public void endReport(){
        reports.endReport();
    }

}
