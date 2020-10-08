package Omer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.GlobalMainPage;
import utilities.TestBase;

public class TestCase01 extends TestBase {

    GlobalMainPage globalMainPage = new GlobalMainPage(driver);

    @Test
    public void testCase()  {
        driver.get("https://www.glbtrader.com/");
        globalMainPage.seller_Join_now.click();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

    }

    @Test
    public void test() {
        driver.get("https://www.glbtrader.com/");
        driver.findElement(By.xpath("//div/div[@class='pull-right section_top_bar']/a[3]")).click();
        String actual = driver.getTitle();
        System.out.println(actual);
    }


}
