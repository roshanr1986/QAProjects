package com.mercuryTravels.Steps;

import com.mercuryTravel.MtHomePage;
import com.mercuryTravels.Runner.BaseUtils;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.commonUtils.property;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class hooks extends BaseUtils {

    public BaseUtils setup;
    public commonDriver comDriver;
    public WebDriver driver;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public hooks(BaseUtils setup) throws Exception {

        setup.setupbrowser();
        this.driver = setup.driver;
        this.comDriver = setup.comdriver;

    }


    @Before
    public void initializeTest() throws Exception {

        System.out.println("Executing the before class");

        //comDriver=new commonDriver("Chrome");
        //base.stepInfo="Message on initializing Test";


    }

    @After
    public void tearDownTest(Scenario scenario) throws Exception {
        System.out.println("Executing the after class");
        if (scenario.isFailed()) {

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            TakeScreenShots camera = new TakeScreenShots(driver);
            camera.captureAndSaveScreenShots(scenario.getName().toString()+" "+sdf.format(timestamp));
            comDriver.closeBrowser();
        }
    }
}
