package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PDPage extends PageObject {
    @FindBy(css = ".button-wrapper")
    private WebElement addCart;

    @FindBy(css = "[class=\"js-add-to-wishlist icon-heart-empty\"]")
    private WebElement addWishlist;

    @FindBy(css = "[class=\"product-review-jump\"]")
    private WebElement addReview;

    @FindBy(css = "[class=\"detailed-rating-right js-open-add-review\"]")
    private WebElement plus;

    @FindBy(css = ".stars-wrapper")
    private WebElement selectStar;

    @FindBy(css = "[class=\"form-control control-value\"]")
    private WebElement heading;

    @FindBy(css = "[name=\"comment\"]")
    private WebElement comment;

    @FindBy(css = ":nth-child(5) [class=\"control-label\"]")
    private WebElement anonym;

    @FindBy(css = "[class=\"btn btn-default btn-md text-uppercase pull-right\"]")
    private WebElement postReview;

    @FindBy(css = "[class=\"alert positive\"]")
    private List<WebElement> confirm;

    @FindBy(css = ".right-side")
    private WebElement cartHover;

    @FindBy(css = "[class=\"js-update-qty-btn update-qty-btn increase-qty-counter \"]")
    private WebElement increaseQty;

    @FindBy(css = "[class=\"btn btn-primary btn-md text-uppercase\"]")
    private WebElement cart;

   // @FindBy(css = "#totalItemsPrice0")
    @FindBy(css = ".right")
    private List<WebElement> price;

    public void goToCart() {
        cart.click();
    }

// de refacut conditia sa fie peste 25, momentan doar adauga odata.... sau de foarte multe ori

    public String increaseQuantity() {

//        int price = 1;
//       float totalCart = price.getText().length();
//        System.out.println("totalul este "+ totalCart);

//        do {
//            increaseQty.click();
//        } while (price.size() <= 25);
//        return "25";

        if(price.size() <= 5)
            increaseQty.click();
        else
            cart.click();
        return "";
    }

    public void hoverCart() {
        Actions hover = new Actions(getDriver());
        Actions hoverCart = hover.moveToElement(cartHover);
        hoverCart.perform();
    }

    public void clickOnAddToWishlist() {
        addWishlist.click();
        waitABit(1000);
    }

    public void clickOnAddToCartButton() {
        addCart.click();
        waitABit(2000);
    }

    public void clickOnAddReview() {
        addReview.click();
    }

    public void clickOnPlus() {
        plus.click();
    }

    public void clickOnStar() {
        selectStar.click();
    }

    public void inputHeader(String header) {
        heading.sendKeys("Test");
    }

    public void inputComment(String comm) {
        comment.sendKeys("teste");
    }

    public void selectAnonym() {
        anonym.click();
    }

    public void clickOnButton() {
        postReview.click();
    }

    public String checkReview() {
        if (confirm.size() != 0) {
            return confirm.get(0).getText();
        }
        return "";
    }
}