package Omer.runner;

import Omer.pages.GlobalMainPage;
import org.testng.annotations.Test;
import utilities.Driver;

public class Seller_Join_Negative {

    @Test
    public void SellerJoinNegative() throws InterruptedException {
    GlobalMainPage globalMainPage = new GlobalMainPage(Driver.getDriver());
        globalMainPage.setSellerJoinNow();


    }
}
