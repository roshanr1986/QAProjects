package com.FreeCRM;

import commonLibs.implementation.commonDriver;
import commonLibs.implementation.commonElements;
import commonLibs.implementation.frameControls;
import commonLibs.implementation.javaScriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCDashboard {

    //elements
    @FindBy(xpath ="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[2]/a")
    private WebElement reports;

    @FindBy(xpath = "//td[@class='headertable']//table//tbody//tr//td[@align='left' and @class='headertext']")
    private WebElement usernameTextHeader;

    // //*[@id="navmenu"]/ul/li[1]   //a[@title='Home' and text()='Home']

    @FindBy(xpath = ".//td[@class='headertext']//a[text()='Upgrade your account']")
    private WebElement upgradeLink;

    public commonElements comElement;
    public frameControls frame;


    public WebDriver driver;

    //constructor with page factory initialization
    public FCDashboard(WebDriver driver) {
        this.driver=driver;

        PageFactory.initElements(driver,this);
        frame=new frameControls(driver);
        comElement=new commonElements(driver);
    }
    //methods

    public void clickHometab() throws Exception {
        System.out.println("Inside click on home tab method ");
        System.out.println(driver.getTitle());
        frame.switchToFrame("mainpanel");
        /*WebElement element = driver.findElement(By.xpath(".//td[@class='headertext']//a[text()='Upgrade your account']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element );*/
        comElement.click(upgradeLink);
       //driver.findElement(By.xpath("//a[@title='Home' and text()='Home']")).click();
        //comElement.click(homeTab);
    }
}
