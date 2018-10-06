package com.FreeCRM.Steps;

import com.FreeCRM.FCDashboard;
import com.FreeCRM.FCHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testLogin {
    public commonDriver comdriver;
    public WebDriver driver;
    public String newURL;
    public FCHomePage homePage;
    public FCDashboard dashBoard;

    @Test
    public void testLogin() throws Exception {
        comdriver = new commonDriver("chrome");
        comdriver.openBrowserAndGetURL("https://www.freecrm.com/index.html");
        driver = comdriver.getDriver();
        homePage=new FCHomePage(driver);
        dashBoard=new FCDashboard(driver);

        System.out.println(comdriver.getTitle());

        homePage.setUsername("roshanr1986");
        homePage.setPassword("abc123");
        homePage.clickLogin();

        dashBoard.clickHometab();
        System.out.println("Clicked on Home Tab");

    }


}
