package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.Add;
import com.kelompoksatu.hris.pages.UserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAdd {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private Add add = new Add();

    private UserPage userPage = new UserPage();


    public TestAdd() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("TCC.USERMANAGEMENT.006 klik button Add")
    public void tcc_usermanagement_006_form() {
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"klik button Add");
    }
    @Then("TCC.USERMANAGEMENT.006 Menampilkan form add")
    public void tcc_usermanagement_006_menampilkan_form_add() {
        hooks.waiting(3);
        Assert.assertEquals(add.getTxtFormAddPage(),"Form Agent Editable");
        extentTest.log(LogStatus.PASS,"Menampilkan form add");
    }

    @When("TCC.USERMANAGEMENT.007 Save tanpa data")
    public void tcc_usermanagement_007_save_tanpa_data() {;
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Save tanpa data");
    }
    @And("TCC.USERMANAGEMENT.007 Konfirmasi save")
    public void tcc_usermanagement_007_konfirmasi_save() {
        add.ClickBtnYes();
        extentTest.log(LogStatus.PASS,"Konfirmasi save");
    }
    @Then("TCC.USERMANAGEMENT.007 Klik Ok")
    public void tcc_usermanagement_007_klik_save() {
        hooks.waiting(3);
        add.ClickBtnOkpopup();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Ok");
    }
    @When("TCC.USERMANAGEMENT.008 Klik Add")
    public void tcc_usermanagement_008_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.008 Memasukkan Full Name")
    public void tcc_usermanagement_008_memasukkan_full_name() {
        add.inputFullName("stelani");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.008 Memasukkan supervisor")
    public void tcc_usermanagement_008_supervisor() {
        add.selectSupervisor("DEVELOPER");
        extentTest.log(LogStatus.PASS,"Memasukkan supervisor");
    }
    @And("TCC.USERMANAGEMENT.008 Memasukkan Telephone")
    public void tcc_usermanagement_008_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.008 Memasukkan Username")
    public void tcc_usermanagement_008_memasukkan_username() {
        add.inputUserName("oiuyt");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.008 Memasukkan Password")
    public void tcc_usermanagement_008_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.008 Klik Save")
    public void tcc_usermanagement_008_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.008 Klik Yes")
    public void tcc_usermanagement_008_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
    @When("TCC.USERMANAGEMENT.009 Klik Add")
    public void tcc_usermanagement_009_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan Full Name")
    public void tcc_usermanagement_009_memasukkan_full_name() {
        add.inputFullName("stelani");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan Privileges agent")
    public void tcc_usermanagement_009_privileges() {
        add.selectPrivileges("Agent");
        extentTest.log(LogStatus.PASS,"Memasukkan Privileges agent");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan supervisor")
    public void tcc_usermanagement_009_supervisor() {
        add.selectSupervisor("DEVELOPER");
        extentTest.log(LogStatus.PASS,"Memasukkan supervisor");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan Telephone")
    public void tcc_usermanagement_009_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan Username")
    public void tcc_usermanagement_009_memasukkan_username() {
        add.inputUserName("tyuiok");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.009 Memasukkan Password")
    public void tcc_usermanagement_009_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.009 Klik Save")
    public void tcc_usermanagement_009_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.009 Klik Yes")
    public void tcc_usermanagement_009_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
    @When("TCC.USERMANAGEMENT.010 Klik Add")
    public void tcc_usermanagement_010_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan Full Name")
    public void tcc_usermanagement_010_memasukkan_full_name() {
        add.inputFullName("stelani");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan Privileges admin")
    public void tcc_usermanagement_010_privileges() {
        add.selectPrivileges("Admin");
        extentTest.log(LogStatus.PASS,"Memasukkan Privileges admin");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan supervisor")
    public void tcc_usermanagement_010_supervisor() {
        add.selectSupervisor("DEVELOPER");
        extentTest.log(LogStatus.PASS,"Memasukkan supervisor");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan Telephone")
    public void tcc_usermanagement_010_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan Username")
    public void tcc_usermanagement_010_memasukkan_username() {
        add.inputUserName("asdfgh");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.010 Memasukkan Password")
    public void tcc_usermanagement_010_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.010 Klik Save")
    public void tcc_usermanagement_010_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.010 Klik Yes")
    public void tcc_usermanagement_010_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
    @When("TCC.USERMANAGEMENT.011 Klik Add")
    public void tcc_usermanagement_01_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.011 Memasukkan Full Name")
    public void tcc_usermanagement_011_memasukkan_full_name() {
        add.inputFullName("stelani");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.011 Memasukkan Privileges agent")
    public void tcc_usermanagement_011_privileges() {
        add.selectPrivileges("Agent");
        extentTest.log(LogStatus.PASS,"Memasukkan Privileges agent");
    }
    @And("TCC.USERMANAGEMENT.011 Memasukkan Telephone")
    public void tcc_usermanagement_011_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.011 Memasukkan Username")
    public void tcc_usermanagement_011_memasukkan_username() {
        add.inputUserName("zxcvbnm");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.011 Memasukkan Password")
    public void tcc_usermanagement_011_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.011 Klik Save")
    public void tcc_usermanagement_011_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.011 Klik Yes")
    public void tcc_usermanagement_011_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
    @When("TCC.USERMANAGEMENT.012 Klik Add")
    public void tcc_usermanagement_012_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Full Name")
    public void tcc_usermanagement_012_memasukkan_full_name() {
        add.inputFullName("stelani");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Privileges agent")
    public void tcc_usermanagement_012_privileges() {
        add.selectPrivileges("Agent");
        extentTest.log(LogStatus.PASS,"Memasukkan Privileges agent");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Supervisor")
    public void tcc_usermanagement_012_supervisor() {
        add.selectSupervisor("DEVELOPER");
        extentTest.log(LogStatus.PASS,"Memasukkan Supervisor");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Telephone")
    public void tcc_usermanagement_012_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Username")
    public void tcc_usermanagement_012_memasukkan_username() {
        add.inputUserName("asdfghj");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.012 Memasukkan Password")
    public void tcc_usermanagement_012_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.012 Klik Save")
    public void tcc_usermanagement_012_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.012 Klik Yes")
    public void tcc_usermanagement_012_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
    @When("TCC.USERMANAGEMENT.013 Klik Add")
    public void tcc_usermanagement_013_klik_data() {
        hooks.waiting(3);
        add.ClickBtnAdd();
        extentTest.log(LogStatus.PASS,"Klik Add");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Full Name")
    public void tcc_usermanagement_013_memasukkan_full_name() {
        add.inputFullNameangka("12345");
        extentTest.log(LogStatus.PASS,"Memasukkan Full Name");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Privileges agent")
    public void tcc_usermanagement_013_privileges() {
        add.selectPrivileges("Agent");
        extentTest.log(LogStatus.PASS,"Memasukkan Privileges agent");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Supervisor")
    public void tcc_usermanagement_013_supervisor() {
        add.selectSupervisor("DEVELOPER");
        extentTest.log(LogStatus.PASS,"Memasukkan Supervisor");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Telephone")
    public void tcc_usermanagement_013_memasukkan_telephone() {
        add.inputTelephone("20160512");
        extentTest.log(LogStatus.PASS,"Memasukkan Telephone");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Username")
    public void tcc_usermanagement_013_memasukkan_username() {
        add.inputUserName("qwerty");
        extentTest.log(LogStatus.PASS,"Memasukkan Username");
    }
    @And("TCC.USERMANAGEMENT.013 Memasukkan Password")
    public void tcc_usermanagement_013_memasukkan_password() {
        add.inputPassword("22");
        extentTest.log(LogStatus.PASS,"Memasukkan Password");
    }
    @And("TCC.USERMANAGEMENT.013 Klik Save")
    public void tcc_usermanagement_013_klik_save() {
        add.ClickBtnSave();
        extentTest.log(LogStatus.PASS,"Klik Save");
    }
    @Then("TCC.USERMANAGEMENT.013 Klik Yes")
    public void tcc_usermanagement_013_klik_yes() {
        hooks.waiting(3);
        add.ClickBtnYes();
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Klik Yes");
    }
}
