package de.gourmondo.tests;

import de.gourmondo.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CheckoutSteps checkoutSteps;
    private String word, email, pass, qty, code;

    @Test
    public void test01IfCheckoutWorks() {
        checkoutSteps.navigateToHomePage();
        checkoutSteps.inputCredentials(email, pass);
        checkoutSteps.searchProduct(word);
        checkoutSteps.clickProduct();
        checkoutSteps.clickOnAddCart();
        checkoutSteps.clickOnCartIcon();
        checkoutSteps.modifyQuantity(qty);
        checkoutSteps.clickOnContinueCheckout();
        checkoutSteps.clickOnDeliveryMethod();
        checkoutSteps.clickOnPaymentMethod();
        checkoutSteps.clickOnVoucherButton();
        checkoutSteps.inputVoucherCode(code);
        checkoutSteps.submitVoucherCode();
        checkoutSteps.clickOnBuyNow();
        checkoutSteps.confirmAdyen();
    }
}