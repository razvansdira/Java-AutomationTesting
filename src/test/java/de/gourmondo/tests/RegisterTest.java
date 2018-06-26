package de.gourmondo.tests;

import de.gourmondo.steps.LoginSteps;
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
    private LoginSteps loginSteps;

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

    private String companyname, companynumber, companyfirstname, companylastname, compemail, passw, repass, user, pass, key, status;

    @Test
    public void test02IfCompanyRegisterWorks(){
        registerSteps.navigateToHomePage();
        registerSteps.navigateToLoginPage();
        registerSteps.navigateToRegisterPage();
        registerSteps.selectRegisterMode();
        registerSteps.inputCompanyName(companyname);
        registerSteps.inputCompanyNumber(companynumber);
        registerSteps.inputCompanyFirstName(companyfirstname);
        registerSteps.inputCompanyLastName(companylastname);
        registerSteps.selectCompanyDay();
        registerSteps.selectCompanyMonth();
        registerSteps.selectCompanyYear();
        registerSteps.inputCompanyEmail(compemail);
        registerSteps.inputPasswrd(passw);
        registerSteps.checkPassword(repass);
        registerSteps.termsAndCondition();
        registerSteps.finalButton();
        registerSteps.loginHmc(user, pass);
        registerSteps.inputUser();
        registerSteps.inputCustomers();
        registerSteps.inputId(key);
        registerSteps.search();
        registerSteps.selectItem();
        registerSteps.openDropdownMenu();
        registerSteps.approveAccount(status);
        registerSteps.saveInformation();
        registerSteps.navigateToHomePage();
        registerSteps.navigateToLoginPage();
        registerSteps.finalLogin(compemail, passw);
        registerSteps.navigateToMailinatorPage();
        registerSteps.navigateToHmcPage();
        registerSteps.selectItem();
        registerSteps.deleteHmcUser();
        registerSteps.confirmDeletePopup();
    }
}