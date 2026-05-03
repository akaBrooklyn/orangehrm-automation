package pages;

import org.openqa.selenium.*;

public class PIMPage {

    WebDriver driver;

    By pimTab = By.xpath("//span[text()='PIM']");
    By addBtn = By.xpath("//button[normalize-space()='Add']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPIM() {
        driver.findElement(pimTab).click();
    }

    public void clickAddEmployee() {
        driver.findElement(addBtn).click();
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void clickSave() {
        driver.findElement(saveBtn).click();
    }

    // 🔥 Full flow method
    public void addEmployee(String fname, String lname) {
        clickPIM();
        clickAddEmployee();
        enterFirstName(fname);
        enterLastName(lname);
        clickSave();
    }
}