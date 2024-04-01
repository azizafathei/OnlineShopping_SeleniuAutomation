package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubScription extends PageBase
{
    public SubScription(WebDriver driver) {
        super(driver);
    }


    //locators
    @FindBy(id = "susbscribe_email")
    WebElement emailtxt;
    @FindBy(id = "subscribe")
    WebElement subscribebtn;

    @FindBy(id = "scrollUp")
    WebElement scrollup;
        public void ScrollDown (WebDriver driver)
    {
         scrollToBottom(driver);
    }

    public void susbscribe_email (String mail)
    {
        sendKeys(emailtxt,mail);
        clickButton(subscribebtn);
    }

    public void ScrollUP ( )
    {
         clickButton(scrollup);
    }

}
