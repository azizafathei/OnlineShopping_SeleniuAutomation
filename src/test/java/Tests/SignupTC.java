package Tests;

import Pages.HOME;
import Pages.SIGNUP;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupTC extends TestBase
{
    HOME homeobj;

    SIGNUP signupobj;
    ExcelReader dataobj=new ExcelReader();


    @DataProvider(name ="testdata")
    public Object[][] excelDP() throws IOException
    {
        Object[][] arrObj = dataobj.getExcelData("src/main/resources/userData.xlsx","Sheet1");
        return arrObj;
    }

    //  test case 1 : register user
    @Test(dataProvider = "testdata")
    public void SignUP(String name, String mail
          , String password, String fname, String  lname,
            String address ,String state, String city, String code, String number)

    {
        homeobj=new HOME(driver);
        homeobj.OpenSignupPage();
        signupobj=new SIGNUP(driver);
        signupobj.SignUP(name,mail,password,fname,lname,address,state,city,code,number);

        homeobj.OpenSignupPage();
        homeobj.logout();
    }

// asertion to validate signup test case
    //  Assert.assertTrue(signupobj.signSuccess.getText().contains("Congratulations! Your new account has been successfully created!"));

}
