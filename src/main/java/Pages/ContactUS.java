package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;


public class ContactUS  extends PageBase
{
    public ContactUS(WebDriver driver)
    {
        super(driver);
    }

    //locators
    @FindBy(name = "name")
    WebElement name;

    @FindBy(name = "email")
    WebElement email;


    @FindBy(name = "subject")
    WebElement subject;

    @FindBy(name = "message")
    WebElement message;

    @FindBy(name = "upload_file")
    WebElement uploadButton;

    @FindBy(name = "submit")
    WebElement submitbtn;

    @FindBy(css = "div.status.alert.alert-success")
   public WebElement success;


    public void uploadFile(String fileName)
    {
        String filePath = getResourceFilePath(fileName);
         sendKeys(uploadButton,filePath);
    }

    private String getResourceFilePath(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file.getAbsolutePath();
    }

    public void ContactUS( )
    {
        sendKeys(name,"aza");
        sendKeys(email,"azaahmd@gmail.com");
        sendKeys(subject,"order not received yet");
        sendKeys(message,"order not received");
        clickButton(submitbtn);


    }




}
