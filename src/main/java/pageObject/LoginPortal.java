package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPortal {
    WebDriver driver;

    By userName = new By.ByCssSelector("#login_text");
    By password = new By.ByCssSelector("#login_password");
    By loginButton = new By.ByCssSelector("#login_btn");

    public LoginPortal(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername() {
        return driver.findElement(userName);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }


    
}
