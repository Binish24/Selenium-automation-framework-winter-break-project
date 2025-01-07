package stepdefinations;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Flipkart_Flight_Bookings_Page;
import utils.WaitUtils;

public class Flipkart_Flight_Bookings_step extends BaseTest {

    Flipkart_Flight_Bookings_Page flipkartFlightBookingsPage;

    @Before
    public void setup (){
        super.setup();
    }

    @Given("I am on Flipkart web main page")
    public void I_am_Flipkart_web_main_page() {
    }
    // WaitUtils.applyWait(driver,flipkartFlightBookingsPage.flightBookingsButton, WaitStrategy.CLICKABLE);

    @When("I click on Flight Bookings button")
    public void I_click_on_Flight_Bookings_button() {
        flipkartFlightBookingsPage.clickOnOneWayButton();
        WaitUtils.applyGlobalWait();
    }

    @And("I select One Way Trip")
    public void I_select_One_Way_Trip() {
        flipkartFlightBookingsPage.clickOnOneWayButton();
    }

    @And("I click on From input field and select the origin")
    public void I_click_on_From_input_field_and_select_the_origin() {
        flipkartFlightBookingsPage.clickFromInputField();
    }

    @And("I click on To input field and select the destination")
    public void I_click_on_To_input_filed_and_select_the_destination() {
        flipkartFlightBookingsPage.clickToInputFiled();
    }

    @And("I click on Depart On button and select and depart exact date")
    public void I_click_on_Depart_On_button_and_select_and_depart_exact_date() {
        flipkartFlightBookingsPage.clickOnDepartOn();
    }

    @And("I click on Travellers and Class button and select Travellers and Cabin Class")
    public void I_click_on_Travellers_and_Class_button_and_select_Travellers_and_Cabin_Class() {
        flipkartFlightBookingsPage.clickOnTravellersAndClass();
    }

    @And("I click on Search button")
    public void I_click_on_Search_button() {
        flipkartFlightBookingsPage.clickOnSearchButton();
    }

    @Then("I will see the result of my search")
    public void I_will_see_the_result_of_my_search(){
        WaitUtils.applyGlobalWait();
    }

    @After
    public void tearDown () {

        super.tearDown();
    }
}
