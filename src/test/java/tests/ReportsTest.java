package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.ReportsPage;

public class ReportsTest extends BaseTest {

    @Test
    public void reportsPageTest() {

        // Login
        new LoginPage(driver).login("Admin", "admin123");

        // Navigate
        ReportsPage page = new ReportsPage(driver);
        boolean result = page.navigateToAdmin();

        // Validate
        Assert.assertTrue(result, "Admin page not loaded");
    }
}