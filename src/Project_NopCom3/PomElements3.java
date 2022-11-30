package Project_NopCom3;

import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomElements3 extends BaseDriverNopComProject3{

    public PomElements3() {

        PageFactory.initElements(BaseDriverNopComProject3.driver, this);
    }

 // Test Case 2: Check LeftNaw Menu
     @FindBy (xpath = "//p[normalize-space()='Catalog']")
     public WebElement Catalog;
    @FindBy (css = "i[class='nav-icon fas fa-shopping-cart']")
     public WebElement Sales;
    @FindBy (xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    public WebElement Customers ;
    @FindBy (linkText = "Promotions")
    public WebElement Promotions ;
    @FindBy (linkText = "Content management")
    public WebElement ContentManagement ;
    @FindBy (xpath = "//p[normalize-space()='Configuration']")
    public WebElement Configuration ;
    @FindBy (xpath = "//p[normalize-space()='System']")
    public WebElement System ;
    @FindBy (xpath = "//p[normalize-space()='Reports']")
    public WebElement Report ;
    @FindBy (xpath = "//i[@class='nav-icon fas fa-question-circle']")
    public WebElement Help ;

 // Test Case 3: Create Customer
    @FindBy (xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    public WebElement Customers2 ;
    @FindBy (xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    public WebElement CustomersSub;
    @FindBy (css = "a[class='btn btn-primary']")
    public WebElement addNew;

    @FindBy (xpath = "//input[@id='Email']")
    public WebElement email;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='FirstName']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@id='LastName']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@id='Gender_Male']")
    public WebElement genderMale;

    @FindBy (xpath = "//input[@id='DateOfBirth']")
    public WebElement DOB;

    @FindBy (xpath = "//input[@id='Company']")
    public WebElement CompanyName;

   @FindBy (xpath = "//input[@id='IsTaxExempt']")
   public WebElement isTaxExempt;

   @FindBy (xpath = "//div[@class='input-group-append']//input[@role='listbox']")
   public WebElement newsletter;

    @FindBy (css = "div[class='input-group-append input-group-required'] div[role='listbox']")
    public WebElement CustomerRoles;

    @FindBy (xpath = "//select[@id='VendorId']")
    public WebElement managerOfVendor;

    @FindBy (xpath = "//textarea[@id='AdminComment']")
    public WebElement adminComment;

    @FindBy (xpath = "//button[@name='save']")
    public WebElement save;

    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissable']")
    public WebElement confirmMessage;

    // Test Case 4: Edit Customer

    @FindBy (xpath = "//input[@id='SearchEmail']")
    public WebElement searchEmail;

    @FindBy (xpath = "//input[@id='SearchFirstName']")
    public WebElement searchFirstname;

    @FindBy (xpath = "//input[@id='SearchLastName']")
    public WebElement searchLastname;

    @FindBy (xpath = "//button[@id='search-customers']")
    public WebElement searchCustomers;

    @FindBy (xpath = "//i[@class='fas fa-check true-icon']")
    public WebElement checkTrue;

    @FindBy (xpath = "//a[normalize-space()='Edit']")
    public WebElement editButton;

    @FindBy (css = "i[class='fa toggle-icon fa-plus']")
    public WebElement CustomersInfo;

    @FindBy (xpath = "//input[@id='LastName']")
    public WebElement LastNameEdit;

    @FindBy (xpath = "//button[@name='save']")
    public WebElement saveEdit;

    @FindBy (css = "div[class='alert alert-success alert-dismissable']")
    public WebElement confirmMessageEdit;

    // Test Case 5: Delete Customer

    @FindBy (css = "a[class='btn btn-default']")
    public WebElement saveEdit2;

    @FindBy (xpath = "//span[@id='customer-delete']")
    public WebElement deleteCustomer;

    @FindBy (xpath = "//button[normalize-space()='Delete']")
    public WebElement yesDeleteCustomer;


    // Test Case 6: Search Test

    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy (xpath = "//div[@id='user-selection']//h5")
    public WebElement searchClick;

}


