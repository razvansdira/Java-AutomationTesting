package de.gourmondo.tests;

import de.gourmondo.steps.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    private String word;

    @Before
    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    @Test
    public void searchSpecificProductInResultPages() {
        searchSteps.navigateToHomePage();
        searchSteps.searchProduct(word);
        searchSteps.clickOnRandomProduct();
    }
}