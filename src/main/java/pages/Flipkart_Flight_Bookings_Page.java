package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Flight_Bookings_Page {

    public WebDriver driver;


    public WebElement flightBookingsButton;
    public WebElement oneWay;
    public WebElement fromInputField;
    public WebElement toInputField;
    public WebElement departOn;
    public WebElement travellersAndClass;
    public WebElement searchButton;


    public Flipkart_Flight_Bookings_Page(WebDriver driver) {
        this.driver = driver;
        this.flightBookingsButton = driver.findElement(By.xpath("//span[text() ='Flight Bookings']"));
        this.oneWay = driver.findElement(By.xpath("//div [text() ='One Way']"));
        this.fromInputField = driver.findElement(By.xpath("//div[@class ='Reem3Q PNc-Ga _92tk+3']"));
        this.toInputField = driver.findElement(By.xpath("//div[@class ='Reem3Q PNc-Ga _92tk+3']"));
        this.departOn = driver.findElement(By.xpath("//input[text() ='v2VFa- k2khBy z2D4XG']"));
        this.travellersAndClass = driver.findElement(By.xpath("//input[@class ='v2VFa- n-5ycO z2D4XG']"));
        this.searchButton = driver.findElement(By.xpath("//span[text() ='SEARCH']"));

    }

    public void clickOnFlightBookingsButton () {
        flightBookingsButton.click();
    }

    public void clickOnOneWayButton () {
        oneWay.click();
    }

    public void clickFromInputField () {
        fromInputField.isSelected();
    }

    public void clickToInputFiled () {
        toInputField.isSelected();
    }

    public void clickOnDepartOn() {
        departOn.isSelected();
    }

    public void clickOnTravellersAndClass(){
        travellersAndClass.isSelected();
    }

    public void clickOnSearchButton() {
        searchButton.click();

    }



}
