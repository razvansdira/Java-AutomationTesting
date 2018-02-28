package de.gourmondo.tests;

import de.gourmondo.steps.*;
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

public class CompleteFlowTest {
    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CompleteFlowSteps completeFlowSteps;

    private String fname, lname, email, pas1, pas2, message, qty, code;
    private String name, no, pcode, town;

    @Test
    public void test01IfCompleteFlowWorks(){
        completeFlowSteps.navigateToHomePage();
        completeFlowSteps.navigateToLoginPage();
        completeFlowSteps.navigateToRegisterPage();
        completeFlowSteps.selectTitle();
        completeFlowSteps.inputFirstName(fname);
        completeFlowSteps.inputLastName(lname);
        completeFlowSteps.inputEmail(email);
        completeFlowSteps.chooseDay();
        completeFlowSteps.selectMonth();
        completeFlowSteps.selectYear();
        completeFlowSteps.inputPassword(pas1);
        completeFlowSteps.reenterPass(pas2);
        completeFlowSteps.acceptConditions();
        completeFlowSteps.sendRegister();

        completeFlowSteps.clickOnLogo();

        completeFlowSteps.navigateToCategories();
        completeFlowSteps.selectRandomCategory();
        completeFlowSteps.selectRandomSubcategory();
        completeFlowSteps.closePopUp();
        completeFlowSteps.selectRandomProduct();

        completeFlowSteps.clickOnAddCart();
        completeFlowSteps.clickOnCartIcon();
        completeFlowSteps.modifyQuantity(qty);
        completeFlowSteps.clickOnContinueCheckout();

        completeFlowSteps.setStreet(name);
        completeFlowSteps.setNumber(no);
        completeFlowSteps.setPostCode(pcode);
        completeFlowSteps.setCity(town);
        completeFlowSteps.send();
        completeFlowSteps.next();
        completeFlowSteps.nextDelivery();
        completeFlowSteps.nextPayment();

        completeFlowSteps.clickOnDeliveryMethod();
        completeFlowSteps.clickOnPaymentMethod();
        completeFlowSteps.clickOnVoucherButton();
        completeFlowSteps.inputVoucherCode(code);
        completeFlowSteps.submitVoucherCode();
        completeFlowSteps.markBoxNews();
        completeFlowSteps.clickOnBuyNow();
    }
}