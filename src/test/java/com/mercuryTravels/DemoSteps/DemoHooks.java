package com.mercuryTravels.DemoSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class DemoHooks {

    @Before
    public void setUp(){
        System.out.println("== Cucumber Before -- SetUp browser ==");
    }

    @After
    public void tearDown(){
        System.out.println(" == cucumber After -- tearDown ==");

    }
}
