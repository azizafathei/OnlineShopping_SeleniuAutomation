package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends PageBase
{

    public Logout(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(linkText = "Logout")
    WebElement logout;
    @FindBy(linkText = "Home")
    WebElement homepage;
    public void logout()
    {
        clickButton(logout);
        clickButton(homepage);


    }

}
