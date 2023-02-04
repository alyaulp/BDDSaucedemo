package step_definitions;

import cucumber.api.java.en.Then;
import org.example.pageObject.CompletePage;
import org.example.pageObject.OverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CompleteSteps {
    private WebDriver webDriver;

    public CompleteSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on complete page") // untuk skenario di feature
    public void verifyCompletePage() {
        CompletePage completePage = new CompletePage(webDriver);
        Assert.assertTrue(completePage.verifyCompletePage());
    }
}
