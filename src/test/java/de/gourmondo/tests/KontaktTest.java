package de.gourmondo.tests;

import de.gourmondo.steps.KontaktSteps;
import de.gourmondo.steps.LoginSteps;
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
public class KontaktTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private KontaktSteps kontaktSteps;

    private String emaill, no, ttle, comm;

    @Test
    public void test01IfKontaktWorks(){
        kontaktSteps.navigateToKontakt();
        kontaktSteps.inputEmail(emaill);
        kontaktSteps.inputPhone(no);
        kontaktSteps.inputCommpentt(comm);
        kontaktSteps.sendFormm();
      //  kontaktSteps.checkSubmitMessage("Ihre Nachricht wurde übermittelt.");
    }
}