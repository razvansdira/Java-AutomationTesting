package de.gourmondo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_express-checkout&token=EC-5LF42277PR913924H#/checkout/login")

public class PayPalExpressPage extends PageObject {

    @FindBy(css = "[id=\"login_emaildiv\"] div input")
    private WebElement email;

    @FindBy(css = "#login_passworddiv div input")
    private WebElement pass;

    @FindBy(css = "#btnLogin")
    private WebElement btn;

    @FindBy(css = "[class=\"buttons reviewButton\"]")
    private WebElementFacade confirmation;

    @FindBy(css = "div#injectedUnifiedLogin iframe")
    private WebElementFacade iframe;

    public void inputEmailPP(String mail) {
//        getDriver().switchTo().frame((WebElement) getDriver().findElement(By.cssSelector("div#injectedUnifiedLogin iframe")));

        getDriver().switchTo().frame(iframe);
        email.sendKeys("paypal-test@gourmondo.de");
    }

    public void inputPass(String password) {
        pass.sendKeys("Hallo1234");
    }

    public void login() {
        btn.click();
        waitABit(9000);
    }

    public void confirm() {
        confirmation.click();
    }
}