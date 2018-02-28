package de.gourmondo.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChangePasswordPage extends PageObject{

    @FindBy(css = "#changePasswordForm-oldPwd")
    private WebElement old;

    @FindBy(css = "#changePasswordForm-pwd")
    private WebElement nou;

    @FindBy(css = "#changePasswordForm-checkPwd")
    private WebElement check;

    @FindBy(css = "[class=\"btn btn-primary btn-md text-uppercase\"]")
    private WebElement submit;

    @FindBy(css = "[class=\"alert neutral\"]")
    private List<WebElement> checkMessage;

    public void enterOldPass(String pass1){old.sendKeys("rererere");}

    public void enterNewPass(String pass2){nou.sendKeys("rerererere");}

    public void reenterNewPass(String pass3){check.sendKeys("rerererere");}

    public void submitRequest(){submit.click();}

    public String checkContactSubmit(){
        if (checkMessage.size() != 0)
            return checkMessage.get(0).getText();
        return "";
    }
}
