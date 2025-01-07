package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate_To_Home_Furniture_page {

    public WebDriver driver;


    WebElement homeAndFurnitureButton;
    WebElement cleaningAndBathButton;
    WebElement mopsButton;
    WebElement mopsText;


    public Navigate_To_Home_Furniture_page( WebDriver driver) {
        this.driver = driver;
        this.homeAndFurnitureButton = driver.findElement(By.xpath("//span [text() ='Home & Furniture']"));
        this.cleaningAndBathButton = driver.findElement(By.xpath("//a [@class ='_1BJVlg _11MZbx']"));
        this.mopsButton = driver.findElement(By.xpath("//a [text() ='Mops']"));
        this.mopsText = driver.findElement(By.xpath("//h1 [text() ='Mops']"));
    }

    public void placeTheMouseOnHomeAndFurnitureButton() {
        homeAndFurnitureButton.isSelected();
    }

    public void dragAndPlaceTheMouseOnCleaningAndBathButton () {
        cleaningAndBathButton.isSelected();
    }

    public void clickOnMopsButton() {
        mopsButton.click();
    }

    public String printMopsText () {
        return mopsText.getText();
    }
}
