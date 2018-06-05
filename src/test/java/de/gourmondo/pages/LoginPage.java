package de.gourmondo.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(css="#j_username")
    private WebElement inputEmail;

    @FindBy(css="#j_password")
    private WebElement inputPass;

    @FindBy(css= "[class=\"btn btn-primary btn-block btn-lg text-uppercase pull-left\"]")
    private WebElement loginButton;

    @FindBy(css = "[class=\"btn btn-default btn-lg btn-block\"]")
    private WebElement registerButton;

    public void login(String email, String pass){
        inputEmail.sendKeys("sdr16@mailinator.com");
        inputPass.sendKeys("rererere");
        loginButton.click();
    }

    public void register(){registerButton.click();}
}