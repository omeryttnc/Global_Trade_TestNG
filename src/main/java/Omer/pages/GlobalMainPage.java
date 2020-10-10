package Omer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class GlobalMainPage {
    WebDriver driver;

    public GlobalMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Seller Join Now")
    public WebElement sellerJoinNow;

    @FindBy(id = "vender_type")
    public WebElement clickOnAgentSeller;
    public void setSellerJoinNow() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        sellerJoinNow.click();
        Thread.sleep(1000);
        clickOnAgentSeller.click();
    }

}
