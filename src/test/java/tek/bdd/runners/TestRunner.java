package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature/HomePage.feature",
        glue = "tek.bdd.steps",
        dryRun = true
)
public class TestRunner {
}
