package designPatterns;

import commonLibs.implementation.commonElements;
import commonLibs.implementation.dropdownControls;
import commonLibs.implementation.textboxControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPageFactory {

    public AmazonPageFactory(WebDriver driver) {
        PageFactory.initElements(driver,this);
        textbox = new textboxControl();
        dropdown = new dropdownControls();
        comElemet = new commonElements(driver);

    }

    //initializing elements

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "searchDropdownBox")
    private WebElement searchCategory;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchButton;

    @FindBy(id = "s-result-count")
    private WebElement resultCount;

    private textboxControl textbox;
    private dropdownControls dropdown;
    private commonElements comElemet;


//methods
    public String searchPoduct(String product, String category) throws Exception{
        textbox.setText(searchBox,product);
        dropdown.selectByVisibleText(searchCategory,category);
        comElemet.click(searchButton);
        return comElemet.getText(resultCount);
    }
}
