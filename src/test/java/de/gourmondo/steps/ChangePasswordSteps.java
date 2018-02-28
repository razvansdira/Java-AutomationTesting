package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class ChangePasswordSteps extends ScenarioSteps{

    HomePage homePage;
    HeaderPage headerPage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ChangePasswordPage changePasswordPage;

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
    public void changePassword(){myAccountPage.changePass();}

    @Step
    public void inputPass(String pass1){changePasswordPage.enterOldPass(pass1);}

    @Step
    public void inputNewPass(String pass2){changePasswordPage.enterNewPass(pass2);}

    @Step
    public void inputAgainPass(String pass3){changePasswordPage.reenterNewPass(pass3);}

    @Step
    public void sendPasswords(){changePasswordPage.submitRequest();}

    @Step
    public void checkSubmitMessage(String msg){
        String message = changePasswordPage.checkContactSubmit();
        assertTrue("The password was not changed.", msg.contentEquals(message));
    }
}
