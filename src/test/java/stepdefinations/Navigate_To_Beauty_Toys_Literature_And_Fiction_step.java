package stepdefinations;

import base.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import pages.Flipkart_Beauty_Toys_And_More_Button_page;

import java.time.Duration;

public class Navigate_To_Beauty_Toys_Literature_And_Fiction_step extends BaseTest {

    Flipkart_Beauty_Toys_And_More_Button_page flipkartBeautyToysAndMoreButtonPage;

    @Before
    public void setup () {
        super.setup();
    }

    @Given("The user is on the Flipkart web main page")
    public void The_user_is_on_the_Flipkart_web_main_page() {
    }

    @When("The user place the mouse on Beauty_Toys and More button")
    public void The_user_place_the_mouse_on_Beauty_Toys_and_More_button(){
        flipkartBeautyToysAndMoreButtonPage.placeTheMouseOnTheBeautyToysAndMorePage();
    }

    @And("The user drag and place the mouse on Books button")
    public void The_user_drag_and_place_the_mouse_on_Books_button() {
        flipkartBeautyToysAndMoreButtonPage.dragAndPlaceTheMouseOnTheBooksButton();
    }

    @And("The user drag_and click on Literature and Fiction button")
    public void The_user_drag_and_click_on_Literature_and_Fiction_button(){
        flipkartBeautyToysAndMoreButtonPage.dragAndClickOnLiteratureAndFictionButton();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(StaleElementReferenceException.class);
    }

    @Then("The user will see Literature and Fiction text in middle of the page")
    public void The_user_will_see_Literature_and_Fiction_text_in_middle_of_the_page(){
     String actualText = flipkartBeautyToysAndMoreButtonPage.printLiteratureAndFictionText(); //name of page and name of function
     String expectedText =  "Literature & Fiction";
        Assert.assertEquals(actualText,expectedText,"not match");
    }
}
