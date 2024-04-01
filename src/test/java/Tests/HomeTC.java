package Tests;

import Pages.HOME;
import org.testng.annotations.Test;

public class HomeTC extends TestBase
{
    HOME homepage;
    @Test
    public void OpenSignupPage()
    {
        homepage=new HOME(driver);
        homepage.OpenSignupPage();
    }
}
