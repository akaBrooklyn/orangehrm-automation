package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class RecruitmentPage {

    WebDriver driver;
    WebDriverWait wait;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By recruitmentTab = By.xpath("//span[text()='Recruitment']");
    By header = By.xpath("//h6[text()='Recruitment']");

    public boolean navigateToRecruitment() {
        wait.until(ExpectedConditions.elementToBeClickable(recruitmentTab)).click();
        return wait.until(ExpectedConditions.visibilityOfElementLocated(header)).isDisplayed();
    }
}