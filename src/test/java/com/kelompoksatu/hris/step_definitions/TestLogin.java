package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.drivers.pages.LoginPage;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case One
    @When ("TCC.Tele.001 Memasukkan URL")
    public void TCC_Tele_001_Memasukkan_URL(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Memasukkan URL");
    }

    @And ("TCC.Tele.001 Memasukkan username dan password invalid")
    public void TCC_Tele_001_Memasukkan_username_dan_password_invalid(){
        Hooks.delay(1);
        loginPage.login("agent1", "01");
        extentTest.log(LogStatus.PASS, "Memasukkan username dan password invalid");
    }

    @And ("TCC.Tele.001 Klik Sign In")
    public void TCC_Tele_001_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @And ("TCC.Tele.001 Klik Ok")
    public void TCC_Tele_001_Klik_Ok(){
        Hooks.delay(1);
        loginPage.clickBtnOkLogin();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }

    @Then("TCC.Tele.001 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif")
    public void TCC_Tele_001_Menampilkan_notifikasi_pop_up_Username_atau_password_tidak_ditemukan_atau_akun_anda_tidak_aktif(){
        Assert.assertEquals(loginPage.getTxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif");
    }

    //Test Case Two

    @When ("TCC.Tele.002 Memasukkan URL")
    public void TCC_Tele_002_Memasukkan_URL(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Memasukkan URL");
    }

    @And ("TCC.Tele.002 Memasukkan username valid dan password invalid")
    public void TCC_Tele_002_Memasukkan_username_valid_dan_password_invalid(){
        Hooks.delay(1);
        loginPage.login("agent01", "01");
        extentTest.log(LogStatus.PASS, "Memasukkan username valid dan password invalid");
    }

    @And ("TCC.Tele.002 Klik Sign In")
    public void TCC_Tele_002_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @And ("TCC.Tele.002 Klik Ok")
    public void TCC_Tele_002_Klik_Ok(){
        Hooks.delay(1);
        loginPage.clickBtnOkLogin();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }

    @Then("TCC.Tele.002 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif")
    public void TCC_Tele_002_Menampilkan_notifikasi_pop_up_Username_atau_password_tidak_ditemukan_atau_akun_anda_tidak_aktif(){
        Assert.assertEquals(loginPage.getTxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif");
    }

    //Test Case Three

    @When ("TCC.Tele.003 Memasukkan URL")
    public void TCC_Tele_003_Memasukkan_URL(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Memasukkan URL");
    }

    @And ("TCC.Tele.003 Memasukkan username invalid dan password valid")
    public void TCC_Tele_003_Memasukkan_username_valid_dan_password_invalid(){
        Hooks.delay(1);
        loginPage.login("agent1", "1");
        extentTest.log(LogStatus.PASS, "Memasukkan username valid dan password invalid");
    }

    @And ("TCC.Tele.003 Klik Sign In")
    public void TCC_Tele_003_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @And ("TCC.Tele.003 Klik Ok")
    public void TCC_Tele_003_Klik_Ok(){
        Hooks.delay(1);
        loginPage.clickBtnOkLogin();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }

    @Then("TCC.Tele.003 Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif")
    public void TCC_Tele_003_Menampilkan_notifikasi_pop_up_Username_atau_password_tidak_ditemukan_atau_akun_anda_tidak_aktif(){
        Assert.assertEquals(loginPage.getTxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "Menampilkan notifikasi pop up Username atau password tidak ditemukan atau akun anda tidak aktif");
    }

    //Test Case Four

    @When ("TCC.Tele.004 Memasukkan URL")
    public void TCC_Tele_004_Memasukkan_URL(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Memasukkan URL");
    }

    @And ("TCC.Tele.004 Klik Sign In")
    public void TCC_Tele_004_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @And ("TCC.Tele.004 Klik Ok")
    public void TCC_Tele_004_Klik_Ok(){
        Hooks.delay(1);
        loginPage.clickBtnOK();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }

    @And ("TCC.Tele.004 Klik profile")
    public void TCC_Tele_004_Klik_profile(){
        Hooks.delay(1);
        loginPage.clickBtnProfile();
        extentTest.log(LogStatus.PASS, "Klik profile");
    }

    @And ("TCC.Tele.004 Klik Ya")
    public void TCC_Tele_004_Klik_Ya(){
        Hooks.delay(1);
        loginPage.clickBtnYa();
        extentTest.log(LogStatus.PASS, "Klik Ya");
    }

    @Then("TCC.Tele.004 Muncul halaman login")
    public void TCC_Tele_004_Muncul_halaman_login(){
        extentTest.log(LogStatus.PASS, "Muncul halaman login");
    }

    //Test Case Five

    @When ("TCC.Tele.005 Memasukkan URL")
    public void TCC_Tele_005_Memasukkan_URL(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Memasukkan URL");
    }

    @And ("TCC.Tele.005 Memasukkan username dan password valid")
    public void TCC_Tele_005_Memasukkan_username_dan_password_valid(){
        Hooks.delay(1);
        loginPage.login("agent01", "1");
        extentTest.log(LogStatus.PASS, "Memasukkan username valid dan password invalid");
    }

    @And ("TCC.Tele.005 Klik Sign In")
    public void TCC_Tele_005_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @Then("TCC.Tele.005 Klik Ok")
    public void TCC_Tele_005_Klik_Ok(){
        Hooks.delay(2);
       loginPage.clickBtnOK();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }

    //Test Case Six

    @When ("TCC.Tele.006 Klik profile")
    public void TCC_Tele_006_Klik_profile(){
        loginPage.clickBtnProfile();
        extentTest.log(LogStatus.PASS, "Klik profile");
    }

    @And ("TCC.Tele.006 Klik Ya")
    public void TCC_Tele_006_Klik_Ya(){
        Hooks.delay(1);
        loginPage.clickBtnYa();
        extentTest.log(LogStatus.PASS, "Klik Ya");
    }


    @Then("TCC.Tele.006 Muncul halaman login")
    public void TCC_Tele_006_Muncul_halaman_login(){
        extentTest.log(LogStatus.PASS, "Muncul halaman login");
    }

    //Test Case Seven


    @When ("TCC.Tele.007 Memasukkan username huruf kapital dan password valid")
    public void TCC_Tele_007_Memasukkan_username_huruf_kapital_dan_password_valid(){
        Hooks.delay(1);
        loginPage.login("AGENT01", "1");
        extentTest.log(LogStatus.PASS, "Memasukkan username huruf kapital dan password valid");
    }

    @And ("TCC.Tele.007 Klik Sign In")
    public void TCC_Tele_007_Klik_Sign_In(){
        Hooks.delay(1);
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Klik Sign In");
    }

    @Then("TCC.Tele.007 Klik Ok")
    public void TCC_Tele_007_Klik_Ok(){
        Hooks.delay(1);
        loginPage.clickBtnOK();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }
}
