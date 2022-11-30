package Project_NopCom3;

import Utilities.Tools;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProjectRunner3 extends BaseDriverNopComProject3{

 // Test Case 2: Check LeftNaw Menu
    @Test (priority = 2)
    void checkLeftNavMenu(){
    PomElements3 elements = new PomElements3();
    Tools.Wait(1);
    elements.Catalog.click();
    Tools.Wait(1);
    elements.Sales.click();
    Tools.Wait(1);
    elements.Customers.click();
    Tools.Wait(1);
    elements.Promotions.click();
    Tools.Wait(1);
    elements.ContentManagement.click();
    Tools.Wait(1);
    elements.Configuration.click();
    Tools.Wait(1);
    elements.System.click();
    Tools.Wait(1);
    elements.Report.click();
    Tools.Wait(1);
    elements.Help.click();
    Tools.Wait(2);
    }

 // Test Case 3: Create Customer
    @Test (priority = 3)
    void createCustomer(){
    PomElements3 elements = new PomElements3();
    elements.Customers2.click();
    Tools.Wait(1);
    elements.CustomersSub.click();
    Tools.Wait(2);

    elements.addNew.click();
    Tools.Wait(1);

    elements.email.sendKeys("admin111@yourstore.com");
    Tools.Wait(1);
    elements.password.sendKeys("admin111");
    Tools.Wait(1);
    elements.firstName.sendKeys("Ali");
    Tools.Wait(1);
    elements.lastName.sendKeys("Veli");
    Tools.Wait(1);
    elements.genderMale.click();
    Tools.Wait(1);
    elements.DOB.sendKeys("10/10/2000");
    Tools.Wait(1);
    elements.CompanyName.sendKeys("Applet");
    Tools.Wait(1);
    elements.isTaxExempt.click();
    Tools.Wait(1);
    Actions actions = new Actions(driver);
    actions.moveToElement(elements.newsletter).click().sendKeys("T").
    sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
    Tools.Wait(1);
    actions.moveToElement(elements.CustomerRoles).click().sendKeys("F").
    sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
    Tools.Wait(1);
    Select slct=new Select(elements.managerOfVendor);
    slct.selectByIndex(2);
    Tools.Wait(1);
    elements.adminComment.sendKeys("This aims to add a new customer");
    Tools.Wait(1);
    elements.save.click();
    Tools.Wait(2);
    Assert.assertTrue(elements.confirmMessage.getText().contains("success"),
               "The attempt to add a new customer failed");
    Tools.Wait(2);

    }

 // Test Case 4: Edit Customer
    @Test (priority = 4)
    void editCustomer(){
    PomElements3 elements = new PomElements3();
    elements.searchEmail.sendKeys("admin111@yourstore.com");
    Tools.Wait(1);
    elements.searchFirstname.sendKeys("Ali");
    Tools.Wait(1);
    elements.searchLastname.sendKeys("Veli");
    Tools.Wait(1);
    elements.searchCustomers.click();
    Tools.Wait(3);
    Assert.assertTrue(elements.checkTrue.isDisplayed(),"Not displayed");
    Tools.Wait(1);
    elements.editButton.click();
    Tools.Wait(1);
    elements.CustomersInfo.click();
    Tools.Wait(1);
    elements.LastNameEdit.clear();
    elements.LastNameEdit.sendKeys("Veli1234");
    Tools.Wait(1);
    elements.saveEdit.click();
    Tools.Wait(2);
    Assert.assertTrue(elements.confirmMessageEdit.getText().contains("success"),
               "The attempt to edit failed");
    Tools.Wait(2);

    }

 // Test Case 5: Delete Customer
    @Test (priority = 5)
    void deleteCustomer(){
    PomElements3 elements = new PomElements3();
    elements.CustomersSub.click();
    Tools.Wait(2);
    elements.searchEmail.sendKeys("admin111@yourstore.com");
    Tools.Wait(1);
    elements.searchFirstname.sendKeys("Ali");
    Tools.Wait(1);
    elements.searchLastname.sendKeys("Veli1234");
    Tools.Wait(1);
    elements.searchCustomers.click();
    Tools.Wait(3);
    elements.saveEdit2.click();
    Tools.Wait(1);
    elements.deleteCustomer.click();
    Tools.Wait(1);
    elements.yesDeleteCustomer.click();
    Assert.assertTrue(elements.confirmMessageEdit.getText().contains("success"),
               "The attempt to delete failed");
    Tools.Wait(2);
    }

 // Test Case 6: Search Test
    @Test (priority = 6)
    void searchText(){
    PomElements3 elements = new PomElements3();
    elements.searchBox.sendKeys("Shipments");
    Tools.Wait(2);
    elements.searchClick.click();
    Tools.Wait(2);
    Assert.assertTrue(driver.getCurrentUrl().contains("Shipment"), "The page does not include Shipment");


    }

}
