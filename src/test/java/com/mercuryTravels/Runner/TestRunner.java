package com.mercuryTravels.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/java/com/mercuryTravels/cucumberFeatures"},
        glue = {"helpers","com/mercuryTravels/Steps"},
        monochrome = false,
        strict = false,
        dryRun = false,
        tags = {"@SmokeTest"},
        format = {"json:target/cucumber.json","html:src/site/cucumber-pretty"}
    )

public class TestRunner extends AbstractTestNGCucumberTests{
}
