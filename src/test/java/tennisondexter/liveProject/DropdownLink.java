package tennisondexter.liveProject;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.IOException;
import java.time.Duration;

public class DropdownLink extends BasePage {

    public DropdownLink() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void radioButtonLink() throws IOException {
        HomePage home = new HomePage(driver);

        // Close cookie banner with wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieBanner = wait.until(ExpectedConditions.visibilityOf(home.getCookie()));
        cookieBanner.click();

        // Wait for the dropdown link to be present and visible
        WebElement dropdownLink = wait.until(ExpectedConditions.visibilityOf(home.getDropdownLink()));

        // Print out for debugging
        if (dropdownLink != null) {
            System.out.println("Dropdown link is found and will be clicked.");
        } else {
            System.out.println("Dropdown link is NOT found.");
        }

        // Click the dropdown link
        dropdownLink.click();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}
