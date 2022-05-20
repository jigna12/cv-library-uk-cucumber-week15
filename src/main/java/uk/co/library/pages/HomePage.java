package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.drivermanager.ManageDriver;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageDriver.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = " //iframe[@id='gdpr-consent-notice']")
    WebElement gdprIframe;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='keywords'])[1]")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDownField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeFieldDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeFieldDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;


    public void clickOnGdprIframe() {
        switchToIFrame(gdprIframe);
        clickOnElement(acceptAllButton);
        driver.switchTo().defaultContent();
    }

    //    public void acceptIFrameAlert() throws InterruptedException {
//        Thread.sleep(500);
//        driver.switchTo().frame("gdpr-consent-notice");
//        clickOnElement(acceptAllButton);
//        log.info("accept IFrame Alert " + acceptAllButton.getText() + "<br>");
    // }
    public void enterJobTitle(String jobTitle) {
        log.info("enter Job Title " + jobTitleField.getText() + "<br>");
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        log.info("enter Location " + locationField.getText() + "<br>");
        sendTextToElement(locationField, location);
    }

    public void selectDistanceDropDown(String distance) {
        log.info("select Distance DropDown " + distanceDropDownField.getText() + "<br>");
        selectByVisibleTextFromDropDown(distanceDropDownField, distance);
    }

    public void clickMoreSearchOptionsLink() {
        log.info("click More Search Options Link " + moreSearchOptionsLink.getText() + "<br>");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterSalaryMin(String minSalary) {
        log.info("enter Salary Min " + salaryMinField.getText() + "<br>");
        sendTextToElement(salaryMinField, minSalary);
    }

    public void enterSalaryMax(String maxSalary) {
        log.info("enter Salary Maxk " + salaryMaxField.getText() + "<br>");
        sendTextToElement(salaryMaxField, maxSalary);
    }

    public void selectSalaryTypeFieldDropDown(String sType) {
        log.info("select Salary Type Field DropDown " + salaryTypeFieldDropDown.getText() + "<br>");
        selectByVisibleTextFromDropDown(salaryTypeFieldDropDown, sType);
    }

    public void selectJobTypeFieldDropDown(String jType) {
        log.info("select Job Type Field DropDown " + jobTypeFieldDropDown.getText() + "<br>");
        selectByVisibleTextFromDropDown(jobTypeFieldDropDown, jType);
    }

    public void clickOnFindJobsBtn() {
        log.info("click On Find Jobs Btn " + findJobsBtn.getText() + "<br>");
        clickOnElement(findJobsBtn);
    }


}