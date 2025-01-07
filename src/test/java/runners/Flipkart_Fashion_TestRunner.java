package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.experimental.categories.Category;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@NavigateToFashion"
)

public class Flipkart_Fashion_TestRunner extends AbstractTestNGCucumberTests {
}
