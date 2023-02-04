package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = (driver);
    }

    //Deklarasi element
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement btnLogin;

    @FindBy(xpath = "//h3")
    private WebElement errorText;

    public String verifyErrorText() {

        return errorText.getText();
    }

    public void setUsername(String user){

        userName.sendKeys(user);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean verifyLoginPage() { // bener bner tapil dlm keadaan true / di login page
        userName.isDisplayed();
        return true;
    }


}