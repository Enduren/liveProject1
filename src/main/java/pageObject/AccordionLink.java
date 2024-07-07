package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccordionLink {
    WebDriver driver;

    By platformPort = new By.ByCssSelector("#main > div > div > div > div:nth-child(1)");
    By languageSupport = new By.ByCssSelector("#main > div > div > div > div:nth-child(3)");

    By seleniumGrid = new By.ByCssSelector("#main > div > div > div > div:nth-child(5)");


    public AccordionLink(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPlatform() {
        return driver.findElement(platformPort);
    }

    public WebElement getLanguageSupport() {
        return driver.findElement(languageSupport);
    }

    public WebElement getSelenium() {
        return driver.findElement(seleniumGrid);
    }


}
