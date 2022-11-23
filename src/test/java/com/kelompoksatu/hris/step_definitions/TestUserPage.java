package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.UserPage;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUserPage {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private UserPage userPage = new UserPage();


    public TestUserPage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC.USERMANAGEMENT.001 Menuju menu User
    @When("TCC.USERMANAGEMENT.001 Menuju menu User")
    public void tcc_usermanagement_001_menuju_menu_user() {
        driver.get(Constants.URL);
        userPage.formLogin("developer","23");
        userPage.btnOkWelcome();
        userPage.ClickBtnUserManagement();
        extentTest.log(LogStatus.PASS,"Menuju menu User");
    }
    @Then("TCC.USERMANAGEMENT.001 Menampilkan Menu User Management")
    public void tcc_usermanagement_001_menampilkan_menu() {
        extentTest.log(LogStatus.PASS,"Menampilkan Menu User Management");
    }

    @When("TCC.USERMANAGEMENT.002 Menuju halaman User")
    public void tcc_usermanagement_002_menuju_halaman_user() {
        userPage.ClickBtnUser();
        extentTest.log(LogStatus.PASS,"Menuju halaman User");
    }
    @Then("TCC.USERMANAGEMENT.002 Menampilkan halaman User")
    public void tcc_usermanagement_002_menampilkan_user_management() {
        hooks.waiting(3);
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman User");
    }
}
