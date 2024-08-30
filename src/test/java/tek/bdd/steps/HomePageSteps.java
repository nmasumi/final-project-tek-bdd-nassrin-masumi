package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Given("open browser and navigate to insurance app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }
    @Then("validate home page title is TEK Insurance App")
    public void validateHomePageTitle() {
        String text = getElementText(By.className("chakra-heading css-1at26de"));

        System.out.println(text);
    }
    @Then("close the browser")
    public void closeBrowser () {
        quitBrowser();
    }
}
