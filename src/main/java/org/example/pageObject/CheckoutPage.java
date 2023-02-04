package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = (driver);
    }

    //Deklarasi Elemen
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firsrtName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = " //input[@id='continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//h3")
    private WebElement errorText;

    public void setFirsrtName(String first) {

        firsrtName.sendKeys(first);
    }

    public void setLastName(String last) {

        lastName.sendKeys(last);
    }

    public void setPostalCode(String postal) {

        postalCode.sendKeys(postal);
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public String verifyErrorText() {

        return errorText.getText();
    }

    public boolean verifyChecoutPage() { // bener bner tapil dlm keadaan true / di login page
        firsrtName.isDisplayed();
        return true;
    }

}


