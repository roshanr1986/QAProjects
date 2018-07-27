import commonLibs.implementation.commonDriver;
import commonLibs.implementation.commonElements;
import commonLibs.implementation.dropdownControls;
import commonLibs.implementation.textboxControl;
import designPatterns.AmazonPOMstyle1;
import org.openqa.selenium.WebDriver;

public class DemoSearchAmazonPOMStyle1 {

    public static void main (String[] args){

        try {
            //variables
            String url="https://www.amazon.in/";

            //initiating objects
            commonDriver cmnDriver = new commonDriver("chrome");
            textboxControl textbox = new textboxControl();
            dropdownControls dropdown = new dropdownControls();


            //navigate to url
            cmnDriver.openBrowserAndGetURL(url);

            //getting the same driver instance created initially and assign it into a new one to be used within this script
            WebDriver driver=cmnDriver.getDriver();

            commonElements comElemet = new commonElements(driver);

            //initializing the page object for the homepage
            AmazonPOMstyle1 homepage = new AmazonPOMstyle1(driver);

            //searching product in textbox
            textbox.setText(homepage.searchBox,"Apple watch");

            // selecting the cateogory in the dropdown
            dropdown.selectByVisibleText(homepage.searchCategory, "Watches");

            //click on search button
            comElemet.click(homepage.searchButton);





        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
