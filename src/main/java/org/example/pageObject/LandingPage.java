package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
    public static WebDriver driver;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyLandingPage;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement basket1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement basket2;

    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement jacket;

    public void cartButton() { // memanggil path buka atau klik cart
        cartButton.click();
    }

    public void sortProduct(String sort){ // memanggil path urutan produk
        Select a = new Select(selectContainer);
        a.selectByVisibleText(sort);
    }

    public void clickBasket1() {  // memanggil path menambahkan produk ke cart
        basket1.click();
    }

    public void clickBasket2() {  // memanggil path menambahkan produk ke cart
        basket2.click();
    }

    public void clickJacket() {  // memanggil path menambahkan produk ke cart
        jacket.click();
    }

    public boolean verifyLandingPage() { // memastikan user berada di halaman landing page
        verifyLandingPage.isDisplayed();
        return true;
    }
}
