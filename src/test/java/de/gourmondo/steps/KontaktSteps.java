package de.gourmondo.steps;

import de.gourmondo.pages.FooterPage;
import de.gourmondo.pages.HomePage;
import de.gourmondo.pages.KontaktPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertTrue;

public class KontaktSteps extends ScenarioSteps {

    private HomePage homePage;
    private FooterPage footerPage;
    private KontaktPage kontaktPage;

    @Step
    public void navigateToKontakt() {
        homePage.open();
        footerPage.clickOnKontaktLink();
    }

    @Step
    public void inputEmail(String emaill){kontaktPage.inputEmail(emaill);}

    @Step
    public void inputPhone(String no){kontaktPage.inputPhoneNumber(no);}

    @Step
    public void inputCommpentt(String comm){kontaktPage.inputComment(comm);}

    @Step
    public void sendFormm(){kontaktPage.sendForm();}

    @Step
    public void checkSubmitMessage(String msg){
        String message = kontaktPage.checkContactSubmit();
        assertTrue("The contact form was not send.", msg.contentEquals(message));
    }
}