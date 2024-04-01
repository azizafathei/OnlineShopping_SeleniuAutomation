package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetails extends  PageBase{
    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy (xpath = "//div[@class='product-information']/h2")
     public   WebElement checkProdName;
     @FindBy(id = "name")
    WebElement nametxt;
     @FindBy(id="email")
    WebElement mailtxt;
     @FindBy(id = "review")
    WebElement reviewtxt;
     @FindBy(id = "button-review")
    WebElement submitbtn;
     @FindBy(id = "quantity")
     WebElement quantxt;

    @FindBy(css = "button.btn.btn-default.cart")
    WebElement AddCartBtn;

    @FindBy(id="cartModal")
    WebElement modal;

    @FindBy(xpath = "//div[@class='modal-body']/p")
    public   WebElement  addedSuccess;

    @FindBy(css ="button.btn.btn-success.close-modal.btn-block")
    WebElement Continue;
     public void AddReview(String name, String mail, String review)
     {
           sendKeys(nametxt,name);
           sendKeys(mailtxt,mail);
           sendKeys(reviewtxt,review);
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.invisibilityOf(modal));
           clickButton(submitbtn);
     }

     public void changeProdQuantity()
     {
         quantxt.clear();
         sendKeys(quantxt,"5");
     }

     public void AddToCart()
     {
         clickButton(AddCartBtn);
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(Continue));
         clickButton(Continue);

     }

}
