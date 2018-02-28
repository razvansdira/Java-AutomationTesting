package de.gourmondo.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWishlistPage extends PageObject {
//    @FindBy(css = ":last-child[class=\"row wishlist-row\"] :nth-child(2) div a")
    @FindBy(css = "[class=\"colW-5 col-sm-9 col-product-details\"]")
    private List<WebElement> titles;
//    private WebElement title;

    public Boolean checkIfProductIsInWishlist() {
        for (WebElement product : titles) {
            if (product.findElement(By.cssSelector(".product-name a")).getText().toLowerCase()
                    .equals(Serenity.sessionVariableCalled("productTitle").toString().toLowerCase())) {
                System.out.println("The product was not added.");
                return false;
            }
        }
        System.out.println("The product was added.");
        return true;
    }

//    public void clickOnWishProduct() {
//        title.click();
//    }
}