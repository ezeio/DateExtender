package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import service.DateCalculator;

public class ExtendDate {

    private DateCalculator dateCalculator;

    @Given("^I have a valid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" that make up a date$")
    public void iHaveAValidThatMakeUpADate(String day, String month, String year) throws Throwable {
        dateCalculator = new DateCalculator(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
    }

    @When("^I provide a \"([^\"]*)\" to extend the current date$")
    public void iProvideAToExtendTheCurrentDate(String numberOfDays) throws Throwable {
        dateCalculator.addDate(Integer.parseInt(numberOfDays));
    }

    @Then("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" should be valid$")
    public void shouldBeValid(String day, String month, String year) throws Throwable {
        Assert.assertEquals(Integer.parseInt(day), dateCalculator.getDay());
        Assert.assertEquals(Integer.parseInt(month), dateCalculator.getMonth());
        Assert.assertEquals(Integer.parseInt(year), dateCalculator.getYear());
    }
}
