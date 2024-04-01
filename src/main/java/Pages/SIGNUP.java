package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SIGNUP extends PageBase{
    public SIGNUP(WebDriver driver)
    {
        super(driver);
    }


    //locators
    @FindBy(id = "id_gender2")
    WebElement    titleRB;
    @FindBy(id = "password")
    WebElement   passwordtxt ;
    @FindBy(id = "first_name")
    WebElement    fnametxt;
    @FindBy(id="last_name")
    WebElement  lastnametxt;  ;
    @FindBy(id = "address1")
    WebElement  addresstxt  ;
    @FindBy(id ="country")
    WebElement countryddl   ;
    @FindBy(id = "state")
    WebElement  statetxt  ;
    @FindBy(id = "city")
    WebElement citytxt   ;
    @FindBy(id = "zipcode")
    WebElement   zipcodetxt ;
    @FindBy(id = "mobile_number")
    WebElement  mobiletxt  ;
    @FindBy(css = "button.btn.btn-default")
    WebElement submitbtn;

    @FindBy(css = "div.col-sm-9.col-sm-offset-1")
     public   WebElement signSuccess;

    @FindBy(id="days")
    WebElement daysddl;

    @FindBy(id="months")
    WebElement monthsddl;
    @FindBy(id="years")
    WebElement yearsddl;
    @FindBy(name ="name")
    WebElement nametxt;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement emailtxt;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement submitBTN;

//locators and methods login
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]")
    WebElement maillogintxt;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]")
    WebElement passwordlogintxt;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button")
    WebElement loginbtn;


    public void loginAfterRegister(String mail, String password)
    {
        sendKeys(maillogintxt,mail);
        sendKeys(passwordlogintxt, password);
        clickButton(loginbtn);
    }





    public void SignUP(String name, String mail
          , String password, String fname, String  lname,
                      String address ,String state, String city, String code, String number
    )


    {
         sendKeys(nametxt,name);
         sendKeys(emailtxt,mail);
         clickButton(submitBTN);
        clickButton(titleRB);
        sendKeys(passwordtxt,password);
        select=new Select(daysddl);
        select.selectByValue("5");
        select=new Select(monthsddl);
        select.selectByValue("1");
        select=new Select(yearsddl);
        select.selectByValue("2000");
        sendKeys(fnametxt,fname);
        sendKeys(lastnametxt,lname);
        sendKeys(addresstxt,address);
        select=new Select(countryddl);
        select.selectByIndex(1);
        sendKeys(statetxt,state);
        sendKeys(citytxt,city);
        sendKeys(zipcodetxt,code);
        sendKeys(mobiletxt,number);
        clickButton(submitbtn);

    }
}
