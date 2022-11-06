package CampusTests;

import Utilities.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Sevi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");

        driver.switchTo().frame("moneyiframe");
        // driver.switchTo().frame(0);

        String NSE = driver.findElement(By.id("nseindex")).getText();
        System.out.println(NSE);

        MyFunc.Wait(2);

        driver.quit();

    }
}
