package de.gourmondo.tests;

import de.gourmondo.steps.NewsletterSteps;
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
public class NewsletterTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    private NewsletterSteps newsletterSteps;

    private String email;

    @Test
    public void test01IfNewsletterWorks(){
        newsletterSteps.navigateToHomePage();
        newsletterSteps.subscribeToNewsletter(email);
        newsletterSteps.sendEmail();
    }
}