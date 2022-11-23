package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.ResetPassword;
import com.kelompoksatu.hris.pages.UserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestResetPass {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private ResetPassword resetPassword = new ResetPassword();

    private UserPage userPage = new UserPage();


    public TestResetPass() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.USERMANAGEMENT.015 Menekan button Reset Password")
    public void tcc_usermanagement_015_Reset_pass() {
        resetPassword.ClickBtnResetPass();
        extentTest.log(LogStatus.PASS, "Menekan button Reset Password");
    }

    @And("TCC.USERMANAGEMENT.015 Konfirmasi Reset Password")
    public void tcc_usermanagement_015_konfirmasi_reset() {
        resetPassword.ClickSave();
        extentTest.log(LogStatus.PASS, "Konfirmasi Reset Password");
    }

    @Then("TCC.USERMANAGEMENT.015 Menampilkan halaman User")
    public void tcc_usermanagement_015_menampilkan_halaman() {
        hooks.waiting(3);
        resetPassword.ClickDone();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS, "Menampilkan seluruh data user");
    }

    @When("TCC.USERMANAGEMENT.016 Memilih data yang akan direset")
    public void tcc_usermanagement_016_memilih_data() {
        resetPassword.ClickInputdata();
        extentTest.log(LogStatus.PASS, "Mencari data tanpa mengisi kolom");
    }

    @And("TCC.USERMANAGEMENT.016 Konfirmasi Reset Password")
    public void tcc_usermanagement_016_konfirmasi_reset() {
        resetPassword.ClickBtnResetPass();
        extentTest.log(LogStatus.PASS, "Konfirmasi Reset Password");
    }

    @And("TCC.USERMANAGEMENT.016 Konfirmasi data sudah direset")
    public void tcc_usermanagement_016_data_sudah_direset() {
        resetPassword.ClickSave();
        extentTest.log(LogStatus.PASS, "Konfirmasi data sudah direset");
    }

    @Then("TCC.USERMANAGEMENT.016 Menampilkan halaman user")
    public void tcc_usermanagement_016_menampilkan_halaman_user() {
        hooks.waiting(3);
        resetPassword.ClickDone();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS, "Menampilkan halaman user");
    }
}
