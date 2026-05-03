package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.AdminPage;

public class AdminTest extends BaseTest {

    @Test
    public void addUserTest() {

        new LoginPage(driver).login("Admin", "admin123");

        AdminPage admin = new AdminPage(driver);
        admin.addUser("TestUser123");
    }
}