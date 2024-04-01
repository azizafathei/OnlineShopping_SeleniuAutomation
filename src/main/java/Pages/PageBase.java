package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase
{
    protected WebDriver driver;
    public Actions action;
    public Select select;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    protected   static void clickButton (WebElement button)
    {
        button.click();
    }

    protected static void sendKeys(WebElement TXT, String value)
    {
        TXT.sendKeys(value);
    }

    public static void scrollToBottom(WebDriver driver)
    {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public void cleartext(WebElement elem)
    {
        elem.clear();
    }


}


