package testNGDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestSkipDemo {
   // public ITestResult result;

    @Test
    public void preconditions(){
        int a = 1;
        System.out.println("Executing Preconditions");
        Assert.assertEquals(a, 1);

    }

    @Test(dependsOnMethods = "preconditions", groups = "A")
    public void testCode(){

    System.out.println("Executing test code");
        int b = 5;
        Assert.assertEquals(b, 10);
    }

    @Test
    public void tearDown(){
        System.out.println("Executing tear down method");

    }

    @AfterMethod
    public void afterMethod(ITestResult result){

        try {
            if(result.getStatus() == ITestResult.SUCCESS){
                System.out.println("Test case "+result.getName()+ " -- Passed");
            } else if (result.getStatus() == ITestResult.FAILURE){
                System.out.println("Test case "+result.getName()+ " -- Failed");
            } else if (result.getStatus() == ITestResult.SKIP){
                System.out.println("Test case "+result.getName()+ " -- Skipped");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
