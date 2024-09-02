package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.HomePage;
import tek.bdd.utility.SeleniumUtility;

public class HomePageSteps extends SeleniumUtility {

    @Then("validate home page title is TEK Insurance App")
   public void validateHomePageTitle() {
        String actualResult = getElementText(HomePage.HOME_PAGE_TITLE);
        Assert.assertEquals(    "TEK Insurance App" , actualResult);
        System.out.println(actualResult);
    }
    @Then("validate Create Primary Account button is exist")
    public void validateCreatePrimaryAccountButton() {
       boolean isCreatePrimaryAccountButtonIsExist = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT);
       Assert.assertTrue(isCreatePrimaryAccountButtonIsExist);

    }
}
