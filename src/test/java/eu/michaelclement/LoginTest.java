package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.util.User;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends ParentTest {

    @Test
    public void testLogin() {
        driver.get("https://www.michaelclement.eu/practice-ui-automation/");
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
