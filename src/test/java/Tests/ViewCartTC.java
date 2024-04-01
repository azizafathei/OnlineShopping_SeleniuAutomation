package Tests;

import Pages.ViewCart;
import org.testng.annotations.Test;

public class ViewCartTC extends TestBase
{
    ViewCart cartobj;

    // test case 9: step 1 of checkout process (clcik checkout btn for registered user)
    @Test
    public void ClickCheckoutBtn()
    {
        cartobj=new ViewCart(driver);
        cartobj.clickcheckoutbtn();
        cartobj.ClickOrderBtn();
    }
}
