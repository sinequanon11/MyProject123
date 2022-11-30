package DemoWebShopTests_11Nov2022;

import Utilities.BaseDriverBasic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

        /* This project is testing the http://demowebshop.tricentis.com/ website

        Scenario 1: Register Testing
        ➢ Navigate to the website
        ➢ Click Register button
        ➢ Enter personal information required and click Register
        ➢ Assert that you successfully registered */


public class Test1 extends BaseDriverBasic {

    @Test

     public void Test1(){

    driver.get("https://demowebshop.tricentis.com/");

    WebElement register = driver.findElement(By.cssSelector("a[class='ico-register']"));
    Actions actions = new Actions(driver);
        actions.click(register).perform();
    WebElement gender = driver.findElement(By.cssSelector("input[id='gender-male']"));
        actions.click(gender)
            .sendKeys(Keys.TAB)
                .sendKeys("Ahmet")
                .sendKeys(Keys.TAB)
                .sendKeys("Veli")
                .sendKeys(Keys.TAB)
                .sendKeys("ahmetveli@yahoo.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1234567A")
                .sendKeys(Keys.TAB)
                .sendKeys("1234567A")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

       WebElement registerMessage= driver.findElement(By.cssSelector("div[class='result']"));
       Assert.assertTrue(registerMessage.getText().contains("Your registration completed"),
               "Registration unsuccessfull");

        driver.close();

}}
