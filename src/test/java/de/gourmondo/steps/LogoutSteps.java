package de.gourmondo.steps;

import de.gourmondo.pages.HeaderPage;
import de.gourmondo.pages.HomePage;
import de.gourmondo.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by razvansidra on 12/28/2017.
 */
public class LogoutSteps extends ScenarioSteps{
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
    public void logout(){headerPage.clickOnLogOut();}
}