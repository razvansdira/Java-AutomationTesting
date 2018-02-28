package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AmazonCheckoutSteps extends ScenarioSteps{

    private AmazonCheckoutPage amazonCheckoutPage;
    private AmazonPage amazonPage;
    private HomePage homePage;
    private HeaderPage headerPage;
    private SearchResultPage searchResultPage;
    private PDPage pdPage;
    private CartPage cartPage;

    private String parentHandle;
    private String url;

    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void searchProduct(String word) {
        headerPage.searchProduct(word);
    }

    @Step
    public void clickProduct() {
        searchResultPage.clickOnRandomProduct();
//        searchResultPage.clickOnLastProduct();
    }

    @Step
    public void clickOnAddCart() {
        pdPage.clickOnAddToCartButton();
    }

    @Step
    public void clickOnCartIcon() {
        headerPage.clickOnCart();
    }

    @Step
    public void modifyQuantity(String qty) {
        cartPage.modifyQuantity(qty);
    }

    @Step
    public void checkoutAmazon() {
        cartPage.Amazon();
        waitABit(2000);
    }

    @Step
    public void switchToAmazonWindow() {
        parentHandle = getDriver().getWindowHandle();

        for (String window : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(window);
        }
    }

    @Step
    public void enterEmail(String mail) {
        amazonPage.inputEmailAmz(mail);
    }

    @Step
    public void enterPass(String pasw) {
        amazonPage.inputPassAmz(pasw);
    }

    @Step
    public void loginAmazon() {
        amazonPage.loginAmz();
        waitABit(3000);
    }

    @Step
    public void switchToMainWindow() {
        url = getDriver().getWindowHandle();

        for(String page : getDriver().getWindowHandles()){
            getDriver().switchTo().window(page);
        }
    }

//    @Step
//    public void selectYear(){amazonCheckoutPage.setYear();}

    @Step
    public void selectAddress(){amazonCheckoutPage.setRandomAddresses();}

    @Step
    public void selectDelivery() {
        amazonCheckoutPage.setDelivery();
    }

    @Step
    public void place() {
        amazonCheckoutPage.placeOrder();
    }
}