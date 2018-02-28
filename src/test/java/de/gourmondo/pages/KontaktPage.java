package de.gourmondo.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KontaktPage extends PageObject {

    @FindBy(css = "[id=\"contactForm-email\"]")
    private WebElement email;

    @FindBy(css = "[id=\"contactForm-phoneNumber\"]")
    private WebElement phone;

    @FindBy(css = "[id=\"contactForm-headline\"]")
    private WebElement title;

    @FindBy(css = "#contactForm-comment")
    private WebElement comment;

    @FindBy(css = "[class=\"btn btn-primary btn-md text-uppercase\"]")
    private WebElement send;

    @FindBy(css = "[class=\"alert neutral\"]")
    private List<WebElement> checkMessage;

    public void inputEmail(String emaill){
        email.sendKeys("razvan.sdira@evozon.com");
    }

    public void inputPhoneNumber(String no) {
        phone.sendKeys("0755678123");
    }

    public void inputComment(String comm) {
        comment.sendKeys("testestest");
    }

    public void sendForm() {
        send.click();
    }

    public String checkContactSubmit(){
        if (checkMessage.size() != 0)
            return checkMessage.get(0).getText();
        return "";
    }
}