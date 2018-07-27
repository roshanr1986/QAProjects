package testNGDemo;

import org.testng.annotations.*;

public class TestingClass {

    @Test
    public void tc7(){
        System.out.println("Test case 1");
    }

    @Test (groups = {"Sanity"})
    public void tc6(){

        System.out.println("Test case 2");
    }

    @Test (groups = {"Sanity", "Smoke"})
    public void tc5(){

        System.out.println("Test case 3");
    }

    @Test(groups = {"Sanity"})
    public void tc4(){
        System.out.println("Test case 4");

    }
}
