package com.FreeCRM.Steps;

import com.FreeCRM.FCDashboard;
import com.FreeCRM.FCHomePage;
import commonLibs.implementation.commonDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class loginFeatureSteps {

    public commonDriver comdriver;
    public WebDriver driver;
    public String newURL;
    public FCHomePage homePage;
    public FCDashboard dashBoard;



    @Given("^User navigate to \"([^\"]*)\"$")
    public void userNavigateTo(String URL) throws Throwable {
        newURL=URL;
        System.out.println("Executing the background step");

    }

    @Given("^when user navigate to login page$")
    public void whenUserNavigateToLoginPage() throws Throwable {

        comdriver = new commonDriver("chrome");
        comdriver.openBrowserAndGetURL(newURL);
        driver = comdriver.getDriver();
        homePage=new FCHomePage(driver);
        dashBoard=new FCDashboard(driver);

        System.out.println(comdriver.getTitle());
    }

    @When("^user enter username$")
    public void userEnterUsername() throws Throwable {
        homePage.setUsername("roshanr1986");
    }

    @When("^user enter password$")
    public void userEnterPassword() throws Throwable {
        homePage.setPassword("abc123");
    }

    @Then("^user click on login$")
    public void userClickOnLogin() throws Throwable {
        homePage.clickLogin();

        dashBoard.clickHometab();
        System.out.println("Clicked on Home Tab");

    }

    @Then("^user log in successfully and view correct$")
    public void userLogInSuccessfullyAndViewCorrect(String expectedUserName) throws Throwable {

        System.out.println("Inside final step and Expected User Name is "+ expectedUserName);
        //dashBoard=new FCDashboard(driver);
       // driver.findElement(By.xpath("//a[@title='Home' and text()='Home']")).click();

        /*System.out.println("Inside final step and Expected User Name is "+ expectedUserName);
        dashBoard.clickHomeTab();
        System.out.println("Clicked on Home Tab");
        String actualUserName = dashBoard.getLoggedInUserName();
        System.out.println(actualUserName);*/
        //comdriver.closeBrowser();
    }


}
