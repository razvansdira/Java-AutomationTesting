package de.gourmondo.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;


public class HmcPages extends PageObject {

    @FindBy(css = "#Tree\\2f GenericExplorerMenuTreeNode\\5b user\\5d _label")
    private WebElementFacade userTab;

    @FindBy(css = "#Tree\\2f GenericLeafNode\\5b Customer\\5d _label")
    private WebElementFacade customers;

    @FindBy(css = "#Content\\2f StringEditor\\5b in\\20 Content\\2f GenericCondition\\5b Customer\\2e uid\\5d \\5d _input")
    private WebElementFacade idLabel;

    @FindBy(css = "#Content\\2f OrganizerSearch\\5b Customer\\5d _searchbutton")
    private WebElementFacade searchButton;

    @FindBy(css = "[class=\"button-on-white chip-event\"]")
    private WebElementFacade result;

    @FindBy(css = "select[id*='GrB2BCustomer.approvalStatus']")
    private WebElementFacade options;

    @FindBy(xpath = "//*[@id=\"outerTD\"]/table/tbody/tr[2]/td[3]/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr/td[1]")
    private WebElementFacade saveButton;

    @FindBy(css = "[id=\"Content/OrganizerItemChip$2[organizer.editor.delete.title]_label\"]")
    private WebElementFacade deleteButton;


    public void clickOnUserTab() {userTab.click();}

    public void clickOnCustomersTab(){customers.click();}

    public void inputItem(String key){idLabel.sendKeys("gr|sdr");}

    public void clickOnSearchButton(){searchButton.click();}

    public void clickOnResult(){result.click();}

    public void clickOnOptions(){options.click();}

    public void clickOnApprovedStatus(String status){

        options.find(By.cssSelector("option[value='0']")).click();

//        List<WebElementFacade> elementList = options.thenFindAll(By.cssSelector("option"));
//        for(WebElementFacade item : elementList){
//            if(item.getText().contentEquals(status)){
//                item.click();
//                break;
//            }
//        }
    }

    public void saveOptions(){saveButton.click();}

    public void deleteUser(){deleteButton.click();}

    public void confirmDelete(){
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}