package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;


public class WishlistSteps {
    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private SearchResultPage searchResultPage;
    private MyAccountPage myAccountPage;
    private MyWishlistPage myWishlistPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
        headerPage.clickOnLogin();
    }

    @Step
    public void inputCredentials(String email, String pass){
        loginPage.login(email, pass);
    }

    @Step
    public void searchProduct(String word) {
        headerPage.searchProduct(word);
    }

    @Step
    public void addWishRandomProduct() {
        searchResultPage.addRandomProductToWishlist();
        searchResultPage.navigateToMyAccount();
    }

    @Step
    public void checkMyAccount(){
        myAccountPage.navigateToMyWishlist();
    }

    @Step
    public void checkProductWishlist(){
        myWishlistPage.checkIfProductIsInWishlist();
    }

//    @Step
//    public void clickOnMyProductFromWishlist(){
//        myWishlistPage.clickOnWishProduct();
//    }
}