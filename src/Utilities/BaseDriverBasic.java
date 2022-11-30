package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverBasic {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {
    //  System.out.println("Başlangıç İşlemleri");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);

        driver.manage().timeouts().implicitlyWait(dr);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
 /*
        loginTest();
    }


    void loginTest()
    {

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        System.out.println("login test");

        WebElement inputEmail = driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("alivelialiveli628@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Papatya123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();

        Assert.assertEquals(driver.getTitle(),"My Account", "Login Başarısız");

    }



    @AfterClass(enabled = true)
    public void bitisIslemleri()
    {
        System.out.println("Bitiş İşlemleri");
        Tools.Wait(3);
        driver.quit();
    }
*/
}
