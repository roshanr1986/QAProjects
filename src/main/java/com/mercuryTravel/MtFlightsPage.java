package com.mercuryTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import commonLibs.implementation.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MtFlightsPage {

    //defining elements
    @FindBy(xpath = "//div[@class='col-md-10 duration']//input[@name='tripType' and @value='R']")
    private WebElement roundTripRadioButton;

    @FindBy(xpath = "//div[@class='col-md-10 duration']//input[@name='tripType' and @value='S']")
    private WebElement oneWayRadioButton;

    @FindBy(xpath = "//input[@id='dpf2']")
    private WebElement returnDatePicker;

    @FindBy(xpath = "//input[@id='dpf1']")
    private WebElement checkInDatePicker;


    commonElements comElement;

    public MtFlightsPage(WebDriver driver) {

        PageFactory.initElements(driver,this);
        comElement=new commonElements(driver);

    }

    public void clickRoundTripOption() throws Exception {
        if(!comElement.isElementSelected(roundTripRadioButton)){
            comElement.click(roundTripRadioButton);
        }
    }

    public void clickOneWayOption() throws Exception {
        if (!comElement.isElementSelected(oneWayRadioButton)) {
            comElement.click(oneWayRadioButton);
        }
    }

    public boolean visibilityOfOneWayOption() throws Exception{
        if(comElement.isElementVisible(oneWayRadioButton)){
            return true;
        } else {
            return false;
        }
    }

    public WebElement getDateOfReturnElement(){
        return returnDatePicker;
    }

    public boolean visibilityOfReturnDateElement() throws Exception{
        if (comElement.isElementVisible(returnDatePicker)){
            return true;
        } else {
            return false;
        }
    }

    public boolean visibilityOfCheckInDateElement() throws Exception{
        if (comElement.isElementVisible(checkInDatePicker)){
            return true;
        } else return false;
    }

    public boolean statusOfOneWayOption() throws Exception {
        if (comElement.isElementSelected(oneWayRadioButton)){
            return true;
        }else return false;
    }

    public boolean statusOfRoundTrip() throws Exception {
        if (comElement.isElementSelected(roundTripRadioButton)){
            return true;
        }else return false;
    }
}
