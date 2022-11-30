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

        Scenario 3: Login Testing
        ➢ Navigate to the website
        ➢ Click Login button
        ➢ Enter a valid e-mail and password
        ➢ Click Login button, and assert that you logged in */


public class Test3 extends BaseDriverBasic {

    @Test

   public void Test3() throws AWTException {

        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn= driver.findElement(By.cssSelector("a[class='ico-login']"));
        logIn.click(); Tools.Wait(1);


        WebElement logInEmail= driver.findElement(By.cssSelector("input[id='Email']"));
        logInEmail.sendKeys("ahmetveli@yahoo.com"); Tools.Wait(1);

        Robot rbt=new Robot();
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);

        WebElement password= driver.findElement(By.cssSelector("input[id='Password']"));
        password.sendKeys("1234567A"); Tools.Wait(1);

        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER); Tools.Wait(1);

        WebElement mailVerify= driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
        Assert.assertTrue(mailVerify.getText().contains("Welcome to our store"), "Unsuccessful LogIn");

         driver.close();
    }


}
