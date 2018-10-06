package com.FreeCRM;

import commonLibs.implementation.commonDriver;
import commonLibs.implementation.commonElements;
import commonLibs.implementation.textboxControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCHomePage {
    //object decelerations
    public commonElements comElement;
    public textboxControl textboxControl;
    commonDriver comDriver;


    //defining elements
    @FindBy(name ="username")
    private WebElement usernameTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginBtn;


    //constructor class with object initiation
    public FCHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        comElement=new commonElements(driver);
        textboxControl=new textboxControl();

    }

    //methods
    public void setUsername(String username) throws Exception {
        //comElement.click(usernameTextBox);
        textboxControl.setText(usernameTextBox,username);
    }

    public void setPassword(String password) throws Exception {
        //comElement.click(passwordTextBox);
        textboxControl.setText(passwordTextBox,password);
    }

    public void clickLogin() throws Exception {
        comElement.click(loginBtn);
    }


}
