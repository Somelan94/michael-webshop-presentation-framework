package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.util.DriverFactory;
import eu.michaelclement.util.DriverType;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class ParentTest {

    protected final WebDriver driver = DriverFactory.getDriver(DriverType.CHROME);

    protected final LoginPageController loginPageController = new LoginPageController(driver);

}
