package com.mercuryTravels;

import com.mercuryTravel.MtHomePage;
import com.mercuryTravel.MtHotelsPage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testSearchHotel {

    @Parameters({"url"})
    @Test
    public void testSearchHotel(String url) throws  Exception{

        commonDriver comDriver= new commonDriver("chrome");
        comDriver.openBrowserAndGetURL(url);
        WebDriver driver=comDriver.getDriver();

        //initializing the object of homepage page object
        MtHomePage homePage=new MtHomePage(driver);
        MtHotelsPage hotelPage=new MtHotelsPage(driver);

        //start of test script

        //click on hotels main menu link
        homePage.goToHotels();

        //send keys to destination city
        hotelPage.setCity(driver,"London","London, United Kingdom");

        //set check in date
        hotelPage.clickOnCheckInDate(driver,"23");


        //set check out date
        hotelPage.clickOnCheckOutDate(driver,"25");

        //click on search button
       // hotelPage.clickSearchHotelsButton();


        //comDriver.closeBrowser();
    }
}
