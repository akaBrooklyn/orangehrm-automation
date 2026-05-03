package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();

        // ✅ Wait for elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // ✅ Maximize window
        driver.manage().window().maximize();

        // ✅ Open application
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}