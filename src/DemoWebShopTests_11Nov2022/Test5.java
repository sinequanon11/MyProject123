package DemoWebShopTests_11Nov2022;

import Utilities.BaseDriverBasic;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

/* This project is testing the http://demowebshop.tricentis.com/ website

        Scenario 5: Order Testing
        ➢ Navigate to the website
        ➢ Login
        ➢ Click “14.1-inch Laptop” located under FEATURED PRODUCTS
        ➢ Click Ad To Cart button and assert that this item is added to the cart
        ➢ Click Shopping Cart button and assert that this item is displayed
        ➢ Click Agree check box and accept the conditions
        ➢ Click Checkout button
        ➢ Enter all the information required and click confirm order button
        ➢ Assert that “Your order has been successfully processed!” message is displayed */


public class Test5 extends BaseDriverBasic {

    @Test

    public void Test5() throws AWTException {

        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn= driver.findElement(By.cssSelector("a[class='ico-login']"));
        logIn.click(); Tools.Wait(2);

        Actions actions = new Actions(driver);
        WebElement eMail = driver.findElement(By.cssSelector("input[id='Email']"));
        actions.sendKeys("ahmetveli@yahoo.com")
                .sendKeys(Keys.TAB)
                .sendKeys("1234567A")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform(); Tools.Wait(2);

        WebElement laptop= driver.findElement(By.xpath("//img[@title='Show details for 14.1-inch Laptop']"));
        laptop.click();

        WebElement addToChart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addToChart.click();

        WebElement confirmmessage=driver.findElement(By.cssSelector("[class='content']"));

        // Assert.assertTrue("Item did not added to your chart",confirmmessage.getText().contains("The product has been added to your "));

        WebElement shoppingChart= driver.findElement(By.cssSelector("a[class='ico-cart']>span"));
        shoppingChart.click();

        WebElement productVerify=driver.findElement(By.cssSelector("a[class='product-name']"));
        // Assert.assertTrue("Your chart is empty",productVerify.getText().contains("14.1-inch Laptop"));

        WebElement aggreeButton= driver.findElement(By.cssSelector("input[id='termsofservice']"));
        aggreeButton.click();

        WebElement checkOutButton= driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutButton.click();

        WebElement firstName = driver.findElement(By.id("BillingNewAddress_FirstName"));

        actions.click(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).build().perform();

        Tools.Wait(4);

        WebElement countrySelect=driver.findElement(By.cssSelector("select[id='BillingNewAddress_CountryId']"));
        Select slct=new Select(countrySelect);
        slct.selectByVisibleText("Turkey");
        actions.sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Ankara")
                .sendKeys(Keys.TAB)
                .sendKeys("Çankaya")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("06100")
                .sendKeys(Keys.TAB)
                .sendKeys("00905555555")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).build().perform();

        Tools.Wait(2);
        WebElement continueButton= driver.findElement(By.cssSelector("input[onclick='Billing.save()']"));
        continueButton.click();

        Tools.Wait(2);
        WebElement continueButton2=driver.findElement(By.cssSelector("input[onclick='Shipping.save()']"));
        continueButton2.click();

        Tools.Wait(2);
        WebElement continueButton3=driver.findElement(By.cssSelector("input[onclick='ShippingMethod.save()']"));
        continueButton3.click();

        Tools.Wait(2);
        WebElement continueButton4=driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()']"));
        continueButton4.click();

        Tools.Wait(2);
        WebElement continueButton5=driver.findElement(By.cssSelector("input[onclick='PaymentInfo.save()']"));
        continueButton5.click();

        Tools.Wait(2);
        WebElement continueButton6=driver.findElement(By.cssSelector("input[onclick='ConfirmOrder.save()']"));
        continueButton6.click();

        WebElement orderConfirmation=driver.findElement(By.cssSelector("div[class='title']>strong"));

        Assert.assertTrue(orderConfirmation.getText().contains("Your order has been successfully processed!"),
                "Order unsuccessful");
    }
}
