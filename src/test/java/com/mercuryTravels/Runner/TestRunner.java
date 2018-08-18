package com.mercuryTravels.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/java/com/mercuryTravels/cucumberFeatures"},
        glue = {"helpers","com/mercuryTravels/Steps"}
    )

public class TestRunner extends AbstractTestNGCucumberTests{
}
