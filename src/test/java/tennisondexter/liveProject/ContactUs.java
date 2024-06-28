package tennisondexter.liveProject;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.ContactUsLink;
import pageObject.HomePage;

import java.io.IOException;
import java.time.Duration;

public class ContactUs extends BasePage {
    public ContactUs() throws IOException {
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }


    @Test
    public void ContactTest() throws IOException {

        HomePage home = new HomePage(driver);

        // Close cookie banner with wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieBanner = wait.until(ExpectedConditions.visibilityOf(home.getCookie()));
        cookieBanner.click();

        WebElement ContactLink = wait.until(ExpectedConditions.visibilityOf(home.getContactUsLink()));

        ContactLink.click();

        ContactUsLink contact = new ContactUsLink(driver);

        contact.getFirstName().sendKeys("Selenium");
        contact.getLastName().sendKeys("Testing");
        contact.getEmail().sendKeys("selTest@example.com");
        contact.getComments().sendKeys("This is a selenium test");
        contact.getsubmitButton().click();




    }


    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }




}
