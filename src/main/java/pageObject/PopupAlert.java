package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupAlert {
    public WebDriver driver;

    By triggerPopup = new By.ByCssSelector("#main > div > div:nth-child(5) > div > button");
    By triggerAlert = new By.ByCssSelector("#main > div > div:nth-child(8) > div > button");


    //constructors
    public PopupAlert(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTrigger() {
        return driver.findElement(triggerPopup);
    }

    public WebElement getAlert() {
        return driver.findElement(triggerAlert);
    }
}
