package de.gourmondo.tests;

import de.gourmondo.steps.FeedbackSteps;
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

public class FeedbackTest {

    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private FeedbackSteps feedbackSteps;
    private String word, email, pass;

    @Test
    public void test01IfAddFeedbackWorks() {
        feedbackSteps.navigateToHomePage();
        feedbackSteps.inputCredentials(email, pass);
        feedbackSteps.viewOrders();
        feedbackSteps.feedback();
        feedbackSteps.setTimeStar();
        feedbackSteps.setSatisfactionStar();
        feedbackSteps.sendForm();
    }
}