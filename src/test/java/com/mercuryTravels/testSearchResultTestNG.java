package com.mercuryTravels;

import com.mercuryTravel.MtHolidayPage;
import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class testSearchResultTestNG {


    @Test
    public void testSearchHolidayPackage() throws Exception {
        String url="https://www.mercurytravels.co.in";
        String continent="Australia";
        String country="Australia";
        String holidayType="Nature";
        String duration="6Nights / 7Days";
        String ExpectedSearchResultTitle="Red Centre Discovery";
        String ExpectedPrice="59011";


        commonDriver cmnDriver = new commonDriver("chrome");

        cmnDriver.openBrowserAndGetURL(url);
        WebDriver driver=cmnDriver.getDriver();

        MtHomePage homePage = new MtHomePage(driver);
        MtHolidayPage holidayPage = new MtHolidayPage(driver);


        homePage.gotoInternationalHolidays();
        holidayPage.setContinent(continent);
        holidayPage.setCountry(country);
        holidayPage.setDuration(duration);
        holidayPage.setHolidayType(holidayType);
        holidayPage.searchHolidayPackage();
        Boolean status = false;

        List<WebElement> allSearchResults = holidayPage.getSearchResultsElements(driver);

        for(int i=0;i<allSearchResults.size();i++){

            System.out.println(holidayPage.getSearchResultsText(allSearchResults.get(i)));

            if (holidayPage.getSearchResultsText(allSearchResults.get(i)).contentEquals(ExpectedSearchResultTitle))
            {
                System.out.println("==Match Found === "+holidayPage.getSearchResultsText(allSearchResults.get(i)));
                status=true;
            }

        }
        System.out.println("------ Search Results : "+holidayPage.getSearchResultsElements(driver).size());
        System.out.println("No match found");
        Assert.assertTrue(status);
        cmnDriver.closeBrowser();


    }
}
