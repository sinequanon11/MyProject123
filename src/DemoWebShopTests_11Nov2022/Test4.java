package DemoWebShopTests_11Nov2022;

import Utilities.BaseDriverBasic;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;

/* This project is testing the http://demowebshop.tricentis.com/ website

        Scenario 4: Negative Login Testing
        ➢ Navigate to the website
        ➢ Click Login button
        ➢ Enter an invalid e-mail and password
        ➢ Click Login button, and assert that you are not able to log in */

public class Test4 extends BaseDriverBasic {

    @Test

    public void Test() throws AWTException {

        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn= driver.findElement(By.cssSelector("a[class='ico-login']"));
        logIn.click();
        Tools.Wait(1);

        WebElement logInEmail= driver.findElement(By.cssSelector("input[id='Email']"));
        logInEmail.sendKeys("ahmetveli11@yahoo.com"); Tools.Wait(1);

        Actions actions = new Actions(driver);
        actions
                .sendKeys(Keys.TAB)
                .sendKeys("1111111")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        WebElement mailVerify= driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
        Assert.assertTrue(mailVerify.getText().contains("Login was unsuccessful."),"login Succefull");


    }
}
