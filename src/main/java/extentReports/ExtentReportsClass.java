package extentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import commonLibs.implementation.TakeScreenShots;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import utils.commonUtils.getTimeStamp;
import utils.commonUtils.property;

import java.io.File;
import java.io.IOException;

public class ExtentReportsClass {
    public ExtentReports extent;
    public ExtentTest logger;

    public void setupReports(){
        //getting timestamp to be entered into the extent report's fileName which creates a new report every time reports are run
        getTimeStamp time = new getTimeStamp();
        String timestamp = time.getTimeStamp().toString().trim();

        extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/SMTExtentReportSanity_9.15-2.html", false);
        extent.addSystemInfo("Host Name","Roshan");
        extent.addSystemInfo("Environment","Automation testing");
        extent.addSystemInfo("User Name","Roshan Ranasinghe");

        extent.loadConfig(new File("C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\main\\java\\extentReports\\extent-config.xml"));

    }

    public void getResult(ITestResult result, WebDriver driver ) throws Exception{
        if (result.getStatus() == ITestResult.FAILURE) {
           // logger = extent.startTest(result.getName().toString());
            logger.log(LogStatus.FAIL, "Test case failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test case Error " + result.getThrowable());

            //Taking screenshot if test fails
            TakeScreenShots camera = new TakeScreenShots(driver);
            getTimeStamp timeStamp = new getTimeStamp();
            String time = timeStamp.getTimeStamp();
            String fileName = result.getName().toString();
            camera.captureAndSaveScreenShots(fileName+"_"+time);

            //checking if screenshot has been saved and its available
            String filePathString = property.screenshotImageFilePath+fileName+"_"+time+property.screenshotImageFileExtension;
            File f = new File(filePathString);
                if(f.exists() && !f.isDirectory()) {

                    //attaching screenshot file to Extent report
                    logger.log(LogStatus.FAIL,logger.addScreenCapture(filePathString));
                } else {
                    throw new IOException("Screenshot file is not available at - "+filePathString);
                }

        } else if (result.getStatus() == ITestResult.SKIP) {
            //logger = extent.startTest(result.getName().toString());
            logger.log(LogStatus.SKIP, "Test case was skipped " + result.getName());
        } else if(result.getStatus()==ITestResult.SUCCESS) {
            //logger = extent.startTest(result.getName().toString());
            logger.log(LogStatus.PASS, "Test PASSED " + result.getName());
        }
        extent.endTest(logger);

    }

    public void endReport(){
        extent.flush();
    }

    public void setLogStatus(String message){
        logger.log(LogStatus.INFO, message);
    }

    public void startTest(String testName){
        logger = extent.startTest(testName);
    }


}

