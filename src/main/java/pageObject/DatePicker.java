package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

    WebDriver driver;

    By basicDateTime = new By.ByCssSelector("#basicDate");

    By weekNumber = new By.ByCssSelector("#main > div > div:nth-child(7) > div:nth-child(1) > div > input");

    By resetDateButton = new By.ByCssSelector("#main > div > div:nth-child(7) > div:nth-child(1) > div > input");

    By rangeDatetime = new By.ByCssSelector("#rangeDate");

    By timePicker = new By.ByCssSelector("#timePicker");

    public DatePicker(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getbasicDateTime() {
        return driver.findElement(basicDateTime);
    }

    public WebElement getweekNumber() {
        return driver.findElement(weekNumber);
    }

    public WebElement ResetDateButton() {
        return driver.findElement(resetDateButton);
    }

    public WebElement getrangeDatetime() {
        return driver.findElement(rangeDatetime);
    }

    public WebElement gettimePicker() {
        return driver.findElement(timePicker);
    }

}
