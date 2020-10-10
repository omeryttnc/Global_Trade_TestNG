package Omer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AgentSellerJoinPage {
    WebDriver driver;
    public AgentSellerJoinPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "vender_name")
    public WebElement Name;

    @FindBy(id = "email")
    public WebElement Email;

    @FindBy(id = "sub_domain")
    public WebElement Sub_Domain;

    @FindBy(id = "vender_mobile")
    public WebElement Mobile_Number;

    @FindBy(name = "country")
    public WebElement Country;



    @FindBy(id = "select_state")
    public WebElement State;

    @FindBy(id = "select_city")
    public WebElement City;

    @FindBy(name = "vender_address")
    public WebElement Address;

    @FindBy(id = "zip_code_input")
    public WebElement Enter_Postal_Code;

    @FindBy(name = "category")
    public WebElement Categories;

    @FindBy(id = "password")
    public WebElement Password;



    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registration;


}
