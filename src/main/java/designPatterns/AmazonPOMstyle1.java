package designPatterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonPOMstyle1 {
    public WebElement searchBox;
    public WebElement searchCategory;
    public WebElement searchButton;
    public Select searchDropdown;

    public AmazonPOMstyle1(WebDriver driver) {
        searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchCategory=driver.findElement(By.id("searchDropdownBox"));
        searchButton=driver.findElement(By.xpath("//input[@value='Go']"));
        searchDropdown = new Select(searchCategory);
    }
}
