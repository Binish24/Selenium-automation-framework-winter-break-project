package stepdefinations;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Navigate_To_Flipkart_Fashion_Page;

public class Navigate_To_Flipkart_Fashion_step extends BaseTest {

    Navigate_To_Flipkart_Fashion_Page navigateToFlipkartFashionPage;

    @Before
    public void setup() {
        super.setup();
    }

    @Given("The user is on the Flipkart web main page")
    public void The_user_is_on_the_Flipkart_web_main_page () {
    }

    @When("The user is place on Fashion button")
    public void The_user_is_place_on_Fashion_button() {
        navigateToFlipkartFashionPage.isSelectFashionButton();
    }

    @And("The user is drag and place the mouse on the Kids button")
    public void The_user_is_drag_and_place_the_mouse_on_the_Kids_button() {
        navigateToFlipkartFashionPage.isSelectedKidsButton();
    }

    @And("The user click on Infant Wear")
    public void The_user_click_on_Infant_Wear() {
        navigateToFlipkartFashionPage.clickOnInfantWearButton();
    }

    @Then("The user will navigate to Clothing and Accessories page")
    public void The_user_will_navigate_to_Clothing_and_Accessories_page() {
     navigateToFlipkartFashionPage.printClothingAndAccessoriesText("Clothing and Accessories");
    }
}
