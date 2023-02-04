package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
    public static WebDriver driver;

    public CompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = (driver);
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCompletePage;

    public boolean verifyCompletePage() { // memastikan user berada di halaman landing page
        verifyCompletePage.isDisplayed();
        return true;
    }

}
