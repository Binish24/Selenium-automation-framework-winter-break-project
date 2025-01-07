package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (

        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@NavigateToHomeFurniture"
)

public class HomeAndFurniture_TestRunner extends AbstractTestNGCucumberTests {
}
