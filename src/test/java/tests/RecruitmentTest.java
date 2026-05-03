package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.RecruitmentPage;

public class RecruitmentTest extends BaseTest {

    @Test
    public void recruitmentPageTest() {

        new LoginPage(driver).login("Admin", "admin123");

        RecruitmentPage page = new RecruitmentPage(driver);
        Assert.assertTrue(page.navigateToRecruitment());
    }
}