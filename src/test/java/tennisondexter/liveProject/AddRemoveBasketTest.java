package tennisondexter.liveProject;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObject.HomePage;
import pageObject.ShopContentPanel;
import pageObject.ShopHomePage;
import pageObject.ShopProductPage;

public class AddRemoveBasketTest extends BasePage{


    public AddRemoveBasketTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }
    
    
    
    @Test
    public void addRemoveItem() throws IOException, InterruptedException {
    	//Go to Homepage
        HomePage home = new HomePage(driver);
        //Close cookie banner
        home.getCookie().click();
        //click Test Store link
        home.getTestStoreLink().click();
        
        ShopHomePage shopHome = new ShopHomePage(driver);
        //Select product
        shopHome.getProdOne().click();
        
        // Add more steps as needed
        ShopProductPage shopProd = new ShopProductPage(driver);
        //Select size
        Select option = new Select(shopProd.getSizeOption());
        option.selectByVisibleText("M");
        
        //increase qty
        shopProd.getQuantIncrease().click();
        //Click add to cart
        shopProd.getAddToCartBtn().click();
        
        ShopContentPanel cPanel = new ShopContentPanel(driver);
        //click continue shopping
        Thread.sleep(3000);
        cPanel.getContinueShopBtn().click();
        Thread.sleep(3000);
      //click home page
        shopProd.getHomepageLink().click();
        Thread.sleep(3000);
        shopHome.getProdTwo().click();
        shopProd.getAddToCartBtn().click();
        cPanel.getCheckoutBtn().click();
        Thread.sleep(3000);
    	
    }
//    
//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
        
//    }

}
