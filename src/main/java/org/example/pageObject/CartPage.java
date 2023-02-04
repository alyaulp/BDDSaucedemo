package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyCartPage;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;


    public boolean verifyCartPage() { // memastikan user berada di halaman landing page
        verifyCartPage.isDisplayed();
        return true;
    }

    public void continueShoppingButton() { // memanggil path buka atau klik cart
        continueShoppingButton.click();
    }

    public void checkoutButton() { // memanggil path buka atau klik cart
        checkoutButton.click(); //click termasuk pilihan yang akan di lakukan setelahnya
    }
}

