package main.Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    @FindBy(id = "UserName")
    private WebElement txtUsername;

    @FindBy(id = "Password")
    private WebElement txtPassword;

    @FindBy(xpath =" //input[@value='Log in']")
    private WebElement btnLogin;

    public void ClickLoginlink() {
        lnkLogin.click();
    }

    public void EnterLoginDetails(String userName, String password) {
        txtUsername.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLoginButton() {
        btnLogin.submit();
    }
}
