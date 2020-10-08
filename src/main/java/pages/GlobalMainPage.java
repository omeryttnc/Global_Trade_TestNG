package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalMainPage {
    WebDriver driver;

    public GlobalMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div/div[@class='pull-right section_top_bar']/a[3]")
    public WebElement seller_Join_now;

}
