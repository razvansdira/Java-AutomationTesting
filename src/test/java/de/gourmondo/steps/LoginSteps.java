package de.gourmondo.steps;

import de.gourmondo.pages.HeaderPage;
import de.gourmondo.pages.HomePage;
import de.gourmondo.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;

    @Step
    public void navigateToLogin() {
        homePage.open();
        headerPage.clickOnLogin();
    }

    @Step
    public void login(String email, String pass){
        loginPage.login(email,pass);
    }
    @Step
    public void checkIfUserWasLoggedIn(){
        assertTrue(getDriver().getCurrentUrl().equals("https://test.gourmondo.de/my-account"));
    }
}