package pages;

import org.openqa.selenium.*;

public class DashboardPage {

    WebDriver driver;

    By dashboard = By.xpath("//h6[text()='Dashboard']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(dashboard).isDisplayed();
    }
}