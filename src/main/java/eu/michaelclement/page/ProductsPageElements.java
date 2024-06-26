package eu.michaelclement.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class ProductsPageElements {
    @FindBy(xpath = "//input[@id='product-search']")
    protected WebElement searchInput;

    @FindBy(xpath = "//input[@id='min-price']")
    protected WebElement minimumPriceFilterField;

    @FindBy(xpath = "//input[@id='max-price']")
    protected WebElement maximumPriceFilterField;
    @FindBy(xpath = "//select[@id='sort-by']")
    protected WebElement sortDropdown;
    @FindBy(xpath = "//option[@value='name']")
    protected WebElement sortDropdownOptionName;
    @FindBy(xpath = "//option[@value='price']")
    protected WebElement sortDropdownOptionPrice;

    @FindBy(xpath = "//div[@class='product-card']")
    protected List<WebElement> productCards;

    @FindBy(xpath = "//div[@class='product-card']/h3")
    protected List<WebElement> productTitleText;
    @FindBy(xpath = "//div[@class='product-card']/p[1]")
    protected List<WebElement> productDescriptionText;
    @FindBy(xpath = "//div[@class='product-card']/p[2]")
    protected List<WebElement> productPriceText;
    public ProductsPageElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
