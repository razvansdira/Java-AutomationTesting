package de.gourmondo.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//@DefaultUrl("https://common.gourmondo.de/")
//@DefaultUrl("https://dev-de.gourmondo.de/")
//@DefaultUrl("https://test.gourmondo.de/")
@DefaultUrl("https://stage.gourmondo.de/hmc/hybris")

public class HmcLoginPage extends PageObject{

    @FindBy(css = "#Main_user")
    private WebElement inputUser;

    @FindBy(css = "#Main_password")
    private WebElement inputPass;

    @FindBy(css = "#Main_label")
    private WebElement button;

    public void loginHmc(String user, String pass){
        getDriver().navigate().to("https://stage.gourmondo.de/hmc/hybris");
        inputUser.sendKeys("admin");
        inputPass.sendKeys("1.Grmd!");
        button.click();
    }
}
