package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.PerformancePage;

public class PerformanceTest extends BaseTest {

    @Test
    public void performancePageTest() {

        new LoginPage(driver).login("Admin", "admin123");

        PerformancePage page = new PerformancePage(driver);
        Assert.assertTrue(page.navigateToPerformance());
    }
}