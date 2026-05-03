package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class ReportsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ReportsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By adminTab = By.xpath("//span[text()='Admin']");
    By adminHeader = By.xpath("//h6[text()='Admin']");

    public boolean navigateToAdmin() {

        // Click Admin
        wait.until(ExpectedConditions.elementToBeClickable(adminTab)).click();

        // Verify Admin page loaded
        return wait.until(ExpectedConditions.visibilityOfElementLocated(adminHeader)).isDisplayed();
    }
}