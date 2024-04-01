package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HOME  extends PageBase
{
    public HOME(WebDriver driver) {
        super(driver);
    }


    //locators
    @FindBy(partialLinkText = "Signup")
   public WebElement SignUpBTN;

    @FindBy(partialLinkText = "Logout")
   public WebElement logoutbtn;

    @FindBy(partialLinkText = "Contact")
    WebElement contactusBTN;

    @FindBy(css = "i.material-icons.card_travel")
    WebElement productsbtn;

    @FindBy(css = "i.fa.fa-shopping-cart")
    WebElement cartbtn;
    @FindBy(css = "a.left.control-carousel.hidden-xs")
    WebElement SliderNextBtn;

    @FindBy(linkText = "Home")
    WebElement homebtn;

    public void OpenHomePage()
    {
        clickButton(homebtn);
    }

    public  void ClickSliderNext()
    {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.elementToBeClickable(SliderNextBtn));
        clickButton(SliderNextBtn);

    }

    public void OpenProductsPage()
    {
        clickButton(productsbtn);
    }
    public void OpenCartPage()
    {
        clickButton(cartbtn);
    }


    public void OpenSignupPage()
    {
        clickButton(SignUpBTN);
    }

    public void logout()
    {
        clickButton(logoutbtn);
    }

    public void OpenContactusPage()
    {
        clickButton(contactusBTN);
    }
}
