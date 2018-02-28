package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CartHoverSteps extends ScenarioSteps {

    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private PDPage pdPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
        headerPage.clickOnLogin();
    }

    @Step
    public void inputCredentials(String email, String pass) {
        loginPage.login(email, pass);
    }

    @Step
    public void clickOnLogo(){myAccountPage.selectLogo();}

    @Step
    public void navigateToCategories(){
        homePage.clickOnTitle();
    }

    @Step
    public void selectRandomCategory(){
        homePage.clickOnRandomCategory();
    }

    @Step
    public void selectRandomSubcategory(){
        homePage.clickOnRandomSubcategory();
    }

    @Step
    public void closePopUp(){homePage.clickOnXPopup();}

    @Step
    public void selectRandomProduct(){homePage.clickOnRandomProduct();}

    @Step
    public void clickOnAddCart() {
        pdPage.clickOnAddToCartButton();
    }

    @Step
    public void hoverIconCart(){pdPage.hoverCart();}

    @Step
    public void increaseQuant(){pdPage.increaseQuantity();}

    @Step
    public void navigateToCart(){
        pdPage.goToCart();
    }

    @Step
    public void performCheckout(){cartPage.proceedCheckout();}

    @Step
    public void markBoxNews(){checkoutPage.markCheckbox();}

    @Step
    public void finalizeCheckout(){checkoutPage.finalStep();}
}