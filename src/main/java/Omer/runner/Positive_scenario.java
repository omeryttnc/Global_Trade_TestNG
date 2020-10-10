package Omer.runner;

import Omer.pages.AgentSellerJoinPage;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Positive_scenario {
    @Test
    public void Positive_Scenario() throws InterruptedException {
        Seller_Join_Negative.Go_to_agent_seller();
        AgentSellerJoinPage page = new AgentSellerJoinPage(Driver.getDriver());
        page.Name.sendKeys(ConfigReader.getProperty("Name"));
        page.Email.sendKeys(ConfigReader.getProperty("Email"));
        page.Sub_Domain.sendKeys(ConfigReader.getProperty("Sub_Domain"));
        page.Mobile_Number.sendKeys(ConfigReader.getProperty("Mobile_Number"));
        //String selectCountry = ConfigReader.getProperty("Country");
      //  Select selectCountry = new Select();
       // page.Country.sendKeys(ConfigReader.getProperty("Country"));
        page.State.sendKeys(ConfigReader.getProperty("State"));
        page.City.sendKeys(ConfigReader.getProperty("City"));
        page.Address.sendKeys(ConfigReader.getProperty("Address"));
        page.Enter_Postal_Code.sendKeys(ConfigReader.getProperty("Enter_Postal_Code"));
       // page.Categories.sendKeys(ConfigReader.getProperty("Categories"));
        page.Password.sendKeys(ConfigReader.getProperty("Password"));
        page.registration.click();


    }
}