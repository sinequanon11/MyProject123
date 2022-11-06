package CampusTests;

import Utilities.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Test2Group3  {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aziz Sevi\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://campus.techno.study/");

        WebElement username =driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        username.sendKeys("aziz_sevi");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("AliVeli4959");
        MyFunc.Wait(1);

        WebElement login = driver.findElement(By.cssSelector("button[aria-label='LOGIN']"));
        login.click();
        MyFunc.Wait(1);

        WebElement courses = driver.findElement(By.cssSelector("body[class='ng-tns-0-0'"));
        courses.click();
        System.out.println("Courses displayed = " + courses.isDisplayed());
        MyFunc.Wait(1);

        driver.quit();


    }





}
