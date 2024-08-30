package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Given("open browser and navigate to insurance app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("validate home page title is {string}")
   public void validateTheTitleIs(String expectedResult) {
        String actualResult = getTitleElement();

        Assert.assertEquals(    "TEKSchool Insurance" , actualResult);
    }
    @Then("close the browser")
    public void closeBrowser () {
        quitBrowser();
    }
}
