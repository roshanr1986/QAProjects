package designPatterns;

import commonLibs.implementation.commonElements;
import commonLibs.implementation.dropdownControls;
import commonLibs.implementation.textboxControl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonPOMstyle2 {
    private WebElement searchBox;
    private WebElement searchCategory;
    private WebElement searchButton;
    private Select searchDropdown;
    private textboxControl textbox;
    private dropdownControls dropdown ;
    private commonElements comElemet ;

    public AmazonPOMstyle2(WebDriver driver) {

        searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchCategory=driver.findElement(By.id("searchDropdownBox"));
        searchButton=driver.findElement(By.xpath("//input[@value='Go']"));


        textbox = new textboxControl();
        dropdown = new dropdownControls();
        comElemet = new commonElements(driver);
    }

    public void searchPoduct(String product, String category) throws Exception{
        textbox.setText(searchBox,product);
        dropdown.selectByVisibleText(searchCategory,category);
        comElemet.click(searchButton);
    }
}
