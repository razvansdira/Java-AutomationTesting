package de.gourmondo.tests;

import de.gourmondo.steps.ChangePasswordSteps;
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
public class ChangePasswordTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private ChangePasswordSteps changePasswordSteps;

    private String email, pass, pass1, pass2, pass3;

    @Test
    public void test01IfChangePasswordWorks() {
        changePasswordSteps.navigateToHomePage();
        changePasswordSteps.inputCredentials(email, pass2);
        changePasswordSteps.changePassword();
        changePasswordSteps.inputPass(pass1);
        changePasswordSteps.inputNewPass(pass2);
        changePasswordSteps.inputAgainPass(pass3);
        changePasswordSteps.sendPasswords();
       // changePasswordSteps.checkSubmitMessage("Ihr Kennwort wurde geändert");
    }
}