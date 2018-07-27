import commonLibs.implementation.commonDriver;
import designPatterns.AmazonPOMstyle2;
import designPatterns.AmazonPageFactory;
import org.openqa.selenium.WebDriver;

public class DemoSearchAmazonPOMStyle3 {

    public static void main (String[] args){


        try {

            String url="https://www.amazon.in/";

            //creating common driver
            commonDriver cmnDriver = new commonDriver("chrome");

            cmnDriver.openBrowserAndGetURL(url);
            WebDriver driver = cmnDriver.getDriver();

            AmazonPageFactory homepage = new AmazonPageFactory(driver);

            String result=homepage.searchPoduct("Apple watch","Watches");
            System.out.println(result);
            cmnDriver.closeBrowser();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
