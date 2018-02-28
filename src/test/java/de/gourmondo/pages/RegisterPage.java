package de.gourmondo.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageObject {

    public WebDriver driver;

    @FindBy(css = "[class=\"btn-group bootstrap-select  form-control control-value select-picker-wrapper\"] button")
    private WebElement clickTitle;

    @FindBy(css = "[class=\"btn-group bootstrap-select  form-control control-value select-picker-wrapper open\"] div ul li:nth-of-type(2)")
    private WebElement selectTitle;

    @FindBy(css = "[id=\"registerClientForm-firstName\"]")
    private WebElement firstName;

    @FindBy(css = "[id=\"registerClientForm-lastName\"]")
    private WebElement lastName;

    @FindBy(css = "[id=\"registerClientForm-email\"]")
    private WebElement remail;

    @FindBy(css = "[class=\"form-group-composed form-group-1-to-3\"] div button")
    private WebElement day;

    @FindBy(css = "[class=\"form-group-composed form-group-1-to-3\"] ul li a")
    private WebElementFacade selectDay;

    @FindBy(css = "[data-id=\"registerClientForm-birthday-month\"]")
    private WebElement month;

    @FindBy(css = "[class=\"btn-group bootstrap-select  select-picker-wrapper open\"] div ul li:nth-of-type(3)")
    private WebElementFacade selectMonth;

    @FindBy(css = "[data-id=\"registerClientForm-birthday-year\"]")
    private WebElement year;

    @FindBy(css = "[class=\"btn-group bootstrap-select  birth-year js-birth-year select-picker-wrapper open\"] div ul li a")
    private WebElementFacade selectYear;

    @FindBy(css = "[name=\"pwd\"]")
    private WebElement pwd;

    @FindBy(css = "[name=\"checkPwd\"]")
    private WebElement check;

    @FindBy(css = "span[class=\"\"]")
    private WebElement accept;

    @FindBy(css = "[class=\"btn btn-lg btn-primary text-uppercase pull-right\"]")
    private WebElementFacade submit;

    @FindBy(css = "[class=\"alert positive\"] div")
    private WebElementFacade successMessage;

    public String getRegisterMessage(){return successMessage.getText();}

    public void submitForm() {
        submit.click();
        waitABit(5000);
    }

    public void acceptTerms() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        accept.click();
    }

    public void checkPwd(String pas2) {
        check.sendKeys("rererere");
    }

    public void inputPwd(String pas1) {
        pwd.sendKeys("rererere");
    }

    public void selectYear() {
        year.click();
        selectYear.click();
    }

    public void selectMonth() {
        month.click();
        selectMonth.click();
    }

    public void selectDay() {
        day.click();
        selectDay.click();
    }

    public void inputEmail(String email) {
        remail.sendKeys("sdr16@mailinator.com");
    }

    public void inputLastName(String lname) {
        lastName.sendKeys("Test");
    }

    public void inputFirstName(String fname) {
        firstName.sendKeys("test");
    }

    public void setTitle() {
        clickTitle.click();
        selectTitle.click();

//        Select oSelect = new Select(clickTitle.findElement(By.tagName("Select")));
//        List<WebElement> elements = oSelect.getOptions();
//
//        for (WebElement elem : elements) {
//            System.out.println("The options are " + elem.getAttribute("value") + " ");
//        }
    }
}