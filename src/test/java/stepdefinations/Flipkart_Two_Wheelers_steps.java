package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Navigate_To_Flipkart_Two_Wheelers_page;

public class Flipkart_Two_Wheelers_steps extends BaseTest {

    Navigate_To_Flipkart_Two_Wheelers_page navigateToFlipkartTwoWheelersPage;

    @Before
    public void setup() {
        super.setup();
    }

    @Given("I am on Flipkart web main page")
    public void I_am_on_Flipkart_web_main_page(){
    }

    @When("I place the mouse on Two Wheelers button")
    public void I_place_the_mouse_on_Two_Wheelers_button(){
        navigateToFlipkartTwoWheelersPage.placeTheMouseOverTheTwoWheelersButton();
    }

    @And("I click on Electric Vehicles")
    public void I_click_on_Electric_Vehicles() {
        navigateToFlipkartTwoWheelersPage.clickElectricVehicles();
    }

    @And("I click on OLA S1X")
    public void I_click_on_OLA_S1X () {
        navigateToFlipkartTwoWheelersPage.clickOnOlaS1x();

    }

    @Then("I will be invited to the details page")
    public void I_will_be_invited_to_the_details_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}
