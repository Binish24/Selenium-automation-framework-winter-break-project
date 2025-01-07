package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate_To_Flipkart_Fashion_Page {

    public WebDriver driver;


    public final WebElement fashionButton;
    public final WebElement kidsButton;
    public final WebElement infantWearButton;
    public final WebElement clothingAndAccessories;



    public Navigate_To_Flipkart_Fashion_Page(WebDriver driver) {
        this.driver = driver;
        this.fashionButton = driver.findElement(By.xpath("//span[text() ='Fashion']"));
        this.kidsButton = driver.findElement(By.xpath("//a [@class ='_1BJVlg _11MZbx']"));
        this.infantWearButton = driver.findElement(By.xpath("//a [text() ='Infant Wear']"));
        this.clothingAndAccessories = driver.findElement(By.xpath(""));
    }

    public void isSelectFashionButton() {
        fashionButton.isSelected();
    }

    public void isSelectedKidsButton () {
        kidsButton.isSelected();
    }

    public void clickOnInfantWearButton () {
        infantWearButton.click();
    }

    public void printClothingAndAccessoriesText(String text) {
        clothingAndAccessories.getText();
    }


}
