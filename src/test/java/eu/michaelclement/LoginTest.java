package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver = new ChromeDriver();

    LoginPageController loginPageController = new LoginPageController(driver);

    @Test
    public void testLogin() {
        driver.get("https://www.michaelclement.eu/practice-ui-automation/");
        loginPageController.fillUsernameField("practiceUser");
        loginPageController.fillPasswordField("practicePass");
        loginPageController.clickLoginButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }

}
