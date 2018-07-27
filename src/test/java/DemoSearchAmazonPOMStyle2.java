import commonLibs.implementation.commonDriver;
import designPatterns.AmazonPOMstyle2;
import org.openqa.selenium.WebDriver;

public class DemoSearchAmazonPOMStyle2 {

    public static void main (String[] args){


        try {

            String url="https://www.amazon.in/";

            //creating common driver
            commonDriver cmnDriver = new commonDriver("chrome");

            cmnDriver.openBrowserAndGetURL(url);
            WebDriver driver = cmnDriver.getDriver();

            AmazonPOMstyle2 homepage = new AmazonPOMstyle2(driver);

            homepage.searchPoduct("Apple watch","Watches");
            cmnDriver.closeBrowser();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
