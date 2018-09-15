/*

Author: Roshan Ranasinghe
 */

package com.mercuryTravels;

import com.mercuryTravel.MtFlightsPage;
import com.mercuryTravel.MtHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import extentReports.ExtentReportsClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import testNGDemo.TestListener;
import utils.commonUtils.property;

import java.lang.reflect.Method;
import java.sql.Timestamp;

public class testDateOfReturnFiledVisibility {
    public WebDriver driver;
    public commonDriver comDriver;
    public ExtentReportsClass reports;
    public ExtentTest test;

    @BeforeTest
    public void beforeTest() { //runs ONLY ONCE before all tests starts
        reports = new ExtentReportsClass();
        reports.setupReports();

    }

    @BeforeMethod
    public void beforeMethod(Method method){ // runs EVERY TIME BEFORE start of test execution
        String testCaseName = method.getName().toString();
        reports.startTest(testCaseName);
    }


    @Test(priority = 200, enabled = false)
    public void verifyDateOfReturnFiledVisibility(){

        try {
            comDriver= new commonDriver("chrome");
            comDriver.openBrowserAndGetURL(property.url);
             driver=comDriver.getDriver();
            //TestListener listener = new TestListener(driver);

            MtHomePage homePage = new MtHomePage(driver);
            MtFlightsPage flightsPage= new MtFlightsPage(driver);

            //navigate to flights section
            homePage.goToFlights();

            //click on one way radio button
            flightsPage.clickOneWayOption();

            //validate if the return date is not displayed
            Assert.assertFalse(flightsPage.visibilityOfReturnDateElement());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 100 )
    public void verifyDefaultSelectedTrip() throws Exception{

        comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(property.url);
        WebDriver driver=comDriver.getDriver();

        MtHomePage homePage = new MtHomePage(driver);
        MtFlightsPage flightsPage= new MtFlightsPage(driver);

        //navigate to flights section
        homePage.goToFlights();

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
