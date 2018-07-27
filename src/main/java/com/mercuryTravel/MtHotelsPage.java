package com.mercuryTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonLibs.implementation.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MtHotelsPage {


    //city
    @FindBy(id = "cityName")
    private WebElement cityName;

        //London, United Kingdom -- Element
        @FindBy(xpath = "//a[text()='London, United Kingdom']")
        private WebElement LondonSelectElement;



    //checkin date
    @FindBy(xpath = "//input[@name='checkIn']")
    private WebElement checkInDate;

        @FindBy(xpath = "//html//body//div[16]//div[1]//table//tbody//tr[4]//td[@class='day ' and text()='20']")
        private WebElement checkInDateElement;


    //checkout date
    @FindBy(xpath = "//input[@name='checkOut']")
    private WebElement checkOutDate;

        @FindBy(xpath = "/html/body/div[17]/div[1]/table/tbody/tr[5]/td[@class='day ' and text()='25']")
        private WebElement checkOutDateElement;

    //room count dropdown
    @FindBy(id = "room_count")
    private WebElement roomCountDropdown;

    //Adult count dropdown
    @FindBy(id = "adult_count_1")
    private WebElement adultCountDropdown;

    //Child count dropdown
    @FindBy(id = "slect-room1ChildAge child_count_1")
    private WebElement childCountDropdown;

    //Search button
    @FindBy(id = "searchHotelsBtn")
    private WebElement searchHotelsBtn;

    @FindBy(xpath = "/html/body/div[1]/div/a[text()='Got it!']")
    private WebElement cookiesDismissButton;

    //--------declaring controls --------//
    private commonElements comElement;
    private dropdownControls dropdown;
    private mouseControls mouse;
    private textboxControl textbox;
    private commonDriver comDriver;
    private javaScriptExecutor javascript;


    public MtHotelsPage(WebDriver driver) {

        //initiating elements through pagefactory
        PageFactory.initElements(driver,this);

        //initiating required element control object
        comElement=new commonElements(driver);
        dropdown=new dropdownControls();
        mouse=new mouseControls(driver);
        textbox=new textboxControl();
        javascript=new javaScriptExecutor(driver);


    }

    //---------------Methods ----------------------//

    public void setCity(WebDriver driver, String cityNameText, String cityNameSelected ) throws Exception {

        //type text in the textbox
        textbox.setText(cityName,cityNameText);

        //move mouse to the correct item and click
        mouse.moveToElementAndClick(getElementForCity(driver,cityNameSelected));
    }

    public WebElement getElementForCity(WebDriver driver, String city) throws Exception {
        return comElement.getElementByXpath(driver,getXpathExpressionForCityElement(city));
    }

    public String getXpathExpressionForCityElement(String city) throws Exception {
        return "//a[@class='ui-corner-all' and text()='"+city+"']";
    }

    public WebElement getElementForCheckInDate(WebDriver driver, String date) throws Exception {
        //driver.wait(1000);
        waitForElementPresent(driver,comElement.getElementByXpath(driver,getXpathExpressionForCheckInDate(date)));
        return comElement.getElementByXpath(driver,getXpathExpressionForCheckInDate(date));
    }

    public String getXpathExpressionForCheckInDate(String checkInDate) throws Exception {
        String xpathExper="//html//body//div[16]//div[1]//table//tbody//tr[4]//td[@class='day ' and text()='"+checkInDate+"']".trim();
        System.out.println(xpathExper);
        return xpathExper;

    }

    public void clickOnCheckInDate(WebDriver driver, String selectedCheckinDate) throws Exception {


        String checkInDatePickerXpath="//html//body//div[16]//div[@class='datepicker-days']//table[@class=' table-condensed']//tbody";
        //click on check in date pull down menu
        comElement.click(checkInDate);
        clickOnDate(driver,checkInDatePickerXpath,selectedCheckinDate);

    }

    public void clickOnCheckOutDate(WebDriver driver, String selectedCheckOutDate) throws Exception {
        String checkOutDatePickerXpath ="//html//body//div[17]//div[@class='datepicker-days']//table[@class=' table-condensed']//tbody";
        clickOnDate(driver,checkOutDatePickerXpath,selectedCheckOutDate);
    }

    public void clickOnDate(WebDriver driver,String DatePickerXpath,String selectedCheckinDate ) throws Exception {
        //get the webelement of all dates in the  date picker table


            WebElement dateWidgetForm=comElement.getElementByXpath(driver,DatePickerXpath);


            //get the list of rows from the date picker
            // List<WebElement> rows = comElement.getElementsByTagName(dateWidgetForm,"tr");

            //get list of columns from the date picker
            List<WebElement> columns=comElement.getElementsByXpath(driver,DatePickerXpath.trim()+"//td[@class='day ' or  @class='day  active']");

            System.out.println("==============Dates found when searched for "+selectedCheckinDate);
            for(WebElement allElements:columns){
                System.out.println(allElements.getText().toString());
            }

            //looping through columns to get the required date to be  selected
            for (WebElement cell:columns){
                if (cell.getText().trim().equalsIgnoreCase(selectedCheckinDate)){
                    //comDriver.waitForElementToBeClickable(driver,cell);
                    //checking if the overlay is present and if so, close it
                    if (cookiesDismissButton.isDisplayed()){
                        comElement.click(cookiesDismissButton);
                    }
                    if ((!comElement.isElementVisible(dateWidgetForm)) && (DatePickerXpath.contains("div[16]") )){

                        System.out.println("Clicked on CHECK IN DATE when element is not visible");
                        comElement.click(checkInDate);

                    }else if((!comElement.isElementVisible(dateWidgetForm)) && (DatePickerXpath.contains("div[17]") )){

                        System.out.println("Clicked on CHECK OUT DATE when element is not visible");
                        comElement.click(checkOutDate);

                    }

                  // comElement.waitForElementToBeClickable(driver,cell);
                    System.out.println("Before clicking the element "+cell.getText());

                    comElement.click(cell);
                    //mouse.moveToElementAndClick(cell);
                    break;
                }
            }




    }

    public String getXpathExpressionForCheckOutDate(String checkOutDate) throws Exception {
        return "/html/body/div[17]/div[1]/table/tbody/tr[5]/td[@class='day ' and text()='"+checkOutDate+"']".trim();
    }

    public WebElement getElementForCheckOutDate(WebDriver driver, String date) throws Exception {
        //driver.wait(1000);
        waitForElementPresent(driver,comElement.getElementByXpath(driver,getXpathExpressionForCheckOutDate(date)));
        return comElement.getElementByXpath(driver,getXpathExpressionForCheckOutDate(date));
    }


    public void clickSearchHotelsButton() throws Exception {
        comElement.click(searchHotelsBtn);
    }

    public void waitForElementPresent(WebDriver driver, WebElement element) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
}
