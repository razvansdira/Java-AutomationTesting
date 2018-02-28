package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends PageObject {
    @FindBy(css = "#log-in")
    private WebElement loginLink;

    @FindBy(css = "#search")
    private WebElement searchBar;

    @FindBy(css = ".search-button")
    private WebElement searchButton;

    @FindBy(css = "[class=\"cart-wrapper\"]")
    private WebElement minicart;

    @FindBy(css = ".logout a")
    private WebElementFacade logOut;

    public void clickOnLogin() {
        loginLink.click();
    }

    public void searchProduct(String word) {
        searchBar.sendKeys("senf");
        searchButton.click();
    }

    public void clickOnCart(){minicart.click();}

    public void clickOnLogOut(){
        logOut.click();
    }
}