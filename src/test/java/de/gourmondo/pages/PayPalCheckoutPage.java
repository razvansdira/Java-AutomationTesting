package de.gourmondo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://test.gourmondo.de/checkout/paypal-express/approve?paymentId=PAY-7VW64370A8203874NLIXHQYY&token=EC-5LF42277PR913924H&PayerID=LEMMGJVBVXCCG")

public class PayPalCheckoutPage extends PageObject{

    @FindBy(css = ".custom-radio-button label")
    private WebElement delivery;

    @FindBy(css = "[class=\"btn btn-primary btn-xl text-uppercase place-order \"]")
    private WebElement submit;

    public void setDelivery(){delivery.click();}

    public void placeOrder(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        submit.click();}
}