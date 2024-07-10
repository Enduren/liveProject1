package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aboutMeLink {
    WebDriver driver;

    By actualText= new By.ByCssSelector("#main > div > div > h2");



    public aboutMeLink(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getactualText() {
        return driver.findElement(actualText);
    }
}
