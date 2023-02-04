package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {

    private WebDriver webDriver;

    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout page")
    public void verifyCheckout() throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        Assert.assertTrue(checkoutPage.verifyChecoutPage());
        Thread.sleep(5000);
    }

    @When("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as postalCode")
    public void inputCredential(String firstName, String lastName, String postalCode) throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        checkoutPage.setFirsrtName (firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);
        checkoutPage.clickContinue();
        Thread.sleep(5000);
    }

    @Then("User see error \"(.*)\" on checkout page") //identitas final method
    public void verifyErrorCheckoutText(String errortext) throws InterruptedException {
        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        assertEquals(errortext,checkoutPage.verifyErrorText());
        Thread.sleep(5000);
    }

}
