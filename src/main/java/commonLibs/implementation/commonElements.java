package commonLibs.implementation;

import commonLibs.contracts.IcommonElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class commonElements implements IcommonElements {
    private  WebDriver driver;

    public commonElements(WebDriver driver) {
        this.driver=driver;

    }

    @Override
    public String getText(WebElement element) throws Exception {
        return element.getText();
    }

    @Override
    public String getExtractedText(String branchAddressExtractedText) throws Exception {
        return branchAddressExtractedText.trim();

    }


    @Override
    public WebElement getElementByXpath(WebDriver driver, String xpathExpression) throws  Exception {

        WebElement result=driver.findElement(By.xpath(xpathExpression));
        return result;

    }

    public List<WebElement> getElementsByTagName(WebElement parentElement,String tagName) throws Exception {
        List<WebElement> elements = parentElement.findElements(By.tagName(tagName));
       return elements;
    }

    @Override
    public List<WebElement> getElementsByXpath(WebDriver driver, String xpathExpression) throws Exception {
        List<WebElement> results = driver.findElements(By.xpath(xpathExpression));

        return results;
    }

    @Override
    public void waitForElementToBeClickable(WebDriver driver, WebElement element) throws Exception {
        WebDriverWait wait=new WebDriverWait(driver,8000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Override
    public void click(WebElement element) throws Exception {
    element.click();
    }

    @Override
    public String getAttribute(WebElement element, String attribute) throws Exception {
        return element.getAttribute(attribute);
    }

    @Override
    public String getCssValue(WebElement element, String cssPropertyName) throws Exception {
        return element.getCssValue(cssPropertyName);
    }

    @Override
    public boolean isElementEnabled(WebElement element) throws Exception {
        return element.isEnabled();
    }

    @Override
    public boolean isElementVisible(WebElement element) throws Exception {
        return element.isDisplayed();
    }

    @Override
    public boolean isElementSelected(WebElement element) throws Exception {
        return element.isSelected();
    }
}
