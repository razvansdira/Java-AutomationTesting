package de.gourmondo.steps;

import de.gourmondo.pages.HeaderPage;
import de.gourmondo.pages.HomePage;
import de.gourmondo.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {
    private HomePage homePage;
    private HeaderPage headerPage;
    private SearchResultPage searchResultPage;

    @Step
    public void navigateToHomePage(){
        homePage.open();
    }

    @Step
    public void searchProduct(String word){
        headerPage.searchProduct(word);
    }

    @Step
    public void clickOnRandomProduct(){
        searchResultPage.clickOnRandomProduct();
    }
}