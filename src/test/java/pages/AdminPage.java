package pages;

import org.openqa.selenium.*;

public class AdminPage {

    WebDriver driver;

    By adminTab = By.xpath("//span[text()='Admin']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By username = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By saveBtn = By.xpath("//button[normalize-space()='Save']");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addUser(String user) {
        driver.findElement(adminTab).click();
        driver.findElement(addBtn).click();
        driver.findElement(username).sendKeys(user);
        driver.findElement(saveBtn).click();
    }
}