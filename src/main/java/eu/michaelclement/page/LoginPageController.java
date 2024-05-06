package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {


    public LoginPageController(WebDriver driver) {
        super(driver);
    }

    public void fillUsernameField(String username){
        usernameField.sendKeys(username);
    }
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
}
