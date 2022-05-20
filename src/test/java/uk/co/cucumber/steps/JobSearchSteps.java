package uk.co.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;


public class JobSearchSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() { }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String JobTitle) {
        new HomePage().enterJobTitle(JobTitle);
        new HomePage().clickOnGdprIframe();
    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String Location) {
        new HomePage().enterLocation(Location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistanceDropDown(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickMoreSearchOptionsLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterSalaryMin(salaryMin);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterSalaryMax(salaryMax);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryTypeFieldDropDown(salaryType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobTypeFieldDropDown(jobType);
    }

    @And("^I click on 'Find Jobs' button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsBtn();
    }


    @Then("^I should verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)  {
        Assert.assertEquals("not found",result,new ResultPage().verifyResultPage());

    }

}
