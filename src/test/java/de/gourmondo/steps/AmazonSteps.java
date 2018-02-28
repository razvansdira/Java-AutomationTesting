package de.gourmondo.steps;

import de.gourmondo.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AmazonSteps extends ScenarioSteps{

    private AmazonPage amazonPage;

    @Step
    public void enterEmail(String mail){amazonPage.inputEmailAmz(mail);}

    @Step
    public void enterPass(String password){amazonPage.inputPassAmz(password);}

    @Step
    public void loginPayPal(){amazonPage.loginAmz();}
}
