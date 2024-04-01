package Tests;

import Pages.ContactUS;
import Pages.HOME;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactusTC extends TestBase
{
    ContactUS contactusobj;
    HOME homeobj;

    // testcase 3: Contact us Form
    @Test
    public void ContactUs()
    {
        homeobj=new HOME(driver);
        contactusobj=new ContactUS(driver);
        homeobj.OpenContactusPage();
        String filename="ContactUSform.docx";
        contactusobj.uploadFile(filename);
        contactusobj.ContactUS();
        handleAlert();

        //Assertion to validate contact us test case
        Assert.assertTrue(contactusobj.success.getText().equalsIgnoreCase("Success! Your details have been submitted successfully."));

    }


    private void handleAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
