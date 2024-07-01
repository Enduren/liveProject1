package tennisondexter.liveProject;

import base.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPortal;

import java.io.IOException;
import java.time.Duration;

public class LoginPortalTest extends BasePage {

    public LoginPortalTest() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void LoginTest() throws IOException {

        //Go to Homepage
        HomePage home = new HomePage(driver);

        //Close cookie banner
        home.getCookie().click();

        //click Test Store link
        home.getLoginPortalLink().click();

        LoginPortal login = new LoginPortal(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOf(login.getUsername())).sendKeys("dtennison");

        wait.until(ExpectedConditions.visibilityOf(login.getPassword())).sendKeys("password123");

        wait.until(ExpectedConditions.elementToBeClickable(login.getLoginButton())).click();

    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
