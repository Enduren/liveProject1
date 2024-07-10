package tennisondexter.liveProject;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.aboutMeLink;

import java.io.IOException;

public class aboutMeTest extends BasePage {
    public aboutMeTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void accordionTest() throws IOException, InterruptedException {
        //Go to Homepage
        HomePage home = new HomePage(driver);
        //Close cookie banner
        home.getCookie().click();
        //Click AboutMe link
        home.getAboutMeLink().click();

        aboutMeLink aboutMe = new aboutMeLink(driver);
        WebElement actualText= aboutMe.getactualText();

        Assert.assertEquals(actualText.getText(),"Who we are");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

}
