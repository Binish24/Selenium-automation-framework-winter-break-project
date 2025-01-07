package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate_To_Flipkart_Two_Wheelers_page {

    public WebDriver driver;

    WebElement twoWheelersButton;
    WebElement electricVehicles;
    WebElement olaS1x;




    public Navigate_To_Flipkart_Two_Wheelers_page (WebDriver driver) {
        this.driver = driver;
        this.twoWheelersButton = driver.findElement(By.xpath("//span[text() ='Two Wheelers']"));
        this.electricVehicles = driver.findElement(By.xpath("//a[text() ='Electric Vehicles']"));
        this.olaS1x = driver.findElement(By.xpath("//a[contains(text() , 'OLA S1 X (2 kWh) Booking for Ex-Showroom Price')]"));

    }

    public void placeTheMouseOverTheTwoWheelersButton () {
        twoWheelersButton.isSelected();
    }

    public void clickElectricVehicles() {
        electricVehicles.click();
    }

    public void clickOnOlaS1x() {
        olaS1x.click();
    }
}
