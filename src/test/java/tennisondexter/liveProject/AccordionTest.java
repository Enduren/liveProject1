package tennisondexter.liveProject;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.AccordionLink;
import pageObject.HomePage;

import java.io.IOException;

public class AccordionTest extends BasePage {
    public AccordionTest() throws IOException {
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
        //Click Accordion link
        home.getAccordionLink().click();
        AccordionLink accordion = new AccordionLink(driver);
        accordion.getPlatform().click();




    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
