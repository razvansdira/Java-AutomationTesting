package de.gourmondo.tests;

import de.gourmondo.steps.RandomSteps;
import de.gourmondo.steps.RegisterSteps;
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

public class RegisterTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    private String fname, lname, email, pas1, pas2, message;

    @Test
    public void test01IfRegisterWorks() {
        registerSteps.navigateToHomePage();
        registerSteps.navigateToLoginPage();
        registerSteps.navigateToRegisterPage();
        registerSteps.selectTitle();
        registerSteps.inputFirstName(fname);
        registerSteps.inputLastName(lname);
        registerSteps.inputEmail(email);
        registerSteps.chooseDay();
        registerSteps.selectMonth();
        registerSteps.selectYear();
        registerSteps.inputPassword(pas1);
        registerSteps.reenterPass(pas2);
        registerSteps.acceptConditions();
        registerSteps.sendRegister();
        registerSteps.checkIfRegistrationFailed(message);
    }
}