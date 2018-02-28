package de.gourmondo.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends PageObject {

    @FindBy(css = "[title=\"Kundenservice\"]")
    private WebElement kontakt;

    @FindBy(css = "[class=\"form-control control-value js-newsletter-email\"]")
    private WebElement newsletter;

    @FindBy(css = "[class=\"btn btn-primary btn-md text-uppercase icon-right-arrow-big\"]")
    private WebElement subscription;

    public void clickOnKontaktLink() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        kontakt.click();
    }

    public void emailInput(String email){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        newsletter.sendKeys("test@test.com");
    }

    public void clickOnSubscribe(){subscription.click();}
}
