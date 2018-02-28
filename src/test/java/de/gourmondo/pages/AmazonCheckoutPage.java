package de.gourmondo.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;


import java.util.List;
import java.util.Random;

@DefaultUrl("https://dev-int.gourmondo.de/checkout/amazon?access_token=Atza%7CIwEBILktP0IfoawU8Eq-e_O_ir8kKbyp5HnHb-JiP5j6HEP4Vk0nFPBc_T__bRpEZw84-HG9SCYjKeuZdO01Kxh3D2cqlKbvjlAYQEhjzLZuX2V7MZFyE8WrEut3Y4MwZKewVLMv6Wr7i5W3J6Ws-6ux1TAl7hJiDqHkAR9XAqQluBIvBz8rUz8MMRMIigxIxyGiIWXv3g0FKhi4tEPSGvbzzmDSJJOVukH6pKfEeatglo7RwREtWUzNObrrQDPjvvUw2wgSN90q0jPm-sr2MgxIud-MyP-7YCuOQs0Ap-y0Nz7hKBFHkgy9ICQwvyeLGwEqdAxQE36sjSSnnCp83iPloVCzqXGzfiZrpZOodE0nxawWsbutH3wFV-t-QIOCWV2J-6caXCGZAN9BAVVcVeg3sl1hZzVvIxom0_zOifsfQhscQSIzKUL9c2O1Jtmexh9jd2fKF4j5rUGT2cyAAvCHOmw-z3gbuTu6qoWlDKMBQrC7ybbn-clWx8La8n6PxaLIta4wjd4-CwVs8K-RFt0Yt7ge9CieuuvDc83xcfucQqG-_0LBApWV97wjs-CKPP75m4JMX95xnBglJXDbcEd5Z8FPZjDEt9UbITBPbZWydX6vcQ&token_type=bearer&expires_in=3600&scope=profile%20payments%3Awidget%20payments%3Ashipping_address%20payments%3Abilling_address")

public class AmazonCheckoutPage extends PageObject{

    private Random random = new Random();

    @FindBy(css = "[class=\"btn dropdown-toggle selectpicker select-picker-wrapper btn-default\"]")
    private WebElement year;

    @FindBy(css = "[class=\"address-list clearfix\"]")
    private List<WebElement> addresses;

    @FindBy(css = "[class=\"delivery-modes-wrapper\"] :nth-child(2) div")
    private WebElement delivery;

    @FindBy(css = "[class=\"btn btn-primary btn-xl text-uppercase place-order \"]")
    private WebElement submit;

    public void setYear(){year.click();}

    public void setRandomAddresses(){
        try {
            Integer randomAddress = Math.abs(random.nextInt(addresses.size()));
            Serenity.setSessionVariable("productFacet").to(randomAddress);
            addresses.get(randomAddress).click();
        } catch (Exception ex) {
        }
        waitABit(6000);
    }

    public void setDelivery(){delivery.click();}

    public void placeOrder(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        submit.click();}
}
