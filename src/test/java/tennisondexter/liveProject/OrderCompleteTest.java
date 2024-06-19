package tennisondexter.liveProject;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pageObject.HomePage;
import pageObject.OrderFormDelivery;
import pageObject.OrderFormPayment;
import pageObject.OrderFormPersonInfo;
import pageObject.OrderFormShippingMethod;
import pageObject.ShopContentPanel;
import pageObject.ShopHomePage;
import pageObject.ShopProductPage;
import pageObject.ShoppingCart;

public class OrderCompleteTest extends BasePage {

    public OrderCompleteTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void endToEndTest() throws IOException {
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
      //Click cheackout
        cPanel.getCheckoutBtn().click();
        
        ShoppingCart cart = new ShoppingCart(driver);
        //clcik promo link
        cart.getHavePromo().click();
        //Type promo code
        cart.getPromoTextbox().sendKeys("20OFF");
        //click add promo button
        cart.getPromoAddBtn().click();
        //click checkout
        cart.getProceedCheckoutBtn().click();
        
        OrderFormPersonInfo pInfo = new OrderFormPersonInfo(driver);
        //Click Male
        pInfo.getGenderMr().click();
        //Type First Name
        pInfo.getFirstNameField().sendKeys("John");
        //Type Last Name
        pInfo.getLastnameField().sendKeys("Smith");
        //Type Email
        pInfo.getEmailField().sendKeys("SeleniumTest@example.com");
        //Click Terms and Condition
        pInfo.getTermsConditionsCheckbox().click();
        //Click Continue
        pInfo.getContinueBtn().click();
        
        //Order form Delivery
        OrderFormDelivery orderDelivery = new OrderFormDelivery(driver);
        //type address 
        orderDelivery.getAddressField().sendKeys("123 main St");
        //type city
        orderDelivery.getCityField().sendKeys("Houston");
        //Select State
        Select state = new Select(orderDelivery.getStateDropdown());
        state.selectByVisibleText("Texas");
        //Type zip code
        orderDelivery.getPostcodeField().sendKeys("77021");
        //Click continue button
        orderDelivery.getContinueBtn().click();
        
        OrderFormShippingMethod shipMethod = new OrderFormShippingMethod(driver);
        //add message for delivery
        shipMethod.getDeliveryMsgTextbox().sendKeys("If Im not here leave it at the frontdoor");
        //click continue
        shipMethod.getContinueBtn().click();
        
        OrderFormPayment orderPay = new OrderFormPayment(driver);
        //Click pay by check
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();
         
        
        
        
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
