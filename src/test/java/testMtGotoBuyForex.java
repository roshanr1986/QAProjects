import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.commonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testMtGotoBuyForex {


    public static void main(String[] args) {
        try {
            String url="https://www.mercurytravels.co.in";
            commonDriver cmnDriver=new commonDriver("chrome");
            cmnDriver.openBrowserAndGetURL(url);
            WebDriver driver=cmnDriver.getDriver();


            MtHomePage homepage=new MtHomePage(driver);

           homepage.gotoBuyForex();
           cmnDriver.closeBrowser();


        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
