package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomePage() {homePage.open();}

    @Step
    public void navigateToLoginPage(){headerPage.clickOnLogin();}

    @Step
    public void navigateToRegisterPage(){loginPage.register();}

    @Step
    public void selectTitle(){registerPage.setTitle();}

    @Step
    public void inputFirstName(String fname){registerPage.inputFirstName(fname);}

    @Step
    public void inputLastName(String lname){registerPage.inputLastName(lname);}

    @Step
    public void inputEmail(String email){registerPage.inputEmail(email);}

    @Step
    public void chooseDay(){registerPage.selectDay();}

    @Step
    public void selectMonth(){registerPage.selectMonth();}

    @Step
    public void selectYear(){registerPage.selectYear();}

    @Step
    public void inputPassword(String pas1){registerPage.inputPwd(pas1);}

    @Step
    public void reenterPass(String pas2){registerPage.checkPwd(pas2);}

    @Step
    public void acceptConditions(){registerPage.acceptTerms();}

    @Step
    public void sendRegister(){registerPage.submitForm();}

    @Step
    public void checkIfRegistrationFailed(String message) {
        Assert.assertTrue(registerPage.getRegisterMessage().contentEquals("Vielen Dank für Ihre Registrierung."));
    }
}