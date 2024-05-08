package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.page.ProductsPageController;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductCardTest  extends ParentTest {
    private ProductsPageController productsPageController = new ProductsPageController(driver);


    @Test
    public void testSearch() {
        driver.get("https://www.michaelclement.eu/practice-ui-automation/");
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.fillSearch("Mug");
        Assertions.assertEquals(1, productsPageController.getProductCount());
        Assertions.assertEquals("Michael's Mug", productsPageController.getProductTitleText().get(0));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
