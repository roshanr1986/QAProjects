package com.mercuryTravels;

import com.mercuryTravel.MtFlightsPage;
import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import testNGDemo.TestListener;

import java.sql.Timestamp;

public class testDateOfReturnFiledVisibility {
public WebDriver driver;

    @Parameters({"url"})
    @Test(priority = 100)
    public void verifyDateOfReturnFiledVisibility(String url){


        try {
            commonDriver comDriver= new commonDriver("chrome");
            comDriver.openBrowserAndGetURL(url);
             driver=comDriver.getDriver();
            //TestListener listener = new TestListener(driver);

            MtHomePage homePage = new MtHomePage(driver);
            MtFlightsPage flightsPage= new MtFlightsPage(driver);

            //screenshot object
           // TakeScreenShots cameraObject = new TakeScreenShots(driver);


            //navigate to flights section
            homePage.goToFlights();

            //click on one way radio button
            flightsPage.clickOneWayOption();

            //validate if the return date is not duslayed

            try {
                Assert.assertFalse(flightsPage.visibilityOfReturnDateElement());

            } catch (Exception e) {
                e.printStackTrace();
            }

            //camera.captureAndSaveScreenShots("C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\screenshots\\"+subFolderName+"\\"+testCaseName+".png");

            comDriver.closeBrowser();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Parameters({"url"})
    @Test(priority = 0)
    public void verifyDefaultSelectedTrip(String url) throws Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(url);
        WebDriver driver=comDriver.getDriver();

        MtHomePage homePage = new MtHomePage(driver);
        MtFlightsPage flightsPage= new MtFlightsPage(driver);

        //navigate to flights section
        homePage.goToFlights();

        Assert.assertTrue(flightsPage.statusOfRoundTrip());

        comDriver.closeBrowser();

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception{

        if (ITestResult.FAILURE==result.getStatus()){
            System.out.println(result.getName()+ " --- Failed");
            TakeScreenShots camera = new TakeScreenShots(driver);
            camera.captureAndSaveScreenShots(result.getName().toString());

        }
    }



}
