package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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
            default -> throw new RuntimeException("Nincs ilyen elem");
        }
    }

    public int getProductCount() {
        return productCards.size();
    }

    public List<String> getProductTitleText() {
        List<String> titleList = new ArrayList<>();
        for (WebElement title:productTitleText) {
            titleList.add(title.getText());
        }
        return titleList;
    }
}

