package commonLibs.implementation;

import commonLibs.contracts.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class commonDriver implements Driver {

    private WebDriver driver;
    private long pageLoadTimeout;
    private long elementDetectionTimeout;

    public WebDriver getDriver() {

        return driver;
    }

    public void setPageLoadTimeout(long pageLoadTimeout) {
        this.pageLoadTimeout = pageLoadTimeout;
    }

    public void setElementDetectionTimeout(long elementDetectionTimeout) {
        this.elementDetectionTimeout = elementDetectionTimeout;
    }


    public commonDriver(String browserType) throws Exception {
        //trimming the extra white space from the string
        browserType=browserType.trim();
        if ("firefox".equals(browserType.toLowerCase())) {

            System.setProperty("webdriver.gecko.driver","C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if ("chrome".equals(browserType.toLowerCase())) {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if ("ie".equals(browserType.toLowerCase())) {
            driver = new InternetExplorerDriver();

        } else {
            throw new Exception("Invalid Browser type" + browserType);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //setting the values for waiting times

        pageLoadTimeout=201;
        elementDetectionTimeout=601;



    }

    @Override
    public void openBrowserAndGetURL(String url) throws Exception {

        driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);

        url=url.trim();
        driver.get(url);

    }

    @Override
    public String getTitle() throws Exception {
        return driver.getTitle();
    }

    @Override
    public String getCurrentURL() throws Exception {
        return driver.getCurrentUrl();
    }

    @Override
    public String getPageSource() throws Exception {
        return driver.getPageSource();
    }

    @Override
    public void navigateToURL(String url) throws Exception {
    url=url.trim();
    driver.navigate().to(url);
    }

    @Override
    public void navigateToForward() throws Exception {
    driver.navigate().forward();
    }

    @Override
    public void navigateToBackward() throws Exception {
    driver.navigate().back();
    }

    @Override
    public void refresh() throws Exception {
    driver.navigate().refresh();
    }

    @Override
    public void closeBrowser() throws Exception {
        driver.close();
    }

    @Override
    public void closeAllBrowsers() throws Exception {
        driver.quit();
    }

    @Override
    public void waitForElementPresent(WebDriver driver, WebElement element) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,4000);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

}
