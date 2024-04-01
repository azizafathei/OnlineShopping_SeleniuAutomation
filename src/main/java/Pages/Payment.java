package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends PageBase{
    public Payment(WebDriver driver)
    {
        super(driver);
    }


    //locators
    @FindBy(name = "name_on_card")
    WebElement nametxt;
    @FindBy(name = "card_number")
    WebElement cardNumbertxt;
    @FindBy(name = "cvc")
    WebElement cvctxt;

    @FindBy(name = "expiry_month")
    WebElement monthtxt;

    @FindBy(name = "expiry_year")
    WebElement yeartxt;

    @FindBy(id = "submit")
    WebElement submit;
    @FindBy(partialLinkText = "Download")
   public WebElement paySuccess;

    public void pay(String name,String number, String cvc, String month, String year)
    {
        sendKeys(nametxt,name);
        sendKeys(cardNumbertxt,number);
        sendKeys(cvctxt,cvc);
        sendKeys(monthtxt,month);
        sendKeys(yeartxt,year);
        clickButton(submit);
    }
}
