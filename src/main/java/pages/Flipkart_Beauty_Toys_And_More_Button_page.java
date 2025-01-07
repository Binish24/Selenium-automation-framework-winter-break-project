package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Beauty_Toys_And_More_Button_page {

    public WebDriver driver;

    public WebElement beautyToysAndMorePage;
    public WebElement booksButton;
    public WebElement literatureAndFictionButton;
    public WebElement literatureAndFictionText;



   public Flipkart_Beauty_Toys_And_More_Button_page (WebDriver driver) {
       this.driver = driver;
       this.beautyToysAndMorePage = driver.findElement(By.xpath("//div [@aria-label ='Beauty, Toys & More']"));
       this.booksButton = driver.findElement(By.xpath("//a [@class ='_1BJVlg']"));
       this.literatureAndFictionButton = driver.findElement(By.xpath("//a [text() ='Literature & Fiction']"));
       this.literatureAndFictionText = driver.findElement(By.xpath("//img [@alt ='Literature and Fiction']"));
   }

   public void placeTheMouseOnTheBeautyToysAndMorePage() {
       beautyToysAndMorePage.isSelected();
   }

   public void dragAndPlaceTheMouseOnTheBooksButton() {
       booksButton.isSelected();
   }

   public void dragAndClickOnLiteratureAndFictionButton () {
       literatureAndFictionButton.click();
   }

   public String printLiteratureAndFictionText() {
       return literatureAndFictionButton.getText();
   }
}
