package de.gourmondo.tests;

import de.gourmondo.steps.PayPalCheckoutSteps;
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
public class PayPalCheckoutTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private PayPalCheckoutSteps payPalCheckoutSteps;
    private String word, mail, password, qty;

    @Test
    public void test01IfPayPalCheckoutWorks() {
        payPalCheckoutSteps.navigateToHomePage();
        payPalCheckoutSteps.searchProduct(word);
        payPalCheckoutSteps.clickProduct();
        payPalCheckoutSteps.clickOnAddCart();
        payPalCheckoutSteps.clickOnCartIcon();
        payPalCheckoutSteps.modifyQuantity(qty);
        payPalCheckoutSteps.checkoutPayPal();
        payPalCheckoutSteps.enterEmail(mail);
        payPalCheckoutSteps.enterPass(password);
        payPalCheckoutSteps.loginPayPal();
        payPalCheckoutSteps.confirmation();
      //  payPalCheckoutSteps.switchToMainWindow();
        payPalCheckoutSteps.selectDelivery();
        payPalCheckoutSteps.place();
    }
}