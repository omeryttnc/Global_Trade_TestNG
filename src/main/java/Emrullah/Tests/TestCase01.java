package Emrullah.Tests;

import Emrullah.Pages.VendorRegisterPage;
import Emrullah.Tests.Utilities.ConfigReaderE;
import org.testng.annotations.Test;
import utilities.TestBase;

public class TestCase01 extends TestBase {

    @Test
   public void Test01() throws InterruptedException {
    driver.get("https://www.glbtrader.com/");

        VendorRegisterPage vrp = new VendorRegisterPage(driver);

        vrp.sellerJoinNow.click();
        Thread.sleep(5000);
        vrp.companyName.sendKeys(ConfigReaderE.getProperty("company_name"));



//        Select options = new Select(vrp.countryDropDown);
//        options.selectByIndex(2);
//
//        options.selectByIndex(3);
   }
}
