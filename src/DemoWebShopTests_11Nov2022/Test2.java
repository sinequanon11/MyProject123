package DemoWebShopTests_11Nov2022;

import Utilities.BaseDriverBasic;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

        /* This project is testing the http://demowebshop.tricentis.com/ website

        Scenario 2: Negative Register Testing
        ➢ Navigate to the website
        ➢ Click Register button
        ➢ Try to register with the same e-mail
        ➢ Click Register button
        ➢ Assert that “The specified email already exists” message is displayed */


public class Test2 extends BaseDriverBasic {

    @Test

    public void Test2() throws AWTException {

        driver.get("https://demowebshop.tricentis.com/");

        WebElement registerButton=driver.findElement(By.cssSelector("a[class='ico-register']"));
        registerButton.click(); Tools.Wait(1);


        WebElement genderMale=driver.findElement(By.id("gender-male"));
        genderMale.click(); Tools.Wait(1);

        WebElement name= driver.findElement(By.cssSelector("input[id='FirstName']"));
        name.sendKeys("Ahmet"); Tools.Wait(1);

        WebElement lastName=driver.findElement(By.cssSelector("input[id='LastName']"));
        lastName.sendKeys("Veli"); Tools.Wait(1);

        WebElement email= driver.findElement(By.cssSelector("[id=Email]"));
        email.sendKeys("ahmetveli@yahoo.com"); Tools.Wait(1);

        WebElement password= driver.findElement(By.cssSelector("[id=Password]"));
        password.sendKeys("1234567A"); Tools.Wait(1);

        WebElement confirmPassword= driver.findElement(By.cssSelector("[id=ConfirmPassword]"));
        confirmPassword.sendKeys("1234567A"); Tools.Wait(1);

        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER); Tools.Wait(1);

        WebElement registerConfirm= driver.findElement(By.cssSelector("div[class='validation-summary-errors'] > ul > li"));

        Assert.assertTrue(registerConfirm.getText().contains("The specified email already exists"),
                "Registration succesfull");

        driver.close();
    }
}
