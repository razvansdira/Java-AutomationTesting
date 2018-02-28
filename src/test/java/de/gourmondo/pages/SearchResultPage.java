package de.gourmondo.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends PageObject{

    @FindBy(css = ".product-item")
    private List<WebElement> products;

    @FindBy(css = "#my-account-header-link")
    private WebElementFacade account;

    @FindBy(css = "[class=\"js-add-to-wishlist icon-heart-empty\"]")
    private WebElementFacade heart;

    public void clickOnProduct(int productIndex){
        products.get(productIndex).findElement(By.cssSelector("a")).click();
    }

    public void clickOnRandomProduct(){
        Integer productNo = Math.abs(new Random().nextInt(products.size()));
        setProductTitleInSession(products.get(productNo).findElement(By.cssSelector(".title-wrapper > a"))
                .getAttribute("title"));
        clickOnProduct(productNo);
    }

    public void setProductTitleInSession(String title){
        Serenity.setSessionVariable("productTitle").to(title);
    }

    public void setProductURLInSession(String url){
        Serenity.setSessionVariable("productURL").to(url);
    }

    public void addRandomProductToWishlist(){
        Integer productNo = Math.abs(new Random().nextInt(products.size()));
        setProductTitleInSession(products.get(productNo).findElement(By.cssSelector(".title-wrapper > a"))
                .getAttribute("title"));
        products.get(productNo).findElement(By.cssSelector(".add-to-wishlist span")).click();
        waitABit(2000);
    }

    public void navigateToMyAccount(){
        account.click();
    }
}