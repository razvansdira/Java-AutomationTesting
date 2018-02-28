package de.gourmondo.tests;

import de.gourmondo.steps.RandomSteps;
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

public class RandomTest {
    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RandomSteps randomSteps;

    @Test
    public void test01IfRandomWorks(){
        randomSteps.navigateToHomePage();
        randomSteps.navigateToCategories();
        randomSteps.selectRandomCategory();
        randomSteps.selectRandomSubcategory();
        randomSteps.selectRandomProduct();
    }
}