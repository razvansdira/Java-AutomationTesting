package de.gourmondo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class AddressPage extends PageObject{

    @FindBy(css = "#addBillingDefaultAddressForm-street")
    private WebElement street;

    @FindBy(css = "#addBillingDefaultAddressForm-number")
    private WebElement number;

    @FindBy(css = "#addBillingDefaultAddressForm-postcode")
    private WebElement postcode;

    @FindBy(css = "#addBillingDefaultAddressForm-townCity")
    private WebElement city;

    @FindBy(css = "[class=\"btn btn-primary btn-md text-uppercase\"]")
    private WebElement submit;

    @FindBy(css = "[class=\"btn btn-primary btn-lg text-uppercase btn-extra-padding pull-right\"]")
    private WebElement continueButton;

    @FindBy(css = "[class=\"btn btn-primary btn-lg text-uppercase btn-extra-padding\"]")
    private WebElement continueDelivery;

    @FindBy(css = "[class=\"btn btn-primary btn-lg text-uppercase btn-extra-padding js-next js-disable-payment-options\"]")
    private WebElement continuePayment;

    public void inputStreet(String name){street.sendKeys("test");}

    public void inputNumber(String no){number.sendKeys("4");}

    public void inputPostCode(String pcode){postcode.sendKeys("330334");}

    public void inputCity(String town){city.sendKeys("Test");}

    public void submitForm(){submit.click();}

    public void clickContinue(){continueButton.click();}

    public void passDelivery(){continueDelivery.click();}

    public void passPayment(){continuePayment.click();}
}