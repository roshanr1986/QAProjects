package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.commonUtils.ReadExcelData;
import utils.commonUtils.getTestData;
import utils.commonUtils.property;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class testBranchAddress {

    public WebDriver driver;
    public String testCaseName;


    @DataProvider(name="addressData")
   public Object[][] getTestData(Method method) throws Exception {
        testCaseName=method.getName();
        ReadExcelData dataObject = new ReadExcelData();
        return dataObject.getData(testCaseName,"Sheet1");
    }

    @Test(dataProvider="addressData")
    public void testBranchAddress( String SelectedBranchName, String ExpectedAddress) throws  Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(property.url);
        driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        homePage.selectBranch(SelectedBranchName);
        System.out.println(homePage.getBranchAddress());
        Assert.assertEquals(homePage.getBranchAddress(),ExpectedAddress);
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
