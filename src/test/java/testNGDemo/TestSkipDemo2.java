package testNGDemo;

import org.testng.annotations.Test;

public class TestSkipDemo2 {

    @Test(dependsOnGroups = "A")
    public void testInAnotherClass(){
        System.out.println("testInAnotherClass is Executed");
    }
}
