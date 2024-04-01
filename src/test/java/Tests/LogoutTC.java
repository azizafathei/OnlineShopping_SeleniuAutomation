package Tests;

import Pages.Logout;
import org.testng.annotations.Test;

public class LogoutTC extends TestBase
{
    Logout logoutobj;

    //test case 14 ; logout
    @Test
    public void logout()
    {
        logoutobj=new Logout(driver);
        logoutobj.logout();
    }
}
