package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testTollFreeNumber  {

    @Parameters({"url","ExpectedTollFreeNumber"})
    @Test
    public void testTollFreeNumber(String url, String ExpectedTollFreeNumber) throws  Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(url);
        WebDriver driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        Assert.assertEquals(homePage.getTollFreeNumber(),ExpectedTollFreeNumber);
        comDriver.closeBrowser();
    }
}
