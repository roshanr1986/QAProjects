package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import extentReports.ExtentReportsClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.commonUtils.ReadExcelData;
import utils.commonUtils.getTestData;
import utils.commonUtils.property;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class testBranchAddress {

    public WebDriver driver;
    public commonDriver comDriver;
    public String testCaseName;

    public ExtentReportsClass reports;


    @BeforeTest
    public void beforeMethod() {
        reports = new ExtentReportsClass();
        reports.setupReports();
    }

    @DataProvider(name="addressData")
    public Object[][] getTestData(Method method) throws Exception {
        testCaseName=method.getName();
        ReadExcelData dataObject = new ReadExcelData();
        return dataObject.getData(testCaseName,"Sheet1");
    }

    @Test(dataProvider="addressData")
    public void testBranchAddress( String SelectedBranchName, String ExpectedAddress) throws  Exception{

        comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(property.url);
        driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        homePage.selectBranch(SelectedBranchName);
        System.out.println(homePage.getBranchAddress());
        Assert.assertEquals(homePage.getBranchAddress(),ExpectedAddress);

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {
        reports.getResult(result,driver);
        comDriver.closeBrowser();

    }

    @AfterTest
    public void endReport(){
        reports.endReport();

    }





}
