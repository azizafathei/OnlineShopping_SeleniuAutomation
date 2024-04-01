package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCart extends PageBase{
    public ViewCart(WebDriver driver) {
        super(driver);
    }


      //locators
    @FindBy(css="a.btn.btn-default.check_out")
    WebElement checkoutbtn;

    @FindBy(partialLinkText = "Place")
    WebElement placeOrderbtn;

    public void clickcheckoutbtn()
    {
        clickButton(checkoutbtn);
    }

    public void ClickOrderBtn()
    {
        clickButton(placeOrderbtn);
    }
}
