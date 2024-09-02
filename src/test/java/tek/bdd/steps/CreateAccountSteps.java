package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.CreateAccountPage;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    @When("user click on Create Primary Account button")
    public void clickOnCreatePrimaryAccountLink() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_LINK);
    }
  @Then("validate section title to be Create Primary Account Holder")
    public void validatePageTitle () {
        String createPrimaryAccountHolder = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER);
      Assert.assertEquals("Create Primary Account Holder" , createPrimaryAccountHolder);
    }

}
