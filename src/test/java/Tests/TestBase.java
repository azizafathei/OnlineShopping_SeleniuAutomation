package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;

public class TestBase
{

    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public void startdriver(  @Optional("chrome") String  browser) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().clearDriverCache().setup();
            WebDriverManager.chromedriver().clearResolutionCache().setup();
            WebDriverManager.chromedriver().setup();

            // Add uBlock Origin extension
            ChromeOptions options = new ChromeOptions();
            options.addExtensions(new File("src/main/resources/ublockorigin.crx"));

           driver=new ChromeDriver(options);
            // Wait for the extension to load
            Thread.sleep(5000);

        }
        if(browser.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();

            // Add uBlock Origin extension
            FirefoxProfile profile = new FirefoxProfile();
            profile.addExtension(new File("src/main/resources/ublockorigin.crx"));
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(profile);
            driver=new FirefoxDriver(options);

            // Wait for the extension to load
            Thread.sleep(5000);
        }

        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");

    }

//    @AfterSuite
//    public void stopdriver()
//    {
//        driver.quit();
//    }

}
