package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

public class CheckoutSteps extends ScenarioSteps {

    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private SearchResultPage searchResultPage;
    private PDPage pdPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
        headerPage.clickOnLogin();
    }

    @Step
    public void inputCredentials(String email, String pass) {
        loginPage.login(email, pass);
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
    public void modifyQuantity(String qty){cartPage.modifyQuantity(qty);}

    @Step
    public void clickOnContinueCheckout() {
        cartPage.proceedCheckout();
    }

    @Step
    public void clickOnDeliveryMethod(){checkoutPage.setDpdDelivery();}

    @Step
    public void clickOnPaymentMethod(){checkoutPage.selectPayment();}

    @Step
    public void clickOnVoucherButton(){checkoutPage.clickVoucher();}

    @Step
    public void inputVoucherCode(String code){checkoutPage.inputCode(code);}

    @Step
    public void submitVoucherCode(){checkoutPage.sendCode();}

    @Step
    public void clickOnBuyNow() {
        checkoutPage.finalStep();
    }
}