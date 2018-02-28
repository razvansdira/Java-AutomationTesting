package de.gourmondo.steps;

import de.gourmondo.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RandomSteps extends ScenarioSteps{

    private HomePage homePage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void navigateToCategories(){
        homePage.clickOnTitle();
    }

    @Step
    public void selectRandomCategory(){
        homePage.clickOnRandomCategory();
    }

    @Step
    public void selectRandomSubcategory(){
        homePage.clickOnRandomSubcategory();
    }

    @Step
    public void selectRandomProduct(){
        homePage.clickOnRandomProduct();
    }
}