package de.gourmondo.steps;

import de.gourmondo.pages.FooterPage;
import de.gourmondo.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.assertTrue;

public class NewsletterSteps extends ScenarioSteps{

    private HomePage homePage;
    private FooterPage footerPage;

    public void navigateToHomePage(){homePage.open();}

    public void subscribeToNewsletter(String email){footerPage.emailInput(email);}

    public void sendEmail(){footerPage.clickOnSubscribe();}
}