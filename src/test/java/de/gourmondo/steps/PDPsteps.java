package de.gourmondo.steps;

import de.gourmondo.pages.*;
import gherkin.lexer.He;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class PDPsteps {
    private PDPage pdPage;
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
    public void inputCredentials(String email, String pass) {
        loginPage.login(email, pass);
    }

    @Step
    public void searchProduct(String word) {
        headerPage.searchProduct(word);
    }

    @Step
    public void clickProduct() {
        searchResultPage.clickOnRandomProduct();
//        searchResultPage.clickOnLastProduct();
    }

    @Step
    public void addWishlist() {
        pdPage.clickOnAddToWishlist();
    }


    @Step
    public void clickOnAddCart() {
        pdPage.clickOnAddToCartButton();
    }

    @Step
    public void addReview() {
        pdPage.clickOnAddReview();
    }

    @Step
    public void clickPlus(){pdPage.clickOnPlus();}

    @Step
    public void selectStar() {
        pdPage.clickOnStar();
    }

    @Step
    public void writeHeader(String header) {
        pdPage.inputHeader(header);
    }

    @Step
    public void writeCommnent(String comm) {
        pdPage.inputComment(comm);
    }

    @Step
    public void selectAnonim() {
        pdPage.selectAnonym();
    }

    @Step
    public void clickButton() {
        pdPage.clickOnButton();
    }

    @Step
    public void checkReview(String msg){
        String review = pdPage.checkReview();
        Assert.assertTrue("Vielen Dank für Ihre Bewertung.", msg.contentEquals(review));
    }
}
