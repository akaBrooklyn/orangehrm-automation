package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.PIMPage;

public class PIMTest extends BaseTest {

    @Test
    public void addEmployeeTest() {

        // Login first
        new LoginPage(driver).login("Admin", "admin123");

        // Add employee
        PIMPage pim = new PIMPage(driver);
        pim.addEmployee("Manu", "QA");
    }
}