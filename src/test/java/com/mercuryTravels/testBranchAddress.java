package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.commonUtils.ReadExcelData;
import utils.commonUtils.getTestData;
import utils.commonUtils.property;

import java.util.ArrayList;
import java.util.Iterator;

public class testBranchAddress {

    @DataProvider(name="addressData")
   public Object[][] getTestData() throws Exception {
        ReadExcelData dataObject = new ReadExcelData();
    return dataObject.getData("testBranchAddress","Sheet1");
    }

    //@Parameters({"url","SelectedBranchName"})
    @Test(dataProvider="addressData")
    public void testBranchAddress( String SelectedBranchName, String ExpectedAddress) throws  Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(property.url);
        WebDriver driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        homePage.selectBranch(SelectedBranchName);
        System.out.println(homePage.getBranchAddress());
        Assert.assertEquals(homePage.getBranchAddress(),ExpectedAddress);
        comDriver.closeBrowser();
    }
}
