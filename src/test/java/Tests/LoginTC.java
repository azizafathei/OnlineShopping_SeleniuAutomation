package Tests;

import Pages.HOME;
import Pages.SIGNUP;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTC extends TestBase
{

    SIGNUP loginobj;
    HOME homeobj;

    //test case 3: login user with correct email and password
    @Test
    public void Login()
    {
        loginobj=new SIGNUP(driver);
        homeobj=new HOME(driver);
        homeobj.OpenSignupPage();
        loginobj.loginAfterRegister("ahmdAdelDev@gmail.com","123afsafs");
        // assertion to validate login tc
        Assert.assertTrue(homeobj.logoutbtn.isDisplayed());
    }

    //test case 4:  navigate throught a slider carousel
    @Test
    public void NextButton()
    {

        homeobj.ClickSliderNext();
    }
}
