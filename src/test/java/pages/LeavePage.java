package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeavePage {

    WebDriver driver;
    WebDriverWait wait;

    public LeavePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By leaveTab = By.xpath("//span[text()='Leave']");
    By applyBtn = By.xpath("//a[text()='Apply']");
    By applyHeader = By.xpath("//h6[text()='Apply Leave']");

    public boolean navigateToApplyLeave() {

        // Click Leave
        wait.until(ExpectedConditions.elementToBeClickable(leaveTab)).click();

        // Click Apply
        wait.until(ExpectedConditions.elementToBeClickable(applyBtn)).click();

        // Verify page loaded
        return wait.until(ExpectedConditions.visibilityOfElementLocated(applyHeader)).isDisplayed();
    }
}