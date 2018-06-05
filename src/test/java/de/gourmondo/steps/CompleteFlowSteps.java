package de.gourmondo.steps;

import de.gourmondo.pages.*;
import gherkin.lexer.He;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CompleteFlowSteps extends ScenarioSteps {

    private RegisterPage registerPage;
    private PDPage pdPage;
    private HomePage homePage;
    private HeaderPage headerPage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private AddressPage addressPage;
    private MyAccountPage myAccountPage;
    private CartPage cartPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void navigateToLoginPage() {
        headerPage.clickOnLogin();
    }

    @Step
    public void navigateToRegisterPage() {
        loginPage.register();
    }

    @Step
    public void selectTitle() {
        registerPage.setTitle();
    }

    @Step
    public void inputFirstName(String fname) {
        registerPage.inputFirstName(fname);
    }

    @Step
    public void inputLastName(String lname) {
        registerPage.inputLastName(lname);
    }

    @Step
    public void inputEmail(String email) {
        registerPage.inputEmail(email);
    }

    @Step
    public void chooseDay() {
        registerPage.selectDay();
    }

    @Step
    public void selectMonth() {
        registerPage.selectMonth();
    }

    @Step
    public void selectYear() {
        registerPage.selectYear();
    }

    @Step
    public void inputPassword(String pas1) {
        registerPage.inputPwd(pas1);
    }

    @Step
    public void reenterPass(String pas2) {
        registerPage.checkPwd(pas2);
    }

    @Step
    public void acceptConditions() {
        registerPage.acceptTerms();
    }

    @Step
    public void sendRegister() {
        registerPage.submitForm();
    }


    @Step
    public void clickOnLogo() {
        myAccountPage.selectLogo();
    }

    @Step
    public void navigateToCategories() {
        homePage.clickOnTitle();
    }

    @Step
    public void selectRandomCategory() {
        homePage.clickOnRandomCategory();
    }

    @Step
    public void selectRandomSubcategory() {
        homePage.clickOnRandomSubcategory();
    }

    @Step
    public void closePopUp() {
        homePage.clickOnXPopup();
    }

    @Step
    public void selectRandomProduct() {
        homePage.clickOnRandomProduct();
    }

    @Step
    public void clickOnAddCart() {
        pdPage.clickOnAddToCartButton();
    }

    @Step
    public void clickOnCartIcon() {
        headerPage.clickOnCart();
    }

    @Step
    public void modifyQuantity(String qty) {
        cartPage.modifyQuantity(qty);
    }

    @Step
    public void clickOnContinueCheckout() {
        cartPage.proceedCheckout();
    }


    @Step
    public void setStreet(String name) {
        addressPage.inputStreet(name);
    }

    @Step
    public void setNumber(String no) {
        addressPage.inputNumber(no);
    }

    @Step
    public void setPostCode(String pcode) {
        addressPage.inputPostCode(pcode);
    }

    @Step
    public void setCity(String town) {
        addressPage.inputCity(town);
    }

    @Step
    public void send() {
        addressPage.submitForm();
    }

    @Step
    public void next() {
        addressPage.clickContinue();
    }

    @Step
    public void nextDelivery() {
        addressPage.passDelivery();
        waitABit(5000);
    }

    @Step
    public void nextPayment() {
        addressPage.passPayment();
    }


//    @Step
//    public void clickOnDeliveryMethod() {
//        checkoutPage.setDpdDelivery();
//    }

    @Step
    public void clickOnPaymentMethod() {
        checkoutPage.selectPayment();
    }

    @Step
    public void clickOnVoucherButton() {
        checkoutPage.clickVoucher();
    }

    @Step
    public void inputVoucherCode(String code) {
        checkoutPage.inputCode(code);
    }

    @Step
    public void submitVoucherCode() {
        checkoutPage.sendCode();
    }

    @Step
    public void markBoxNews() {
        checkoutPage.markCheckbox();
    }

    @Step
    public void clickOnBuyNow() {
        checkoutPage.finalStep();
    }

    @Step
    public void confirmAdyen(){checkoutPage.finalAdyen();}
}