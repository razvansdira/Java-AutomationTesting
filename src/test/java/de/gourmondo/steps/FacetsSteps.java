package de.gourmondo.steps;

import de.gourmondo.pages.FacetsPage;
import de.gourmondo.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class FacetsSteps extends ScenarioSteps{

    private HomePage homePage;
    private FacetsPage facetsPage;

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
    public void selectRandomFilter(){
        facetsPage.selectRandomFacet();
    }

    @Step
    public void selectRandomProduct(){
        homePage.clickOnRandomProduct();
    }

    @Step
    public void closePopUp(){homePage.clickOnXPopup();}

    @Step
    public void selectSort(){facetsPage.selectListSort();}
}