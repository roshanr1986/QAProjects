package com.mercuryTravels.Steps;

import com.mercuryTravel.MtHomePage;
import commonLibs.implementation.TakeScreenShots;
import commonLibs.implementation.commonDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.commonUtils.property;

public class hooks {




    @Before
    public void initializeTest() throws Exception{

        System.out.println("Executing the before class");
        //comDriver=new commonDriver("Chrome");


    }

    @After
    public void tearDownTest(Scenario scenario) throws Exception {
        System.out.println("Executing the after class");
        if (scenario.isFailed()){
            TakeScreenShots camera = new TakeScreenShots(stepsTestBranchAddress.driver);
            camera.captureAndSaveScreenShots(scenario.getName().toString());
        }
    }
}
