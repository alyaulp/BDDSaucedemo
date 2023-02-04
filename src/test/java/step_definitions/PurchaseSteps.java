package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.LandingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    // membuat function untuk memanggil path di LandingPage
    @Then("User already on landing page") // untuk skenario di feature
    public void verifyLandingPage() {
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.verifyLandingPage());
    }

    @And("User sort product list by \"(.*)\"")
    public void sortProductValue(String sort) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.sortProduct(sort);
        Thread.sleep(5000);
    }

    @And("User choice 2 product from the list") //scenario
    public void choiceBasket() throws InterruptedException { //fungtion
        LandingPage landingPage = new LandingPage(webDriver); //memanggil class
        landingPage.clickBasket1(); //memanggil salah satu fungsi dlm class td
        landingPage.clickBasket2(); //memanggil salah satu fungsi dlm class td
        Thread.sleep(5000); // setelah klik tombol cart maka akan ke delay 5 detik
    }

    @And("User choice 1 product from the list") //scenario
    public void choiceBasketTas() throws InterruptedException { //fungtion
        LandingPage landingPage = new LandingPage(webDriver); //memanggil class
        landingPage.clickJacket(); //memanggil salah satu fungsi dlm class td
        Thread.sleep(5000); // setelah klik tombol cart maka akan ke delay 5 detik
    }


    @And("User click cart")
    public void cartButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.cartButton();
        Thread.sleep(5000); // setelah klik tombol cart maka akan ke delay 5 detik
    }

}
