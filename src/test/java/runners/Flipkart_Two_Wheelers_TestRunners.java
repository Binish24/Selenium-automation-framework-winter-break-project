package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (

        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@regression"
)

public class Flipkart_Two_Wheelers_TestRunners extends AbstractTestNGCucumberTests {
}
