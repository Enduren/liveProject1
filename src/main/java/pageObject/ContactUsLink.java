package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsLink {

    public WebDriver driver;

    By firstNameField = By.xpath("//input[@placeholder='First Name']");

    By lastNameField = By.xpath("//input[@placeholder='Last Name']");

    By email = By.xpath("//input[@placeholder='Email Address']");

    By comments = By.xpath("//textarea[@placeholder='Comments']");

    By submitButton = By.xpath("//input[@value='SUBMIT']");


    public ContactUsLink(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstName() {
        return driver.findElement(firstNameField);
    }

    public WebElement getLastName() {
        return driver.findElement(lastNameField);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getComments() {
        return driver.findElement(comments);
    }

    public WebElement getsubmitButton() {
        return driver.findElement(submitButton);
    }
}
