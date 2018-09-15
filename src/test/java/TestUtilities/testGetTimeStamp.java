package TestUtilities;

import org.testng.annotations.Test;
import utils.commonUtils.getTimeStamp;

public class testGetTimeStamp {

    @Test
    public void testTimeStamp(){
        getTimeStamp time = new getTimeStamp();

        System.out.println(time.getTimeStamp());
    }

}
