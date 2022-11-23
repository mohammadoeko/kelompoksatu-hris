package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.PhoneApprove;
import com.kelompoksatu.hris.pages.ReportActivity;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPhoneApprove {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private UploadData uploadData = new UploadData();

    private PhoneApprove phoneApprove = new PhoneApprove();

    public TestPhoneApprove() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // PHONE APPROVE 001
    @When("TCC.Tele.001.PhoneApprove klik user management")
    public void tcc_tele_001_phone_approve_klik_user_management() {
        driver.get(Constants.URL);
        uploadData.formLogin("developer","23");
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        extentTest.log(LogStatus.PASS, "klik user management");
    }

    @Then("TCC.Tele.001.PhoneApprove menampilkan menu user management")
    public void tcc_tele_001_phone_approve_menampilkan_menu_user_management() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtPhoneApprove(),"Phone Approve");
        extentTest.log(LogStatus.PASS,"Menampilkan menu user management");
    }

    // PHONE APPROVE 002
    @When("TCC.Tele.002.PhoneApprove klik user management")
    public void tcc_tele_002_phone_approve_klik_user_management() {
        phoneApprove.clickUserManagement();
        extentTest.log(LogStatus.PASS, "klik user management");
    }

    @And("TCC.Tele.002.PhoneApprove klik phone approve")
    public void tcc_tele_002_phone_approve_klik_phone_approve() {
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik phone approve");
    }

    @Then("TCC.Tele.002.PhoneApprove menampilkan phone approve page")
    public void tcc_tele_002_phone_approve_menampilkan_phone_approve_page() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtAdditionalPhone(),"ADDITIONAL PHONE");
        extentTest.log(LogStatus.PASS,"Menampilkan phone approve page");
    }

    // PHONE APPROVE 003
    @When("TCC.Tele.003.PhoneApprove klik search")
    public void tcc_tele_003_phone_approve_klik_search() {
        phoneApprove.btnSearch();
        extentTest.log(LogStatus.PASS, "klik search");
    }

    @Then("TCC.Tele.003.PhoneApprove menampilkan seluruh data nomor user")
    public void tcc_tele_003_phone_approve_menampilkan_seluruh_data_nomor_user() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtnamaAgent(),"agent01");
        extentTest.log(LogStatus.PASS,"Menampilkan seluruh data nomor user");
    }

    // PHONE APPROVE 004
    @When("TCC.Tele.004.PhoneApprove input search agent")
    public void tcc_tele_004_phone_approve_input_search_agent() {
        phoneApprove.inputSearchAgent("agent01");
        extentTest.log(LogStatus.PASS,"input ");
    }

    @And("TCC.Tele.004.PhoneApprove klik search")
    public void tcc_tele_004_phone_approve_klik_search() {
        phoneApprove.btnSearch();
        extentTest.log(LogStatus.PASS, "klik search");
    }

    @Then("TCC.Tele.004.PhoneApprove menampilkan data sesuai yang diminta")
    public void tcc_tele_004_phone_approve_menampilkan_data_sesuai_yang_diminta() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtnamaAgent(),"agent01");
        extentTest.log(LogStatus.PASS,"Menampilkan seluruh data nomor user");
    }

    // PHONE APPROVE 005
    @When("TCC.Tele.005.PhoneApprove input search agent")
    public void tcc_tele_005_phone_approve_input_search_agent() {
        hooks.waiting(2);
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.inputSearchAgent("tesajaya");
        extentTest.log(LogStatus.PASS,"input search agent");
    }

    @And("TCC.Tele.005.PhoneApprove klik search")
    public void tcc_tele_005_phone_approve_klik_search() {
        phoneApprove.btnSearch();
        extentTest.log(LogStatus.PASS, "klik search");
    }

    @Then("TCC.Tele.005.PhoneApprove tidak ditampilkan data apapun")
    public void tcc_tele_005_phone_approve_tidak_ditampilkan_data_apapun() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtNoEntries()," no entries");
        extentTest.log(LogStatus.PASS,"Menampilkan data sesuai yang diminta");
    }

    // PHONE APPROVE 006
    @When("TCC.Tele.006.PhoneApprove klik centang nomor yang akan di approve")
    public void tcc_tele_006_phone_approve_klik_centang_nomor_yang_akan_di_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.checkboxAgent();
        extentTest.log(LogStatus.PASS,"klik centang nomor yang akan di approve");
    }

    @And("TCC.Tele.006.PhoneApprove klik approve")
    public void tcc_tele_006_phone_approve_approve() {
        phoneApprove.btnApprove();
        extentTest.log(LogStatus.PASS, "klik approve");
    }

    @Then("TCC.Tele.006.PhoneApprove menampilkan approval nomor ya\\/tidak")
    public void tcc_tele_006_phone_approve_menampilkan_approval_nomor_ya_tidak() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtInformasi(),"Apakah Anda Ingin Menyetujui Nomor ini ?");
        extentTest.log(LogStatus.PASS,"Menampilkan data sesuai yang diminta");
    }

    // PHONE APPROVE 007
    @When("TCC.Tele.007.PhoneApprove klik centang nomor yang akan di approve")
    public void tcc_tele_007_phone_approve_klik_centang_nomor_yang_akan_di_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.checkboxAgent();
        extentTest.log(LogStatus.PASS,"klik centang nomor yang akan di approve");
    }

    @And("TCC.Tele.007.PhoneApprove klik approve")
    public void tcc_tele_007_phone_approve_approve() {
        hooks.waiting(2);
        phoneApprove.btnApprove();
        extentTest.log(LogStatus.PASS, "klik approve");
    }

    @And("TCC.Tele.007.PhoneApprove klik yes")
    public void tcc_tele_007_phone_approve_klik_yes() {
        phoneApprove.btnYes();
        extentTest.log(LogStatus.PASS, "klik yes");
    }

    @Then("TCC.Tele.007.PhoneApprove menampilkan informasi berhasil menyetujui nomor")
    public void tcc_tele_007_phone_approve_menampilkan_informasi_berhasil_menyetujui_nomor() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtInformasi(),"DATA BERHASIL DI SETUJUI");
        extentTest.log(LogStatus.PASS,"Menampilkan data sesuai yang diminta");
    }

    // PHONE APPROVE 008
    @When("TCC.Tele.008.PhoneApprove klik centang nomor yang akan di approve")
    public void tcc_tele_008_phone_approve_klik_centang_nomor_yang_akan_di_approve() {
        phoneApprove.btnDone();
        phoneApprove.checkboxAgent();
        extentTest.log(LogStatus.PASS,"klik centang nomor yang akan di approve");
    }

    @And("TCC.Tele.008.PhoneApprove klik approve")
    public void tcc_tele_008_phone_approve_approve() {
        hooks.waiting(2);
        phoneApprove.btnApprove();
        extentTest.log(LogStatus.PASS, "klik approve");
    }

    @And("TCC.Tele.008.PhoneApprove klik no")
    public void tcc_tele_008_phone_approve_klik_yes() {
        phoneApprove.btnNo();
        extentTest.log(LogStatus.PASS, "klik no");
    }

    @Then("TCC.Tele.008.PhoneApprove kembali ke tampilan semua data nomor")
    public void tcc_tele_008_phone_approve_kembali_ke_tampilan_semua_data_nomor() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtAdditionalPhone(),"ADDITIONAL PHONE");
        extentTest.log(LogStatus.PASS,"kembali ke tampilan semua data nomor");
    }

    // PHONE APPROVE 009
    @When("TCC.Tele.009.PhoneApprove klik reject")
    public void tcc_tele_009_phone_approve_klik_rejec() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.btnReject();
        extentTest.log(LogStatus.PASS,"klik reject");
    }

    @And("TCC.Tele.009.PhoneApprove klik yes")
    public void tcc_tele_006_phone_approve_klik_yes() {
        phoneApprove.btnYes();
        extentTest.log(LogStatus.PASS, "klik yes");
    }

    @Then("TCC.Tele.009.PhoneApprove menampilkan informasi data berhasil ditolak")
    public void tcc_tele_006_phone_approve_menampilkan_informasi_data_berhasil_ditolak() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtInformasi(),"DATA BERHASIL DI TOLAK");
        extentTest.log(LogStatus.FAIL,"Menampilkan data berhasil ditolak");
    }

    // PHONE APPROVE 010
    @When("TCC.Tele.010.PhoneApprove klik centang nomor yang akan di reject")
    public void tcc_tele_010_phone_approve_klik_centang_nomor_yang_akan_di_reject() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.checkboxReject();
        extentTest.log(LogStatus.PASS,"klik centang nomor yang akan di reject");
    }

    @And("TCC.Tele.010.PhoneApprove klik reject")
    public void tcc_tele_010_phone_approve_klik_reject() {
        hooks.waiting(2);
        phoneApprove.btnReject();
        extentTest.log(LogStatus.PASS, "klik reject");
    }

    @And("TCC.Tele.010.PhoneApprove klik yes")
    public void tcc_tele_010_phone_approve_klik_yes() {
        phoneApprove.btnYes();
        extentTest.log(LogStatus.PASS, "klik yes");
    }

    @Then("TCC.Tele.010.PhoneApprove menampilkan informasi berhasil di tolak")
    public void tcc_tele_010_phone_approve_menampilkan_informasi_berhasil_ditolak() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtInformasi(),"DATA BERHASIL DI TOLAK");
        extentTest.log(LogStatus.PASS,"Menampilkan informasi berhasil di tolak");
    }

    // PHONE APPROVE 011
    @When("TCC.Tele.011.PhoneApprove klik centang nomor yang akan di reject")
    public void tcc_tele_011_phone_approve_klik_centang_nomor_yang_akan_di_reject() {
        phoneApprove.btnDone();
        phoneApprove.checkboxAgent();
        extentTest.log(LogStatus.PASS,"klik centang nomor yang akan di reject");
    }

    @And("TCC.Tele.011.PhoneApprove klik reject")
    public void tcc_tele_01_phone_approve_reject() {
        hooks.waiting(2);
        phoneApprove.btnReject();
        extentTest.log(LogStatus.PASS, "klik reject");
    }

    @And("TCC.Tele.011.PhoneApprove klik no")
    public void tcc_tele_011_phone_approve_klik_no() {
        phoneApprove.btnNo();
        extentTest.log(LogStatus.PASS, "klik no");
    }

    @Then("TCC.Tele.011.PhoneApprove kembali ke tampilan semua data nomor")
    public void tcc_tele_011_phone_approve_kembali_ke_tampilan_semua_data_nomor() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtAdditionalPhone(),"ADDITIONAL PHONE");
        extentTest.log(LogStatus.PASS,"kembali ke tampilan semua data nomor");
    }

    // PHONE APPROVE 012
    @When("TCC.Tele.012.PhoneApprove pilih showpage 10")
    public void tcc_tele_012_phone_approve_pilih_showpage_10() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        phoneApprove.selectShowPage("10");
        extentTest.log(LogStatus.PASS,"pilih showpage 10");
    }

    @Then("TCC.Tele.012.PhoneApprove menampilkan showpage 10")
    public void tcc_tele_012_phone_approve_menampilkan_showpage_10() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtShowPage10(),"10");
        extentTest.log(LogStatus.PASS,"menampilkan showpage 10");
    }

    // PHONE APPROVE 013
    @When("TCC.Tele.013.PhoneApprove pilih showpage 25")
    public void tcc_tele_013_phone_approve_pilih_showpage_25() {
        phoneApprove.selectShowPage("25");
        extentTest.log(LogStatus.PASS,"pilih showpage 25");
    }

    @Then("TCC.Tele.013.PhoneApprove menampilkan showpage 25")
    public void tcc_tele_013_phone_approve_menampilkan_showpage_25() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtShowPage25(),"25");
        extentTest.log(LogStatus.PASS,"menampilkan showpage 25");
    }

    // PHONE APPROVE 014
    @When("TCC.Tele.014.PhoneApprove pilih showpage 50")
    public void tcc_tele_014_phone_approve_pilih_showpage_50() {
        phoneApprove.selectShowPage("50");
        extentTest.log(LogStatus.PASS,"pilih showpage 50");
    }

    @Then("TCC.Tele.014.PhoneApprove menampilkan showpage 50")
    public void tcc_tele_014_phone_approve_menampilkan_showpage_50() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtShowPage50(),"50");
        extentTest.log(LogStatus.PASS,"menampilkan showpage 50");
    }

    // PHONE APPROVE 015
    @When("TCC.Tele.015.PhoneApprove klik user management dan phone approve")
    public void tcc_tele_015_phone_approve_klik_user_management_dan_phone_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik user management dan phone approve");
    }

    @Then("TCC.Tele.015.PhoneApprove menampilkan grid agent")
    public void tcc_tele_015_phone_approve_menampilkan_grid_agent() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtAgent(),"agent01");
        extentTest.log(LogStatus.PASS,"menampilkan grid agent");
    }

    // PHONE APPROVE 016
    @When("TCC.Tele.016.PhoneApprove klik user management dan phone approve")
    public void tcc_tele_016_phone_approve_klik_user_management_dan_phone_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik user management dan phone approve");
    }

    @Then("TCC.Tele.016.PhoneApprove menampilkan grid number phone")
    public void tcc_tele_016_phone_approve_menampilkan_grid_number_phone() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtNumberPhone(),"089636391106");
        extentTest.log(LogStatus.PASS,"menampilkan grid number phone");
    }

    // PHONE APPROVE 017
    @When("TCC.Tele.017.PhoneApprove klik user management dan phone approve")
    public void tcc_tele_017_phone_approve_klik_user_management_dan_phone_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik user management dan phone approve");
    }

    @Then("TCC.Tele.017.PhoneApprove menampilkan grid tanggal request")
    public void tcc_tele_017_phone_approve_menampilkan_grid_tanggal_request() {
        hooks.waiting(2);
        Assert.assertTrue(phoneApprove.getTxtTanggalRequest().contains("2022-09-07"));
        extentTest.log(LogStatus.PASS,"menampilkan grid tanggal request");
    }

    // PHONE APPROVE 018
    @When("TCC.Tele.018.PhoneApprove klik user management dan phone approve")
    public void tcc_tele_018_phone_approve_klik_user_management_dan_phone_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik user management dan phone approve");
    }

    @Then("TCC.Tele.018.PhoneApprove menampilkan grid nama")
    public void tcc_tele_018_phone_approve_menampilkan_grid_nama() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtNama(),"sofii_recipe2");
        extentTest.log(LogStatus.PASS,"menampilkan grid nama");
    }

    // PHONE APPROVE 019
    @When("TCC.Tele.019.PhoneApprove klik user management dan phone approve")
    public void tcc_tele_019_phone_approve_klik_user_management_dan_phone_approve() {
        driver.navigate().refresh();
        phoneApprove.btnOkWelcome();
        phoneApprove.clickUserManagement();
        phoneApprove.btnMenuPhoneApprove();
        extentTest.log(LogStatus.PASS,"klik user management dan phone approve");
    }

    @Then("TCC.Tele.019.PhoneApprove menampilkan grid status")
    public void tcc_tele_019_phone_approve_menampilkan_grid_status() {
        hooks.waiting(2);
        Assert.assertEquals(phoneApprove.getTxtStatus(),"REQUEST");
        extentTest.log(LogStatus.PASS,"menampilkan grid status");
    }
}
