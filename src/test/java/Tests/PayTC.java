package Tests;

import Pages.HOME;
import Pages.Payment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PayTC extends TestBase
{
    Payment payobj;
    HOME homeobj;
    //test case 10 enetr payment info and pay
    @Test
    public void Pay()
    {
        payobj=new Payment(driver);
        payobj.pay("aza","3566000020000410","123","09","2026");

        // assertion that payment process success
        Assert.assertTrue(payobj.paySuccess.getText().equalsIgnoreCase("Download Invoice"));

        //test case 11: download invoice
        payobj.paySuccess.click();

        homeobj=new HOME(driver);
        homeobj.OpenHomePage();

    }
}
