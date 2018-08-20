package com.mercuryTravel;

import commonLibs.implementation.commonElements;
import commonLibs.implementation.dropdownControls;
import commonLibs.implementation.mouseControls;
import commonLibs.implementation.textboxControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtHomePage {



    //initializing all elements
    @FindBy(xpath = "//a[@title='International Holidays']")
    private WebElement internationalHolidaysLink;

    @FindBy(linkText = "Indian Holidays")
    private WebElement indianHolidaysLink;

    @FindBy(xpath = "//a[@title='Flights']")
    private WebElement  flightsLink;

    @FindBy(xpath = "//a[@title='Hotels']")
    private WebElement hotelsLink;

    @FindBy(xpath = "//*[@id='bs-example-navbar-collapse-1']/ul/li[5]")
    private WebElement foreignExchangeDropdown;

        @FindBy(linkText = "Buy Forex")
        private WebElement buyForexLink;

        @FindBy(linkText = "Sell Forex")
        private WebElement sellForexLink;

        @FindBy(linkText = "Forex Products")
        private WebElement forexProductsLink;

        @FindBy(linkText = "FAQ")
        private WebElement faqLink;

    @FindBy(linkText = "Insurance")
    private WebElement insuranceLink;

    @FindBy(xpath = "//*[@id='bs-example-navbar-collapse-1']/ul/li[7]")
    private WebElement aboutUsDropdown;

        @FindBy(linkText = "Find a Branch")
        private WebElement findBranchLink;

        @FindBy(linkText = "Testimonials")
        private WebElement testimonialsLink;

        @FindBy(linkText = "Awards")
        private WebElement awardsLink;

        @FindBy(linkText = "Careers")
        private WebElement careersLink;

        @FindBy(linkText = "Contact Us")
        private WebElement contactUsLink;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/ul/li[1]")
    private WebElement customerLoginDropdown;

        @FindBy(linkText = "User Login")
        private WebElement userLoginLink;

                @FindBy(id = "sign_user_email")
                private WebElement userNameTextbox;

                @FindBy(id = "sign_user_password")
                private WebElement passwordTextbox;

                @FindBy(xpath = "//button[@class='btn btn-lg btn-primary modal-btn ajax-submit' and text()='Log in']")
                private WebElement loginBtn;

        @FindBy(linkText = "Register")
        private WebElement registerLink;

        //Toll free number
        @FindBy(xpath = "//nav[@class='navbar navbar-default login-nav']//div[@class='container']//div[@class='navbar-collapse paddingleft0']//ul[@class='nav navbar-nav navbar-right margin-right-logo']//li[@class='phone-number']//a/div//span")
        private WebElement tollFreeNumberText;

        //Find a branch
        @FindBy(id = "selectElement")
        private WebElement findABranchDropdown;

        @FindBy(xpath = "//div[@id='branch_add']//div[@class='full_width']//div[@class='col-md-10 fonts14']")
        private WebElement branchAddressExtractedText;

    private dropdownControls dropdown;
    private mouseControls mouse;
    private commonElements comElement;
    private textboxControl textbox;


    //constructor
    public MtHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        dropdown=new dropdownControls();
        mouse=new mouseControls(driver);
        comElement= new commonElements(driver);
        textbox = new textboxControl();
    }

    //Methods
    public void gotoBuyForex() throws Exception{
       // dropdown.selectByVisibleText (foreignExchangeDropdown,"Buy Forex");
        mouse.moveToElement(foreignExchangeDropdown);
        mouse.moveToElementAndClick(buyForexLink);
    }

    public void gotoCustomerLogin() throws Exception{
        mouse.moveToElement(customerLoginDropdown);
    }

    public void gotoUserLogin(String userName, String password) throws Exception{
        //move to user login dropdown
        gotoCustomerLogin();

        //move to user login link
        mouse.moveToElementAndClick(userLoginLink);

        //set username and password
        textbox.setText(userNameTextbox,userName);
        textbox.setText(passwordTextbox,password);
        comElement.click(loginBtn);
    }

    public void gotoRegister() throws Exception{
        gotoCustomerLogin();
        mouse.moveToElementAndClick(registerLink);
    }

    public void gotoInternationalHolidays() throws Exception{
        comElement.click(internationalHolidaysLink);
    }

    public String getTollFreeNumber() throws Exception{
        return comElement.getText(tollFreeNumberText);
    }

    public void selectBranch(String branchName) throws Exception{
        dropdown.selectByVisibleText(findABranchDropdown,branchName);
    }

    public String getSelectedBranchName() throws Exception {
        return dropdown.getSelectedItemName(findABranchDropdown);
    }

    public String getBranchAddress() throws Exception {
        return comElement.getText(branchAddressExtractedText);

    }

    public void goToHotels() throws Exception {
        comElement.click(hotelsLink);
    }

    public void goToFlights() throws Exception {
        comElement.click(flightsLink);
    }
}
