package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class EmailPages extends PageObject {

    @FindBy(css = "[class=\"all_message-min_datte all_message-min_datte-3 ng-binding\"]")
    private WebElementFacade emailTime;

    public void navigateToMailinator(){getDriver().navigate().to("https://www.mailinator.com/v2/inbox.jsp?zone=public&query=sdr16#/#inboxpane");}

    public String getEmailTime() {
        return emailTime.getText();
    }
}
