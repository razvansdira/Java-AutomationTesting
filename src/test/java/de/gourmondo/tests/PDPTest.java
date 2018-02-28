package de.gourmondo.tests;

import de.gourmondo.steps.PDPsteps;
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
public class PDPTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private PDPsteps PDPsteps;
    private String word, email, pass, header, comm;

    @Test
    public void test01IfAddToCartWishlistAndReviewFromPDPWorks() {
        PDPsteps.navigateToHomePage();
        PDPsteps.inputCredentials(email, pass);
        PDPsteps.searchProduct(word);
        PDPsteps.clickProduct();
        PDPsteps.addWishlist();
        PDPsteps.clickOnAddCart();
        PDPsteps.addReview();
        PDPsteps.clickPlus();
        PDPsteps.selectStar();
        PDPsteps.writeHeader(header);
        PDPsteps.writeCommnent(comm);
        PDPsteps.selectAnonim();
        PDPsteps.clickButton();
        PDPsteps.checkReview("Vielen Dank für Ihre Bewertung.");
    }
}