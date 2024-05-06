package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;

public class ProductsPageController extends ProductsPageElements {

    public ProductsPageController(WebDriver driver) {
        super(driver);
    }

    public void fillSearch(String input) {
        searchInput.sendKeys(input);
    }

    public void fillMinimumPriceFilterField(int price) {
        minimumPriceFilterField.sendKeys(String.valueOf(price));
    }

    public void fillMaximumPriceFilterField(int price) {
        maximumPriceFilterField.sendKeys(String.valueOf(price));
    }

    public void selectSortDropdownOption(SortOption option) {
        sortDropdown.click();
        switch (option) {
            case NAME -> sortDropdownOptionName.click();
            case PRICE -> sortDropdownOptionPrice.click();
        }
    }
}
