package Others;

import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopDemoProject1 {
    public static void main(String[] args) {

/*
Test Case 1:
➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
➢ E-book add to cart butonuna tıklatınız.
➢ Add promo code butonuna tıklatıp veri giriniz.
➢ Apply butonuna tıklayınız.
➢ Invalid promo code yazısının görüldüğünü doğrulayınız
 */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Sevi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

                driver.get("https://shopdemo.e-junkie.com/");

                WebElement eBookAddtoCart = driver.findElement(By.cssSelector("div[class='column is-one-third-desktop is-one-third-tablet card_box']~div button"));
                eBookAddtoCart.click();
                driver.switchTo().frame(5);
                Tools.Wait(1);
                WebElement addPromoCode = driver.findElement(By.cssSelector("[class='Apply-Button Show-Promo-Code-Button']"));
                Tools.Wait(1);
                addPromoCode.click();
                Tools.Wait(1);
                WebElement promoCode = driver.findElement(By.cssSelector("input[class='Promo-Code-Value']"));
                Tools.Wait(1);
                promoCode.click();
                Tools.Wait(1);
                promoCode.sendKeys("Grup4");
                WebElement applyButton = driver.findElement(By.cssSelector("button[class='Promo-Apply']"));
                applyButton.click();
                Tools.Wait(1);
                WebElement snapBar=driver.findElement(By.cssSelector("div[id='SnackBar']"));

                driver.quit();
            }
        }



