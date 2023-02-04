package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
                System.getProperty("user.dir") + "/driver/chromedriver.exe");

        webDriver = new ChromeDriver();
        String appUrl = "https://www.saucedemo.com/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//        driver.findElement(By.xpath("//input[@id='login-button']")).click();
//
//        Thread.sleep(20000);
    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }
}
