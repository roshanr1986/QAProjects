package testNGDemo;

import commonLibs.implementation.TakeScreenShots;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class TestListener implements ITestListener {
    private WebDriver driver;

    public TestListener(WebDriver driver) {
        this.driver=driver;
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        //TakeScreenShots camera = new TakeScreenShots(driver);
        //Timestamp timestamp=new Timestamp(System.currentTimeMillis());

//"C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\screenshots\\"+subFolderName+"\\"+iTestResult.getName()+".png"
        //String subFolderName=timestamp.toString();
        try {
            captureAndSaveScreenShots(iTestResult.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    public void captureAndSaveScreenShots(String fileName) throws Exception {
        fileName=fileName.trim();
        //declairing two files (actual and temp)
        File imgFile, tempFile;

        imgFile=new File("C:\\Users\\pcadmin\\IdeaProjects\\ModulerFramework\\src\\screenshots\\"+fileName+".png");
        if (imgFile.exists()){
            throw new Exception("Duplicate File Name ...");
        }
        TakesScreenshot camera;
        camera=(TakesScreenshot)driver;
        tempFile=camera.getScreenshotAs(OutputType.FILE);
        FileUtils.moveFile(tempFile,imgFile);
        System.out.println("screen shot taken with name "+fileName);
    }

}
