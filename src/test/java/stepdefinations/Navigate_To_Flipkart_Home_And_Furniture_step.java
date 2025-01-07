package stepdefinations;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Navigate_To_Home_Furniture_page;

public class Navigate_To_Flipkart_Home_And_Furniture_step extends BaseTest {

    Navigate_To_Home_Furniture_page navigateToHomeFurniturePage;

    @Before
    public void setup()  {
        super.setup();
    }

    @Given("I am on Flipkart web main page")
    public void I_am_on_Flipkart_web_main_page() {
    }

    @When("I place the mouse on Home and Furniture button")
    public void I_place_the_mouse_on_Home_and_Furniture_button() {
        navigateToHomeFurniturePage.placeTheMouseOnHomeAndFurnitureButton();
    }

    @And("I drag and place the mouse on the Cleaning and Bath button")
    public void I_drag_and_place_the_mouse_on_the_Cleaning_and_Bath_button() {
        navigateToHomeFurniturePage.dragAndPlaceTheMouseOnCleaningAndBathButton();
    }

    @And("I click on Mops button")
    public void I_click_on_Mops_button () {
        navigateToHomeFurniturePage.clickOnMopsButton();
    }

    @Then("I will navigated to the Mops page")
    public void I_will_navigate_to_the_Mops_page() {
       String actualText = navigateToHomeFurniturePage.printMopsText(); // First; class name and second; function name
       String expectedText = "Mops";  // expected text
        Assert.assertEquals(actualText,expectedText,"dose not match");
    }
}
