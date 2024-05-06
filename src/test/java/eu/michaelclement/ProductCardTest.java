package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.page.ProductsPageController;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductCardTest {

    WebDriver driver = new ChromeDriver();

    LoginPageController loginPageController = new LoginPageController(driver);

    ProductsPageController productsPageController = new ProductsPageController(driver);


    @Test
    public void testSearch() {
        driver.get("https://www.michaelclement.eu/practice-ui-automation/");
        loginPageController.fillUsernameField("practiceUser");
        loginPageController.fillPasswordField("practicePass");
        loginPageController.clickLoginButton();
        productsPageController.fillSearch("Mug");
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
