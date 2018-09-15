package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import commonLibs.implementation.commonDriver;
import extentReports.ExtentReportsClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.commonUtils.ReadExcelData;
import utils.commonUtils.property;
import java.lang.reflect.Method;


public class testBranchAddress {

    public WebDriver driver;
    public commonDriver comDriver;
    public String testCaseName;

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

        reports.setLogStatus("Driver Navigated to "+property.url);
        driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);

        //start of test script
        homePage.selectBranch(SelectedBranchName);
        reports.setLogStatus("Selected branch Name - "+SelectedBranchName);

        System.out.println(homePage.getBranchAddress());
        Assert.assertEquals(ExpectedAddress, homePage.getBranchAddress());
        reports.setLogStatus("Comparing addresses "+homePage.getBranchAddress()+" with "+ExpectedAddress);

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
