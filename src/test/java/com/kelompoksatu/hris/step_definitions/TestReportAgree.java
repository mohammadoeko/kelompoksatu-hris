package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.ReportAgree;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReportAgree {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private UploadData uploadData = new UploadData();

    private ReportAgree reportAgree = new ReportAgree();

    public TestReportAgree() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // REPORT AGREE 001
    @When("TCC.Tele.001 klik report")
    public void tcc_tele_001_klik_report() {
        driver.get(Constants.URL);
        uploadData.formLogin("developer", "23");
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001 klik report agree")
    public void tcc_tele_001_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @Then("TCC.Tele.001 menampilkan halaman report agree")
    public void tcc_tele_001_menampilkan_halaman_report_agree() {
        Assert.assertEquals(reportAgree.getTxtReportSetuju(),"REPORT SETUJU");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman report agree");
    }

    // TCC.REPORTAGREE VIEW.001
    @When("TCC.Tele.001.Agree.View klik report")
    public void tcc_tele_001_agree_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Agree.View klik report agree")
    public void tcc_tele_001_agree_view_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @And("TCC.Tele.001.Agree.View input start date")
    public void tcc_tele_001_agree_view_input_start_date() {
        reportAgree.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Agree.View klik tanggal 9")
    public void tcc_tele_001_agree_view_klik_tanggal_9() {
        reportAgree.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Agree.View input end date")
    public void tcc_tele_001_agree_view_end_start_date() {
        reportAgree.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Agree.View klik tanggal 14")
    public void tcc_tele_001_agree_view_klik_tanggal_14() {
        reportAgree.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Agree.View klik button view")
    public void tcc_tele_001_agree_view_klik_button_view() {
        reportAgree.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.001.Agree.View menampilkan report sesuai tanggal input")
    public void tcc_tele_001_agree_view_menampilkan_report_sesuai_tanggal_input() {
        Assert.assertEquals(reportAgree.getTxtNamaPerusahaan(), "mas harun 1");
        extentTest.log(LogStatus.PASS,"Menampilkan report sesuai tanggal input");
    }

    // TCC.REPORTAGREE VIEW.002
    @When("TCC.Tele.002.Agree.View klik report")
    public void tcc_tele_002_agree_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.002.Agree.View klik report agree")
    public void tcc_tele_002_agree_view_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @And("TCC.Tele.002.Agree.View klik button view")
    public void tcc_tele_002_agree_view_klik_button_view() {
        reportAgree.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.002.Agree.View menampilkan report sesuai tanggal input")
    public void tcc_tele_002_agree_view_menampilkan_report_sesuai_tanggal_input() {
        Assert.assertEquals(reportAgree.getTxtNamaPerusahaan(), "mas harun 1");
        extentTest.log(LogStatus.PASS,"Menampilkan report sesuai tanggal input");
    }

    // TCC.REPORTAGREE VIEW.003
    @When("TCC.Tele.003.Agree.View klik report")
    public void tcc_tele_003_agree_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.003.Agree.View klik report agree")
    public void tcc_tele_003_agree_view_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @And("TCC.Tele.003.Agree.View input start date")
    public void tcc_tele_003_agree_view_input_start_date() {
        reportAgree.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.003.Agree.View klik tanggal 9")
    public void tcc_tele_003_agree_view_klik_tanggal_9() {
        reportAgree.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.003.Agree.View klik button view")
    public void tcc_tele_003_agree_view_klik_button_view() {
        reportAgree.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.003.Agree.View menampilkan report sesuai tanggal input")
    public void tcc_tele_003_agree_view_menampilkan_report_sesuai_tanggal_input() {
        Assert.assertEquals(reportAgree.getTxtNamaPerusahaan(), "mas harun 1");
        extentTest.log(LogStatus.PASS,"Menampilkan report sesuai tanggal input");
    }

    // TCC.REPORTAGREE VIEW.004
    @When("TCC.Tele.004.Agree.View klik report")
    public void tcc_tele_004_agree_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.004.Agree.View klik report agree")
    public void tcc_tele_004_agree_view_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @And("TCC.Tele.004.Agree.View input end date")
    public void tcc_tele_004_agree_view_input_end_date() {
        reportAgree.inputStartDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.004.Agree.View klik tanggal 14")
    public void tcc_tele_004_agree_view_klik_tanggal_14() {
        reportAgree.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.004.Agree.View klik button view")
    public void tcc_tele_004_agree_view_klik_button_view() {
        reportAgree.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.004.Agree.View menampilkan report sesuai tanggal input")
    public void tcc_tele_004_agree_view_menampilkan_report_sesuai_tanggal_input() {
        Assert.assertEquals(reportAgree.getTxtNamaPerusahaan(), "mas harun 1");
        extentTest.log(LogStatus.PASS,"Menampilkan report sesuai tanggal input");
    }
}
