package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.LeavePage;

public class LeaveTest extends BaseTest {

    @Test
    public void applyLeaveNavigationTest() {

        // Login
        new LoginPage(driver).login("Admin", "admin123");

        // Navigate
        LeavePage leave = new LeavePage(driver);
        boolean result = leave.navigateToApplyLeave();

        // Validate
        Assert.assertTrue(result, "Apply Leave page not loaded");
    }
}