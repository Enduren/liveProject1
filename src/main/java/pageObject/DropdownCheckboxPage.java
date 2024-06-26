package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropdownCheckboxPage {

    public WebDriver driver;

    By radioButton1 = new By.ByCssSelector("#main > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(3) > label");
    By radioButton2 = new By.ByCssSelector("#main > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(4) > label");
    By radioButton3 = new By.ByCssSelector("#main > div > div:nth-child(5) > div:nth-child(1) > div:nth-child(5) > label");


    public DropdownCheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRadioButton1() {
        return driver.findElement(radioButton1);
    }

    public WebElement getRadioButton2() {
        return driver.findElement(radioButton2);
    }

    public WebElement getRadioButton3() {
        return driver.findElement(radioButton3);
    }




}
