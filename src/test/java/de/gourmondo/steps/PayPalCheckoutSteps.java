package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PayPalCheckoutSteps extends ScenarioSteps {

    private PayPalCheckoutPage payPalCheckoutPage;
    private PayPalExpressPage payPalExpressPage;
    private HomePage homePage;
    private HeaderPage headerPage;
    private SearchResultPage searchResultPage;
    private PDPage pdPage;
    private CartPage cartPage;

    private String parentHandle;
    private WebDriver driver;

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
    public void checkoutPayPal() {
        cartPage.ExpressCheckout();
    }

    @Step
    public void enterEmail(String mail) {
        payPalExpressPage.inputEmailPP(mail);
    }

    @Step
    public void enterPass(String password) {
        payPalExpressPage.inputPass(password);
    }

    @Step
    public void loginPayPal() {
        payPalExpressPage.login();
    }

    @Step
    public void confirmation() {
        payPalExpressPage.confirm();
    }

    @Step
    public void switchToMainWindow() {
        driver.get("https://dev-int.gourmondo.de/checkout/paypal-express/approve?paymentId=PAY-2N668089DR9152439LIXFPKI&token=EC-50733901EV953590P&PayerID=LEMMGJVBVXCCG");
//        url = getDriver().getWindowHandle();
//
//        for(String page : getDriver().getWindowHandles()){
//            getDriver().switchTo().window(page);
//        }
    }

    @Step
    public void selectDelivery() {
        payPalCheckoutPage.setDelivery();
    }

    @Step
    public void place() {
        payPalCheckoutPage.placeOrder();
    }
}