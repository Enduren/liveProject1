package tennisondexter.liveProject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.ContactUsLink;
import pageObject.DatePicker;
import pageObject.HomePage;

import java.io.IOException;
import java.time.Duration;

public class DateInputTest extends BasePage {
    public DateInputTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }


    @Test
    public void DateInputTest1() throws IOException, InterruptedException {

        HomePage home = new HomePage(driver);

        // Close cookie banner with wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieBanner = wait.until(ExpectedConditions.visibilityOf(home.getCookie()));
        cookieBanner.click();

        WebElement DatePickLink = wait.until(ExpectedConditions.visibilityOf(home.getDatePickerLink()));

        DatePickLink.click();


        DatePicker dateInput = new DatePicker(driver);

        dateInput.getbasicDateTime().sendKeys("June, 28 2024 12:00");

        Thread.sleep(3000);





    }


//    @AfterTest
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
}
