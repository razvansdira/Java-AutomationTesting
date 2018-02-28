package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageObject{

    @FindBy(css = "[class=\"logo-wrapper\"]")
    private WebElement logo;

    @FindBy(css = ".button-wrapper")
    private WebElement wishlist;

    @FindBy(css = "[title=\"Passwort ändern\"]")
    private WebElement chPass;

    @FindBy(css = "[title=\"Bestellübersicht\"]")
    private WebElementFacade orders;

    @FindBy(css = "[class=\"btn btn-default btn-lg js-open-add-delivery-feedback\"]")
    private WebElementFacade feedback;

    @FindBy(css = "[data-validation-name=\"ratingDeliveryOnTime\"]")
    private WebElementFacade time;

    @FindBy(css = "[data-validation-name=\"ratingDeliverySatisfaction\"]")
    private WebElementFacade satisfaction;

    @FindBy(css = "[class=\"btn btn-md btn-primary text-uppercase\"]")
    private WebElementFacade submit;

    public void changePass(){chPass.click();}

    public void selectLogo(){logo.click();}

    public void navigateToMyWishlist(){
        wishlist.click();
    }

    public void selectOrders(){orders.click();}

    public void openFeedback(){feedback.click();}

    public void voteTime(){time.click();}

    public void voteSatisfaction(){satisfaction.click();}

    public void sendFeedback(){submit.click();}
}