package Tests;

import Pages.SubScription;
import org.testng.annotations.Test;

public class SubscribeTC extends TestBase
{
    SubScription obj;

    // testcase 12: scroll down functionality
    //test case 13 : subscription functionality
    @Test
    public void SubScription( )
    {
        obj=new SubScription(driver);
        obj.ScrollDown(driver);
        obj.susbscribe_email("aza@gmail.com");
        obj.ScrollUP();
    }
}
