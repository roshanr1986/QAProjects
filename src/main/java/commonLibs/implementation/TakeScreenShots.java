package commonLibs.implementation;

import commonLibs.contracts.ITakeScreenShots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import utils.commonUtils.property;

import java.io.File;
import java.sql.Timestamp;

public class TakeScreenShots implements ITakeScreenShots {
    private WebDriver driver;


    public TakeScreenShots(WebDriver driver) {
        this.driver=driver;
    }


    @Override
    public void captureAndSaveScreenShots(String fileName) throws Exception {
        fileName=fileName.trim();
        //declairing two files (actual and temp)
        File imgFile, tempFile;

         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String subfolder=timestamp.toString().trim();

        imgFile=new File(property.screenshotImageFilePath+fileName+property.screenshotImageFileExtension);
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
