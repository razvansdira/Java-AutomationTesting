package de.gourmondo.tests;


import de.gourmondo.steps.WishlistSteps;
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
public class WishlistTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private WishlistSteps wishlistSteps;
    private String word, email, pass;

    @Before
    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    @Test
    public void testIfWishlistPageWorks() {
        wishlistSteps.navigateToHomePage();
        wishlistSteps.inputCredentials(email, pass);
        wishlistSteps.searchProduct(word);
        wishlistSteps.addWishRandomProduct();
        wishlistSteps.checkMyAccount();
        wishlistSteps.checkProductWishlist();
     //   wishlistSteps.clickOnMyProductFromWishlist();
    }
}