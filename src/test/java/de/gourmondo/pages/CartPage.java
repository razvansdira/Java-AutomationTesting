package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(css = "#quantity")
    private WebElement quantityField;

    @FindBy(css = "[id=\"checkoutButtonBottom\"]")
    private WebElement checkoutButton;

    @FindBy(css = "[class=\"paypal-express-button-image paypal-express-button text-uppercase doCheckoutBut js-enable-checkout\"]")
    private WebElement payPalBtn;

    @FindBy(css = "#loginWithAmazon")
    private WebElement amazonBtn;

    public void modifyQuantity(String qty) {
        if(checkoutButton.isEnabled()){}
//            proceedCheckout();
        else
            quantityField.sendKeys("15");
        waitABit(2000);
    }

    public void proceedCheckout() {
        checkoutButton.click();
    }

    public void ExpressCheckout(){payPalBtn.click();}

    public void Amazon(){amazonBtn.click();}
}