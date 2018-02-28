package de.gourmondo.tests;

import de.gourmondo.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
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
@DefaultUrl("https://test.gourmondo.de/")

public class LoginTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    private String email, pass;

    @Test
    public void test01IfLoginFormValidationWorks() {
        loginSteps.navigateToLogin();
        loginSteps.login(email,pass);
        loginSteps.checkIfUserWasLoggedIn();
    }
}