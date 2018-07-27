package com.mercuryTravels;

import com.mercuryTravel.MtHolidayPage;
import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testSearchHolidayPackage {


    @SuppressWarnings("TestDataSupplier")
    @Test(dataProvider ="getData")
    public void testSearchHolidayPackage(String continentTxt, String countryTxt, String holidayTypeTxt, String durationTxt, String ExpectedSearchResultTitleTxt, String ExpectedPriceTxt ) throws Exception {
        String url="https://www.mercurytravels.co.in";

        String continent=continentTxt;
        String country=countryTxt;
        String holidayType=holidayTypeTxt;
        String duration=durationTxt;

        String ExpectedSearchResultTitle=ExpectedSearchResultTitleTxt;
        String ExpectedPrice=ExpectedPriceTxt;

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
        String ActualPrice=holidayPage.getPriceOfHolidayPackage(driver,ExpectedSearchResultTitle);
        System.out.println("------ Price of "+ExpectedSearchResultTitle+" : "+ActualPrice);
        Assert.assertEquals(ActualPrice,ExpectedPrice);
        cmnDriver.closeBrowser();

    }

    @DataProvider
    public Object[][] getData() throws Exception{
        String[][] data = new String[3][6];

        data[0][0]="Australia";
        data[0][1]="Australia";
        data[0][2]="Nature";
        data[0][3]="6Nights / 7Days";
        data[0][4]="Gold Coast & Beyond 6 Nights / 7 Days";
        data[0][5]="59011";

        data[1][0]="Australia";
        data[1][1]="Australia";
        data[1][2]="Nature";
        data[1][3]="6Nights / 7Days";
        data[1][4]="Adelaide and Beyond 6 Nights / 7 Days";
        data[1][5]="73500";

        data[2][0]="Australia";
        data[2][1]="Australia";
        data[2][2]="Nature";
        data[2][3]="6Nights / 7Days";
        data[2][4]="Best Of Northern Territory With New South Wales 6 Nights / 7 Days";
        data[2][5]="74999";

        return data;
    }
}
