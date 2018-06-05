package de.gourmondo.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

//@DefaultUrl("https://common.gourmondo.de/")
//@DefaultUrl("https://dev-de.gourmondo.de/")
//@DefaultUrl("https://dev-int.gourmondo.de/")
//@DefaultUrl("https://test.gourmondo.de/")
//@DefaultUrl("https://test-de.gourmondo.evozon.com/")
//@DefaultUrl("https://www.gourmondo.de/")
@DefaultUrl("https://stage.gourmondo.de/")

public class HomePage extends PageObject {

    @FindBy(css = ".title-wrapper")
    private WebElement title;

    @FindBy(css = "[class=\"category\"]")
    private List<WebElement> categories;

    @FindBy(css = "[class=\"category\"]")
    private List<WebElement> subcategories;

    @FindBy(css = ".product-item")
    private List<WebElement> products;

    @FindBy(css = "#colorbox")
    private WebElementFacade newsletterModal;

    @FindBy(css = "#cboxClose")
    private WebElement closePopup;

    public void clickOnTitle() {
        title.click();
    }

    public void clickOnCategory(int categoryIndex) {
        categories.get(categoryIndex).findElement(By.cssSelector("a")).click();
    }

    public void clickOnSubcategory(int subcategoryIndex) {
        subcategories.get(subcategoryIndex).findElement(By.cssSelector("a")).click();
    }

    public void clickOnProduct(int productIndex) {
        products.get(productIndex).findElement(By.cssSelector("a")).click();
    }

    public void clickOnRandomCategory() {
        Integer categoryNo = Math.abs(new Random().nextInt(categories.size()));
        setCategoryTitleInSession(categories.get(categoryNo).findElement(By.cssSelector(".image-wrapper > a"))
                .getAttribute("image"));
        clickOnCategory(categoryNo);
    }

    public void clickOnRandomSubcategory() {
        Integer subcategoryNo = Math.abs(new Random().nextInt(subcategories.size()));
        setSubcategoryTitleInSession(subcategories.get(subcategoryNo).findElement(By.cssSelector(".image-wrapper > a"))
                .getAttribute("title"));
        clickOnSubcategory(subcategoryNo);
    }

    public void clickOnRandomProduct() {
        Integer productNo = Math.abs(new Random().nextInt(products.size()));
        setProductTitleInSession(products.get(productNo).findElement(By.cssSelector(".title-wrapper > a"))
                .getAttribute("title"));
        clickOnProduct(productNo);
    }

    public void setCategoryTitleInSession(String title) {
        Serenity.setSessionVariable("categoryTitle").to(title);
    }

    public void setSubcategoryTitleInSession(String title) {
        Serenity.setSessionVariable("subcategoryTitle").to(title);
    }

    public void setProductTitleInSession(String title) {
        Serenity.setSessionVariable("productTitle").to(title);
    }

    public void clickOnXPopup() {
        if (newsletterModal.isVisible())
            closePopup.click();
    }
}