package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Products extends PageBase
{

    public Products(WebDriver driver)
    {
        super(driver);
    }


      //locators
    @FindBy(id ="search_product")
    WebElement searchtxt;

    @FindBy(css = "i.fa.fa-search")
    WebElement searchbtn;

    @FindBy(linkText = "View Product")
    WebElement viewProdlink;
    public void SearchProduct(String ProName)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchtxt));
        searchtxt.clear();
        sendKeys(searchtxt,ProName);
        clickButton(searchbtn);
        clickButton(viewProdlink);

    }
}
