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


    public String getRegisterMessage() {
        return successMessage.getText();
    }

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


//  B2B register

    @FindBy(css = "[for=\"businessClient\"]")
    private WebElementFacade selectCompanyRegister;

    @FindBy(css = "#registerCompanyForm-company")
    private WebElementFacade companyName;

    @FindBy(css = "#registerCompanyForm-companyNumber")
    private WebElementFacade companyNumber;

    @FindBy(css = "#registerCompanyForm-firstName")
    private WebElementFacade companyFirstName;

    @FindBy(css = "#registerCompanyForm-lastName")
    private WebElementFacade companyLastName;

    @FindBy(css = "[data-id=\"registerCompanyForm-birthday-day\"]")
    private WebElementFacade companyDay;

    @FindBy(css = "[id=\"registerCompanyForm\"] [class=\"form-group-composed form-group-1-to-3\"] div ul li a")
    private WebElementFacade selectCompanyDay;

    @FindBy(css = "[data-id=\"registerCompanyForm-birthday-month\"]")
    private WebElementFacade companyMonth;

    @FindBy(xpath = "//*[@id=\"registerCompanyForm\"]/div[5]/div[2]/div[1]/div/ul/li[1]")
    private WebElementFacade slctCompanyMonth;

    @FindBy(css = "[data-id=\"registerCompanyForm-birthday-year\"]")
    private WebElementFacade companyYear;

    @FindBy(css = "[class=\"btn-group bootstrap-select  birth-year js-birth-year select-picker-wrapper dropup open\"] div ul li a")
    private WebElementFacade selectCompanyYear;

    @FindBy(css = "#registerCompanyForm-email")
    private WebElementFacade companyEmail;

    @FindBy(css = "#registerCompanyForm-pwd")
    private WebElementFacade compPwd;

    @FindBy(css = "#registerCompanyForm-checkPwd")
    private WebElementFacade checkPwd;

    @FindBy(css = "[for=\"registerCompanyForm-termsConditionsCheck\"] span")
    private WebElementFacade terms;

    @FindBy(css = "#registerCompanyForm > button")
    private WebElementFacade register;


    public void setRegisterMode() {
        selectCompanyRegister.click();
    }

    public void inputCompanyName(String companyname) {
        companyName.sendKeys("GoDe");
    }

    public void inputCompanyNumber(String companynumber) {
        companyNumber.sendKeys("DE123456789");
    }

    public void inputCompanyFirstName(String firstname) {
        companyFirstName.sendKeys("Automation");
    }

    public void inputCompanyLastName(String lastname) {
        companyLastName.sendKeys("Test");
    }

    public void setCompanyDay() {
        companyDay.click();
        selectCompanyDay.click();
    }

    public void setCompanyMonth() {
        companyMonth.click();
        slctCompanyMonth.click();
    }

    public void setCompanyYear() {
        companyYear.click();
        selectCompanyYear.click();
    }

    public void setCompanyEmail(String compemail) {
        companyEmail.sendKeys("sdr16@mailinator.com");
    }

    public void setPassword(String passw) {
        compPwd.sendKeys("rererere");
    }

    public void checkPassword(String repass) {
        checkPwd.sendKeys("rererere");
    }

    public void acceptConditions() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        terms.click();
    }

    public void sendRegisterCompanyForm(){register.click();}
}
