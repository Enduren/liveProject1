package tennisondexter.liveProject;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.PopupAlert;

import java.io.IOException;

public class PopupAlertTest extends BasePage {
    public PopupAlertTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }


    @Test
    public void popupAlert() throws IOException {
        //Go to Homepage
        HomePage home = new HomePage(driver);
        //Close cookie banner
        home.getCookie().click();
        //click Popup Alert link
        home.getPopupLink().click();

        //click trigger button
        PopupAlert popAlert= new PopupAlert(driver);

        popAlert.getTrigger().click();

        popAlert.getAlert().click();


    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
