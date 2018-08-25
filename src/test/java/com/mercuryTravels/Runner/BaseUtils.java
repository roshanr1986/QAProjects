package com.mercuryTravels.Runner;

import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import utils.commonUtils.property;

public class BaseUtils {
    public String stepinfo;
    public commonDriver comdriver;
    public WebDriver driver;


    public void setupbrowser() throws Exception {
        System.out.println("setupbrowser function executed");
        comdriver=new commonDriver("Chrome");
        comdriver.openBrowserAndGetURL(property.url);
        driver=comdriver.getDriver();
    }



}
