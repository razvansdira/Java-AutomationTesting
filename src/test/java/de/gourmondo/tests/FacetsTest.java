package de.gourmondo.tests;

import de.gourmondo.steps.FacetsSteps;
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

public class FacetsTest {
    @Before
    public void maxiPage() {
        driver.manage().window().maximize();
    }

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private FacetsSteps facetsSteps;

    @Test
    public void test01IfRandomFilterWorks(){
        facetsSteps.navigateToHomePage();
        facetsSteps.navigateToCategories();
        facetsSteps.selectRandomCategory();
        facetsSteps.selectRandomSubcategory();
        facetsSteps.selectRandomFilter();
        facetsSteps.selectSort();
        facetsSteps.closePopUp();
        facetsSteps.selectRandomProduct();
    }
}