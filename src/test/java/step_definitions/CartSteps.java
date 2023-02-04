package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private WebDriver webDriver;

    public CartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on cart page") // untuk skenario di feature
    public void verifyCartPage() {
        CartPage cartPage = new CartPage(webDriver);
        Assert.assertTrue(cartPage.verifyCartPage());
    }

    @And("User click continue shopping")
    public void continueShoppingButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.continueShoppingButton();
        Thread.sleep(5000);
    }

    @And("User click checkout")
    public void checkoutButton() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.checkoutButton();
        Thread.sleep(5000); // setelah klik tombol cart maka akan ke delay 5 detik
    }



}
