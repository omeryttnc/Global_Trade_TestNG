package Emrullah.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorRegisterPage {
    WebDriver driver;

    public VendorRegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Seller Join Now")
    public WebElement sellerJoinNow;

    @FindBy(id = "company_name")
    public WebElement companyName;

    @FindBy(id = "company_mobile")
    public WebElement companyMobile;

    @FindBy(id = "company_address")
    public WebElement companyAddress;

    @FindBy(id = "vender_name")
    public WebElement vendorName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "sub_domain")
    public WebElement subDomain;

    @FindBy(id = "vender_mobile")
    public WebElement vendorMobile;

    @FindBy(name = "country")
    public WebElement countryDropDown;

    @FindBy(id = "select_state")
    public WebElement state;

    @FindBy(id = "select_city")
    public WebElement city;

    @FindBy(id = "vender_address")
    public WebElement vendorAdress;

    @FindBy(id = "zip_code_input")
    public WebElement zipCode;

    @FindBy(name = "category")
    public WebElement category;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registration;
}
