package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FeedbackSteps extends ScenarioSteps{
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
    public void viewOrders(){myAccountPage.selectOrders();}

    @Step
    public void feedback(){myAccountPage.openFeedback();}

    @Step
    public void setTimeStar(){myAccountPage.voteTime();}

    @Step
    public void setSatisfactionStar(){myAccountPage.voteSatisfaction();}

    @Step
    public void sendForm(){myAccountPage.sendFeedback();}
}