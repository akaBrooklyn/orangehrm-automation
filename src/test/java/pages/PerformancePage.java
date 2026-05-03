package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class PerformancePage {

    WebDriver driver;
    WebDriverWait wait;

    public PerformancePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By performanceTab = By.xpath("//span[text()='Performance']");
    By header = By.xpath("//h6[text()='Performance']");

    public boolean navigateToPerformance() {
        wait.until(ExpectedConditions.elementToBeClickable(performanceTab)).click();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).isDisplayed();
    }
}