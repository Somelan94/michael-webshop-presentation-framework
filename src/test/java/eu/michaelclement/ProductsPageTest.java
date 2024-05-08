package eu.michaelclement;

import eu.michaelclement.page.LoginPageController;
import eu.michaelclement.page.ProductsPageController;
import eu.michaelclement.util.UserFactory;
import eu.michaelclement.util.UserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductsPageTest extends ParentTest {

    private ProductsPageController productsPageController = new ProductsPageController(driver);


    @Test
    public void testSearch() {
        driver.get("https://www.michaelclement.eu/practice-webshop-login/");
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.fillSearch("Mug");
    }
    @Test
    public void testFilter() {
        driver.get("https://www.michaelclement.eu/practice-webshop-login/");
        loginPageController.login(UserFactory.getUser(UserType.VALID_USER));
        productsPageController.fillMinimumPriceFilterField(11);
        productsPageController.fillMaximumPriceFilterField(15);
        Assertions.assertEquals(2, productsPageController.getProductCount());
        Assertions.assertEquals("Michael's Cap", productsPageController.getProductTitleText().get(0));
        Assertions.assertEquals("Michael's Notebook", productsPageController.getProductTitleText().get(1));


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
