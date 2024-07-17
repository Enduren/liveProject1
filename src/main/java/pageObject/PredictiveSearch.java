package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PredictiveSearch {

    WebDriver driver;


    By actualText = new By.ByCssSelector("#content");
    By searchBar = new By.ByCssSelector("#myInput");
    By searchBarList= new By.ByCssSelector("#myInputautocomplete-list");

    public PredictiveSearch(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getActualText() {
        return driver.findElement(actualText);
    }

    public WebElement getSearchBar() {
        return driver.findElement(searchBar);
    }

    public WebElement getSearchBarList() {
        return driver.findElement(searchBarList);
    }
}
