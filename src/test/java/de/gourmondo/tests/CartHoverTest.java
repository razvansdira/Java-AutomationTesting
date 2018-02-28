package de.gourmondo.tests;

import de.gourmondo.steps.CartHoverSteps;
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
public class CartHoverTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartHoverSteps cartHoverSteps;

    private String email, pass;

    @Test
    public void test01IfHoverWorks(){
        cartHoverSteps.navigateToHomePage();
        cartHoverSteps.inputCredentials(email, pass);
        cartHoverSteps.clickOnLogo();
        cartHoverSteps.navigateToCategories();
        cartHoverSteps.selectRandomCategory();
        cartHoverSteps.selectRandomSubcategory();
        cartHoverSteps.closePopUp();
        cartHoverSteps.selectRandomProduct();
        cartHoverSteps.clickOnAddCart();
        cartHoverSteps.hoverIconCart();
        cartHoverSteps.increaseQuant();
        cartHoverSteps.navigateToCart();
        cartHoverSteps.performCheckout();
        cartHoverSteps.markBoxNews();
        cartHoverSteps.finalizeCheckout();
    }
}