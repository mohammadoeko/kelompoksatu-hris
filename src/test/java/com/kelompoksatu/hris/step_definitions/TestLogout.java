package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.LoginPage;
import com.kelompoksatu.hris.pages.LogoutPage;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogout {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    private LogoutPage logoutPage = new LogoutPage();

    private UploadData uploadData = new UploadData();

    public TestLogout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

// logout telemarketing
   /** @When("TCC.Tele.Logout.001 User click developer profil telemarketing")
    public void TCC_Tele_Logout_001_user_click_developer_profil_telemarketing() {
        driver.get(Constants.URL);
        loginPage.btnOkWelcome();
        logoutPage.ClickLogoutTele();
        extentTest.log(LogStatus.PASS,"developer");
    }

    @Then("TCC.Tele.Logout.001 user ke menu login  telemarketing")
    public void TCC_Tele_Logout_001_user_ke_menu_login_telemarketing() {
        Assert.assertEquals(loginPage.getTxtInformasiLogin(), "username password");
        extentTest.log(LogStatus.PASS, "Apa Yakin Keluar ?");
    }  */




    // logout developer
    @When("TCC.Tele.Logout.002 User click developer profil")
    public void TCC_Tele_Logout_002_user_click_developer_profil() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        loginPage.ClickBtnDeveloperProfil();
        extentTest.log(LogStatus.PASS,"developer");
    }

    @And("TCC.Tele.Logout.002 muncul dialog informasi logout")
    public void TCC_Tele_Logout_002_muncul_dialog_informasi_logout() {
        Assert.assertEquals(loginPage.getTxtInformasiLogout(), "Apa Yakin Keluar ?");
        extentTest.log(LogStatus.PASS, "Apa Yakin Keluar ?");
    }

    @And("TCC.Tele.Logout.002 User click ya logout")
    public void TCC_Tele_Logout_002_user_click_ya_logout() {
        loginPage.ClickbtnYaInformasiLogout();
        extentTest.log(LogStatus.PASS, "User click ya button logout");
    }


    @Then("TCC.Tele.Logout.002 user ke menu login")
    public void TCC_Tele_Logout_002_user_ke_menu_login() {
        Assert.assertEquals(loginPage.getTxtInformasiLogin(), "username password");
        extentTest.log(LogStatus.PASS, "Apa Yakin Keluar ?");
    }
}
