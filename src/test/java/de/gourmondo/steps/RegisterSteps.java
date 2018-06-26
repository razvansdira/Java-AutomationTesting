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
    private HmcLoginPage hmcLoginPage;
    private HmcPages hmcPages;
    private EmailPages emailPages;

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


    // B2B register steps
    @Step
    public void selectRegisterMode(){registerPage.setRegisterMode();}

    @Step
    public void inputCompanyName(String companyname){registerPage.inputCompanyName(companyname);}

    @Step
    public void inputCompanyNumber(String companynumber){registerPage.inputCompanyNumber(companynumber);}

    @Step
    public void inputCompanyFirstName(String companyfirstname){registerPage.inputCompanyFirstName(companyfirstname);}

    @Step
    public void inputCompanyLastName(String companylastname){registerPage.inputCompanyLastName(companylastname);}

    @Step
    public void selectCompanyDay(){registerPage.setCompanyDay();}

    @Step
    public void selectCompanyMonth(){registerPage.setCompanyMonth();}

    @Step
    public void selectCompanyYear(){registerPage.setCompanyYear();}

    @Step
    public void inputCompanyEmail(String compemail){registerPage.setCompanyEmail(compemail);}

    @Step
    public void inputPasswrd(String passw){registerPage.setPassword(passw);}

    @Step
    public void checkPassword(String repass){registerPage.checkPassword(repass);}

    @Step
    public void termsAndCondition(){registerPage.acceptConditions();}

    @Step
    public void finalButton(){registerPage.sendRegisterCompanyForm();}

    @Step
    public void loginHmc(String user, String pass){hmcLoginPage.loginHmc(user, pass);}

    @Step
    public void inputUser(){hmcPages.clickOnUserTab();}

    @Step
    public void inputCustomers(){hmcPages.clickOnCustomersTab();}

    @Step
    public void inputId(String key){hmcPages.inputItem(key);}

    @Step
    public void search(){hmcPages.clickOnSearchButton();}

    @Step
    public void selectItem(){hmcPages.clickOnResult();}

    @Step
    public void openDropdownMenu(){hmcPages.clickOnOptions();}

    @Step
    public void approveAccount(String status){hmcPages.clickOnApprovedStatus(status);}

    @Step
    public void saveInformation(){hmcPages.saveOptions();}

    @Step
    public void finalLogin(String compemail, String passw){loginPage.login(compemail, passw);}

    @Step
    public void navigateToMailinatorPage() {
        emailPages.navigateToMailinator();
        Assert.assertTrue(emailPages.getEmailTime().contentEquals("moments ago"));
    }

    @Step
    public void navigateToHmcPage(){
        getDriver().navigate().to("https://stage.gourmondo.de/hmc/hybris");
    }

    @Step
    public void deleteHmcUser(){hmcPages.deleteUser();}

    @Step
    public void confirmDeletePopup(){hmcPages.confirmDelete();}
}