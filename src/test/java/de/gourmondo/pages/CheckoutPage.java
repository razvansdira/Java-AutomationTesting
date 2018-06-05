package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {

    @FindBy(css = "[data-delivery-mode=\"DPD-GOURMONDO-DE_FLATRATE\"]")
    private WebElement dpdDelivery;

    @FindBy(css = "[alt=\"Vorkasse\"]")
    private WebElement vorkasse;

    @FindBy(css = "[class=\"js-show-voucher-input btn btn-default btn-lg text-uppercase\"]")
    private WebElement voucherButton;

    @FindBy(css = "#voucherInput")
    private WebElement voucherField;

    @FindBy(css = "[class=\"btn btn-default btn-lg text-uppercase\"]")
    private WebElement submitCode;

    @FindBy(css = "[class='btn btn-primary btn-xl text-uppercase place-order ']")
    private WebElement finalButton;

    @FindBy(css = "[for=\"newsletterSubscrCheck\"] div span")
    private WebElementFacade newsletter;

    @FindBy(css = "#mainSubmit")
    private WebElementFacade adyenButton;

    public void markCheckbox() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        waitABit(2000);
        if (newsletter.isVisible())
            newsletter.click();
    }

    public void setDpdDelivery() {
        dpdDelivery.click();
        waitABit(3000);
    }

    public void selectPayment() {
        vorkasse.click();
    }

    public void clickVoucher() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        voucherButton.click();
    }

    public void inputCode(String code) {
        voucherField.sendKeys("007-R7CD-Y2AL-8WCB");
    }

    public void sendCode() {
        submitCode.click();
    }

    public void finalStep() {
        finalButton.click();
    }

    public void finalAdyen(){adyenButton.click();}
}