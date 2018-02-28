package de.gourmondo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://eu.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_lwa_eu&marketPlaceId=A3M3RRFO9XDT2G&arb=8d147461-51b8-4cf2-8f3c-1c1300758f35&language=de_DE&openid.return_to=https%3A%2F%2Feu.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DA3M3RRFO9XDT2G%26arb%3D8d147461-51b8-4cf2-8f3c-1c1300758f35%26language%3Dde_DE&metricIdentifier=amzn1.application.9b11a505e3c34c37962dab0654ca15cb&signedMetricIdentifier=8MXeR4TEXsZ7Y83MsXFbZMgpXESko6PJO1%2BVYt4oZ44%3D")

public class AmazonPage extends PageObject{

    @FindBy(css = "#ap_email")
    private WebElement email;

    @FindBy(css = "#ap_password")
    private WebElement pass;

    @FindBy(css = "[class=\"button-text signin-button-text\"]")
    private WebElement btn;

    public void inputEmailAmz(String mail){email.sendKeys("ciprian.mocian@evozon.com");}

    public void inputPassAmz(String pasw){pass.sendKeys("testtest");}

    public void loginAmz(){btn.click();}
}