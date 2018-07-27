package com.mercuryTravel;

import commonLibs.implementation.commonElements;
import commonLibs.implementation.dropdownControls;
import commonLibs.implementation.mouseControls;
import commonLibs.implementation.textboxControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MtHolidayPage {

    //initializing all elements
    @FindBy(id ="continent")
    private WebElement continentDropdown;

    @FindBy(id ="country")
    private WebElement countryDropdown;

    @FindBy(id = "duration")
    private WebElement durationDropdown;

    @FindBy(id = "theme")
    private WebElement holidayTypeDropdown;

    @FindBy(xpath = "//button[@class='btn btn-primary form-control search-holidaybtn']")
    private WebElement searchButton;

    private String HolidayPackageTitleXpathPrefix;
    private String HolidayPackageTitleXpathSuffix;
    private String searchResult;

    //@FindBy(xpath =HolidayPackageTitleXpathPrefix+searchResult+HolidayPackageTitleXpathSuffix )
    private WebElement titleOfSearchResult;


    //initializing the controls;
    private dropdownControls dropdown;
    private commonElements comElement;
    private textboxControl textbox;
    private mouseControls mouse;


    public MtHolidayPage(WebDriver driver) throws Exception {
        PageFactory.initElements(driver,this);
        dropdown=new dropdownControls();
        comElement=new commonElements(driver);
        textbox=new textboxControl();
        mouse= new mouseControls(driver);
        HolidayPackageTitleXpathPrefix = "//span[text()='";
        HolidayPackageTitleXpathSuffix ="']//..//..//..//../..//div[@class='container']//parent::div[@class='bottomSection HotelInfoBox']";
       // titleOfSearchResult = comElement.getElementByXpath(driver,HolidayPackageTitleXpathPrefix,searchResult,HolidayPackageTitleXpathSuffix);
    }

    //Defining Methods

    public void setContinent(String continent) throws Exception{
        dropdown.selectByVisibleText(continentDropdown,continent);
    }

    public void setCountry(String country) throws Exception{
        dropdown.selectByVisibleText(countryDropdown,country);
    }

    public void setDuration (String duration) throws Exception{
        dropdown.selectByVisibleText(durationDropdown,duration);
    }

    public void setHolidayType (String theme) throws Exception{
        dropdown.selectByVisibleText(holidayTypeDropdown,theme);
    }

    public void searchHolidayPackage() throws Exception {
        comElement.click(searchButton);
    }

    public String getPriceOfHolidayPackage(WebDriver driver, String searchResult) throws Exception {

        titleOfSearchResult = comElement.getElementByXpath(driver,HolidayPackageTitleXpathPrefix+searchResult+HolidayPackageTitleXpathSuffix);
        return titleOfSearchResult.getAttribute("data-price").toString();
    }

    public List<WebElement> getSearchResultsElements(WebDriver driver) throws Exception {
        //this will store all the web elements of results
        String xpath = "//div[@class='bottomSection HotelInfoBox']";
       return comElement.getElementsByXpath(driver,xpath) ;

    }
    public String getSearchResultsText(WebElement element) throws Exception{
        return comElement.getAttribute(element,"data-hotel-name").trim();
    }
}


