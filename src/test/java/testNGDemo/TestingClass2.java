package testNGDemo;

import org.testng.annotations.Test;

public class TestingClass2 {

    @Test(groups = {"Sanity"})
    public void tc1(){
        System.out.println("tc1 Execution from test class 2");
    }

    @Test(groups = {"Sanity"})
    public void tc2(){
        System.out.println("tc2 Execution from test class 2");
    }

    @Test
    public void tc3(){
        System.out.println("tc3 Execution from test class 2");
    }
}
