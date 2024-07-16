package tennisondexter.liveProject;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.PredictiveSearch;
import pageObject.aboutMeLink;

import java.io.IOException;

public class PredictiveSearchTest extends BasePage {
    public PredictiveSearchTest() throws IOException {
        super();
    }


    @BeforeTest
    public void setUp() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @Test
    public void predictiveSearchTest() throws IOException, InterruptedException {
        //Go to Homepage
        HomePage home = new HomePage(driver);
        //Close cookie banner
        home.getCookie().click();
        //Click AboutMe link
        home.getPredictiveLink().click();

        PredictiveSearch preSearch= new PredictiveSearch(driver);

        Assert.assertEquals(preSearch.getActualText().getText(),"Predictive Text Search");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
