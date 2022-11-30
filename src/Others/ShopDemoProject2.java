package Others;

import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShopDemoProject2 {
    public static void main(String[] args) {


/*

Test Case:2
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Pay using debit card a tıklatınız.
➢ Pay butonuna tıklatınız.
➢ Invalid Email, Invalid Email, invalid billing name mesajlarının görüldüğünü doğrulayınız.

 */


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Sevi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://shopdemo.e-junkie.com/");

        WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
        eBookAddtoCart.click();

        driver.switchTo().frame(5);
        Tools.Wait(2);
        WebElement debitCard = driver.findElement(By.cssSelector("button[class='Payment-Button CC']"));
        debitCard.click();
        Tools.Wait(2);
        WebElement pay = driver.findElement(By.cssSelector("[class='Pay-Button']"));
        pay.click();
        Tools.Wait(2);

        WebElement allert=driver.findElement(By.cssSelector("[class='Close-SnackBar md hydrated']~span"));

        driver.quit();
            }
        }



