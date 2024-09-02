package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate home page title is TEK Insurance App")
   public void validateHomePageTitle(String expectedResult) {
        String actualResult = getElementText(By.className("chakra-heading css-1at26de"));
        Assert.assertEquals(    "TEKSchool Insurance App" , actualResult);
        System.out.println(actualResult);
    }
    @Then("validate Create Primary Account button is exist")
    public void validateCreatePrimaryAccountButton() {
       boolean isCreatePrimaryAccountButtonIsExist = isElementEnabled(By.className("chakra-button css-1jp0m7c"));
       Assert.assertTrue(isCreatePrimaryAccountButtonIsExist);

    }
}
