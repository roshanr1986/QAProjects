
import commonLibs.implementation.AlertControls;
import commonLibs.implementation.commonDriver;
import org.testng.annotations.Test;


public class DemoCommonDriver {


@Test
    public static void test(){

        try {
            commonDriver comDriver = new commonDriver("firefox");

            //Defining the URL on run time
           String url="https://www.mercurytravels.co.in/";

           comDriver.openBrowserAndGetURL(url);
           System.out.println(comDriver.getTitle());

            AlertControls newAlertControl = new AlertControls(comDriver.getDriver());

           comDriver.closeBrowser();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
