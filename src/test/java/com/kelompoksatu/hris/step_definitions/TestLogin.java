package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.LoginPage;
import com.kelompoksatu.hris.pages.LogoutPage;
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
    private Hooks hooks = new Hooks();
    private LoginPage loginPage = new LoginPage();

    private LogoutPage logoutPage = new LogoutPage();



    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("TCC.Tele.Login.001 User go to Web Tele")
    public void TCC_Tele_Login_001_user_go_to_Web_Tele() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web HRM");

    }

    @And("TCC.Tele.Login.001 User enter username password invalid")
    public void TCC_Tele_Login_001_user_enter_username_password_invalid() {
        loginPage.login("Admin", "admin1234");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.001 User click button login")
    public void TCC_Tele_Login_001_user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.001 User pop invalid credentials")
    public void TCC_Tele_Login_001_user_invalid_credentials() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

  //@Then("TCC.Tele.Login.001 User click button ok invalid credentials")
    //public void TCC_Tele_Login_001_user_click_button_ok_invalid_credentials() {
      //  loginPage.clickOk_invalidCredentials();
        //extentTest.log(LogStatus.PASS, "User click button login");
    //}

    // Test Case Two



    // Test Case tiga

   //@When("TCC.Tele.Login.003 User go to Web Tele username password kosong")
    //public void TCC_Tele_Login_003_user_go_to_Web_Tele_username_password_kosong() {
      //  driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to Web HRM");

    //}





   // @Then("TCC.Tele.Login.003 User click button ok invalid credentials username password kosong")
   // public void TCC_Tele_Login_003_user_click_button_ok_invalid_credentials_username_password_kosong() {
     //   loginPage.clickOk_invalidCredentials();
       // extentTest.log(LogStatus.PASS, "User click button login");
    //}


    // test case 4

    //@When("TCC.Tele.Login.003 User go to Web Tele username kosong")
    //public void TCC_Tele_Login_003_user_go_to_Web_Tele_username_kosong() {
       // driver.get(Constants.URL);
        //extentTest.log(LogStatus.PASS, "User go to Web HRM");

    //}

    @When("TCC.Tele.Login.002 User enter username kosong")
    public void TCC_Tele_Login_002_user_enter_username_kosong() {
        driver.get(Constants.URL);
        loginPage.login("", "23");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.002 User click button login username kosong")
    public void TCC_Tele_Login_002_user_click_button_login_username_kosong() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.002 User invalid credentials username kosong")
    public void TCC_Tele_Login_002_user_invalid_credentials_username_kosong() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

    //@Then("TCC.Tele.Login.004 User click button ok invalid credentials username kosong")
    //public void TCC_Tele_Login_004_user_click_button_ok_invalid_credentials_username_kosong() {
      //  loginPage.clickOk_invalidCredentials();
       // extentTest.log(LogStatus.PASS, "User click button login");
    //}

    //test case 5
    @When("TCC.Tele.Login.003 User enter password kosong")
    public void TCC_Tele_Login_003_user_enter_password_kosong() {
        driver.get(Constants.URL);
        loginPage.login("developer", "");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.003 User click button login password kosong")
    public void TCC_Tele_Login_003_user_click_button_login_password_kosong() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.003 User invalid credentials password kosong")
    public void TCC_Tele_Login_003_user_invalid_credentials_password_kosong() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

    //@Then("TCC.Tele.Login.005 User click button ok invalid credentials password kosong")
    //public void TCC_Tele_Login_005_user_click_button_ok_invalid_credentials_password_kosong() {
      //  loginPage.clickOk_invalidCredentials();
        //extentTest.log(LogStatus.PASS, "User click button login");
   // }

    //test case 6

    @When("TCC.Tele.Login.004 User enter username invalid")
    public void TCC_Tele_Login_004_user_enter_username_invalid() {
        driver.get(Constants.URL);
        loginPage.login("adads", "23");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.004 User click button login username invalid")
    public void TCC_Tele_Login_004_user_click_button_login_username_invalid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.004 User invalid credentials username invalid")
    public void TCC_Tele_Login_004_user_invalid_credentials_username_invalid() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

   // @Then("TCC.Tele.Login.005 User click button ok invalid credentials username invalid")
  //  public void TCC_Tele_Login_005_user_click_button_ok_invalid_credentials_username_invalid() {
      //  loginPage.clickOk_invalidCredentials();
       // extentTest.log(LogStatus.PASS, "User click button login");
  //  }

    //test case 7

    @When("TCC.Tele.Login.005 User enter password invalid")
    public void TCC_Tele_Login_005_user_enter_password_invalid() {
        driver.get(Constants.URL);
        loginPage.login("developer", "23da");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.005 User click button login password invalid")
    public void TCC_Tele_Login_005_user_click_button_login_password_invalid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.005 User invalid credentials password invalid")
    public void TCC_Tele_Login_005_user_invalid_credentials_password_invalid() {
        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS, "User invalid credentials");
    }

  //  @Then("TCC.Tele.Login.006 User click button ok invalid credentials password invalid")
    ///public void TCC_Tele_Login_006_user_click_button_ok_invalid_credentials_password_invalid() {
       // loginPage.clickOk_invalidCredentials();
      //  extentTest.log(LogStatus.PASS, "User click button login");
   // }


    @When("TCC.Tele.Login.006 User enter username password kosong")
    public void TCC_Tele_Login_006_user_enter_username_password_kosong() {
        driver.get(Constants.URL);
        loginPage.login("", "");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.Tele.Login.006 User click button login username password kosong")
    public void TCC_Tele_Login_006_user_click_button_login_username_password_kosong() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }







    /** @Then("TCC.Tele.Login.002 User invalid credentials username password kosong")
    public void TCC_Tele_Login_002_user_username_password_kosong() {
    Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
    extentTest.log(LogStatus.PASS, "User invalid credentials");
    } **/

    @And("TCC.Tele.Login.006 User valid credentials")
    public void TCC_Tele_Login_006_user_valid_credentials() {
        Assert.assertEquals(loginPage.getTxtWelcomeToTelekita(), "Welcome to Tele Kita");
//        Assert.assertTrue(loginPage.getTxtEmployeeInformation().contains("Employee"));
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }

    @And("TCC.Tele.Login.006 user click btnok welcome")
    public void TCC_Tele_Login_006_user_click_btnok_welcome() {
        loginPage.btnOkWelcome();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("TCC.Tele.Login.006 User valid credentials 2")
    public void TCC_Tele_Login_006_user_valid_credentials_2() {
        Assert.assertEquals(loginPage.getTxtTeleMarketing(), "Tele Marketing");
//        Assert.assertTrue(loginPage.getTxtEmployeeInformation().contains("Employee"));
        extentTest.log(LogStatus.PASS, "User valid credentials");
        hooks.waiting(2);
    }



    // valid login
    @When("TCC.Tele.Login.007 User go to Web Tele")
    public void TCC_Tele_Login_007_user_go_to_Web_Tele() {
        hooks.waiting(2);
        driver.get(Constants.URL);
        hooks.waiting(2);
        loginPage.btnOkWelcome();
       // hooks.waiting(2);
        logoutPage.ClickLogoutTele();
        extentTest.log(LogStatus.PASS, "User go to Web tele");

    }

    @And("TCC.Tele.Login.007 User enter username password valid")
    public void TCC_Tele_Login_007_user_enter_username_password_valid() {
        loginPage.login("developer", "23");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("TCC.Tele.Login.007 User click button login valid")
    public void TCC_Tele_Login_007_user_click_button_login_valid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("TCC.Tele.Login.007 User valid credentials")
    public void TCC_Tele_Login_007_user_valid_credentials() {
        Assert.assertEquals(loginPage.getTxtWelcomeToTelekita(), "Welcome to Tele Kita");
//        Assert.assertTrue(loginPage.getTxtEmployeeInformation().contains("Employee"));
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }


    /**  @When("TCC.Tele.Login.008 User click developer profil")
      public void TCC_Tele_Login_008_user_click_developer_profil() {
          driver.get(Constants.URL);
          loginPage.btnOkWelcome();
          loginPage.ClickBtnDeveloperProfil();
          extentTest.log(LogStatus.PASS,"developer");
      }

      @And("TCC.Tele.Login.008 muncul dialog informasi logout")
      public void TCC_Tele_Login_008_muncul_dialog_informasi_logout() {
          Assert.assertEquals(loginPage.getTxtInformasiLogout(), "Apa Yakin Keluar ?");
          extentTest.log(LogStatus.PASS, "Apa Yakin Keluar ?");
      }

      @And("TCC.Tele.Login.008 User click ya logout")
      public void TCC_Tele_Login_008_user_click_ya_logout() {
          loginPage.ClickbtnYaInformasiLogout();
          extentTest.log(LogStatus.PASS, "User click ya button logout");
      }


      @Then("TCC.Tele.Login.008 user ke menu login")
      public void TCC_Tele_Login_008_user_ke_menu_login() {
          Assert.assertEquals(loginPage.getTxtInformasiLogin(), "username password");
          extentTest.log(LogStatus.PASS, "Apa Yakin Keluar ?");
      }

  */
}