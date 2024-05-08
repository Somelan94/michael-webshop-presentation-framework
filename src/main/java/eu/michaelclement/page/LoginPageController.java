package eu.michaelclement.page;

import eu.michaelclement.util.User;
import org.openqa.selenium.WebDriver;

public class LoginPageController extends LoginPageElements {


    public LoginPageController(WebDriver driver) {
        super(driver);
    }

    private void fillUsernameField(String username){
        usernameField.sendKeys(username);
    }
    private void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    private void clickLoginButton() {
        loginButton.click();
    }

    public void login(User user) {
        fillUsernameField(user.getUsername());
        fillPasswordField(user.getPassword());
        clickLoginButton();
    }
}
