package de.gourmondo.tests;

import de.gourmondo.steps.AmazonCheckoutSteps;
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
public class AmazonCheckoutTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private AmazonCheckoutSteps amazonCheckoutSteps;
    private String word, mail, password, qty;

    @Test
    public void test01IfAmazonCheckoutWorks() {
        amazonCheckoutSteps.navigateToHomePage();
        amazonCheckoutSteps.searchProduct(word);
        amazonCheckoutSteps.clickProduct();
        amazonCheckoutSteps.clickOnAddCart();
        amazonCheckoutSteps.clickOnCartIcon();
        amazonCheckoutSteps.modifyQuantity(qty);
        amazonCheckoutSteps.checkoutAmazon();
        amazonCheckoutSteps.switchToAmazonWindow();
        amazonCheckoutSteps.enterEmail(mail);
        amazonCheckoutSteps.enterPass(password);
        amazonCheckoutSteps.loginAmazon();
        amazonCheckoutSteps.switchToMainWindow();
        amazonCheckoutSteps.selectAddress();
//        amazonCheckoutSteps.selectYear();
        amazonCheckoutSteps.selectDelivery();
        amazonCheckoutSteps.place();
    }
}