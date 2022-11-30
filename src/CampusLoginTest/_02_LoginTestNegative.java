package CampusLoginTest;

import Utilities.BaseDriverBasic;
import Utilities.Tools;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _02_LoginTestNegative extends BaseDriverBasic {

    @Test

    public void Test2() throws IOException {

        driver.get("https://campus.techno.study/");

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        username.sendKeys("aziz_sevi11111");  Tools.Wait(1);

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("P111222333444");  Tools.Wait(1);

        WebElement login = driver.findElement(By.cssSelector("button[aria-label='LOGIN']"));
        login.click();     Tools.Wait(4);

        File sShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination= new File("MyScreenShots/screenshot_"+TimeNow()+".png");
        FileUtils.copyFile(sShot, destination);  Tools.Wait(1);

        driver.close();
    }
        public static <string> string TimeNow() {
        return (string) new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
