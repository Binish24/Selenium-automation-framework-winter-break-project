package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@NavigateBeautyAndToys"
)

public class Flipkart_Beauty_Toys_And_More_TestRunner extends AbstractTestNGCucumberTests {
}
