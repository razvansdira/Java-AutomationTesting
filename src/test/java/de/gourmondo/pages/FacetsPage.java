package de.gourmondo.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class FacetsPage extends PageObject {

    private Random random = new Random();

    @FindBy(css = ".facetValues div ul li form")
    private List<WebElement> productsFacets;

    @FindBy(css = "#sortOptions1")
    private WebElementFacade sort;

    public void selectRandomFacet() {
        try {
            Integer randomPrice = Math.abs(random.nextInt(productsFacets.size()));
            Serenity.setSessionVariable("productFacet").to(randomPrice);
            productsFacets.get(randomPrice).click();
        } catch (Exception ex) {
        }
        waitABit(6000);
    }

    public void selectListSort(){sort.click();}
}