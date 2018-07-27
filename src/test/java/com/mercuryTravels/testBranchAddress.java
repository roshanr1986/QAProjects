package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testBranchAddress {

    @Parameters({"url","SelectedBranchName"})
    @Test
    public void testBranchAddress(String url, String SelectedBranchName) throws  Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(url);
        WebDriver driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        homePage.selectBranch(SelectedBranchName);
        System.out.println(homePage.getBranchAddress());
        Assert.assertEquals(homePage.getBranchAddress(),"Mercury Travels Ltd.\n" +
                "C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001.");
        comDriver.closeBrowser();
    }
}
