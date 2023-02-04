package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class OverviewSteps {

    private WebDriver webDriver;

    public OverviewSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on overview page")
    public void verifyOverview() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        Assert.assertTrue(overviewPage.verifyOverviewPage());
        Thread.sleep(5000);
    }

    @Then("Total must be match between expect and actual")
    public void verifyTotal() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);

        Float expektasiTotal = overviewPage.Jumlah(); // manggil func penjumlahan pajak + itemtotal
        Float totalSeharusnya = overviewPage.Total(); // manggil func total seharusnya

        Assert.assertEquals(expektasiTotal, totalSeharusnya);
        Thread.sleep(5000);
    }

    @And("User click finish")
    public void choiceFinish() throws InterruptedException {
        OverviewPage overviewPage = new OverviewPage(webDriver);
        overviewPage.clickFinish();
        Thread.sleep(5000);
    }



}
