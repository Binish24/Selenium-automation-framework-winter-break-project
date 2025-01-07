package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinations",
        tags = "@Navigation"
)

public class Flipkart_Flight_Bookings_TestRunner extends AbstractTestNGCucumberTests {
}
