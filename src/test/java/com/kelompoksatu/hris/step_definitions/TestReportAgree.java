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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
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
        reportAgree.inputEndDate();
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

    //REPORT AGREE EXPORT 001
    @When("TCC.Tele.001.Agree.Export klik report")
    public void tcc_tele_001_agree_export_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Agree.Export klik report agree")
    public void tcc_tele_001_agree_export_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }

    @And("TCC.Tele.001.Agree.Export input start date")
    public void tcc_tele_001_agree_export_input_start_date() {
        reportAgree.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Agree.Export klik tanggal 9")
    public void tcc_tele_001_agree_export_klik_tanggal_9() {
        reportAgree.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Agree.Export input end date")
    public void tcc_tele_001_agree_export_end_start_date() {
        reportAgree.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Agree.Export klik tanggal 14")
    public void tcc_tele_001_agree_export_klik_tanggal_14() {
        reportAgree.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Agree.Export klik button export")
    public void tcc_tele_001_agree_export_klik_button_export() {
        reportAgree.btnExport();
        extentTest.log(LogStatus.PASS,"klik button export");
    }

    @Then("TCC.Tele.001.Agree.Export mendownload file sesuai tanggal input")
    public void tcc_tele_001_agree_export_mendownload_file_sesuai_tanggal_input() {
        hooks.waiting(5);
        driver.navigate().to("file:///C:/Users/Moh_Eko11/Downloads/");
        Assert.assertTrue(reportAgree.getTxtSizeFileTwo().contains("exportsetuju"));
        extentTest.log(LogStatus.PASS,"mendownload file sesuai tanggal input");
    }

    //REPORT AGREE EXPORT 002
    @When("TCC.Tele.002.Agree.Export klik report")
    public void tcc_tele_002_agree_export_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.002.Agree.Export klik report agree")
    public void tcc_tele_002_agree_export_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.002.Agree.Export klik button export")
    public void tcc_tele_002_agree_export_klik_button_export() {
        reportAgree.btnExport();
        extentTest.log(LogStatus.PASS,"klik button export");
    }

    @Then("TCC.Tele.002.Agree.Export mendownload file sesuai tanggal input")
    public void tcc_tele_002_agree_export_mendownload_file_sesuai_tanggal_input() {
        hooks.waiting(5);
        driver.navigate().to("file:///C:/Users/Moh_Eko11/Downloads/");
        Assert.assertTrue(reportAgree.getTxtSizeFile().contains("exportsetuju"));
        extentTest.log(LogStatus.PASS,"mendownload file sesuai tanggal input");
    }

    //REPORT AGREE SHOWPAGE 001
    @When("TCC.Tele.001.Agree.Showpage klik report")
    public void tcc_tele_001_agree_showpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.001.Agree.Showpage klik report agree")
    public void tcc_tele_001_agree_showpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.001.Agree.Showpage pilih show page 10")
    public void tcc_tele_001_agree_showpage_pilih_show_page_10() {
        reportAgree.selectShowPage("10");
        extentTest.log(LogStatus.PASS,"pilih show page 10");
    }

    @Then("TCC.Tele.001.Agree.Showpage menampilkan data sampai 10")
    public void tcc_tele_001_agree_showpage_menampilkan_data_sampai_10() {
        Assert.assertEquals(reportAgree.getTxtShowPage10(), "10");
        extentTest.log(LogStatus.PASS,"menampilkan data sampai 10");
    }

    //REPORT AGREE SHOWPAGE 002
    @When("TCC.Tele.002.Agree.Showpage klik report")
    public void tcc_tele_002_agree_showpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.002.Agree.Showpage klik report agree")
    public void tcc_tele_002_agree_showpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.002.Agree.Showpage pilih show page 25")
    public void tcc_tele_002_agree_showpage_pilih_show_page_25() {
        reportAgree.selectShowPage("25");
        extentTest.log(LogStatus.PASS,"pilih show page 25");
    }

    @Then("TCC.Tele.002.Agree.Showpage menampilkan data sampai 25")
    public void tcc_tele_002_agree_showpage_menampilkan_data_sampai_25() {
        Assert.assertEquals(reportAgree.getTxtShowPage25(), "25");
        extentTest.log(LogStatus.PASS,"menampilkan data sampai 25");
    }

    //REPORT AGREE SHOWPAGE 003
    @When("TCC.Tele.003.Agree.Showpage klik report")
    public void tcc_tele_003_agree_showpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.003.Agree.Showpage klik report agree")
    public void tcc_tele_003_agree_showpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.003.Agree.Showpage pilih show page 50")
    public void tcc_tele_003_agree_showpage_pilih_show_page_50() {
        reportAgree.selectShowPage("50");
        extentTest.log(LogStatus.PASS,"pilih show page 50");
    }

    @Then("TCC.Tele.003.Agree.Showpage menampilkan data sampai 50")
    public void tcc_tele_003_agree_showpage_menampilkan_data_sampai_50() {
        Assert.assertEquals(reportAgree.getTxtShowPage50(), "50");
        extentTest.log(LogStatus.PASS,"menampilkan data sampai 50");
    }

    //REPORT AGREE SHOWPAGE 004
    @When("TCC.Tele.004.Agree.Showpage klik report")
    public void tcc_tele_004_agree_showpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.004.Agree.Showpage klik report agree")
    public void tcc_tele_004_agree_showpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.004.Agree.Showpage pilih show page 100")
    public void tcc_tele_004_agree_showpage_pilih_show_page_100() {
        reportAgree.selectShowPage("100");
        extentTest.log(LogStatus.PASS,"pilih show page 100");
    }

    @Then("TCC.Tele.004.Agree.Showpage menampilkan data sampai 100")
    public void tcc_tele_004_agree_showpage_menampilkan_data_sampai_100() {
        Assert.assertEquals(reportAgree.getTxtShowPage100(), "100");
        extentTest.log(LogStatus.PASS,"menampilkan data sampai 100");
    }

    //REPORT AGREE NEXTPAGE 001
    @When("TCC.Tele.001.Agree.Nextpage klik report")
    public void tcc_tele_001_agree_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.001.Agree.Nextpage klik report agree")
    public void tcc_tele_001_agree_nextpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.001.Agree.Nextpage klik button page 2")
    public void tcc_tele_001_agree_nextpage_klik_button_page_2() {
        reportAgree.btnPage2();
        extentTest.log(LogStatus.PASS,"klik button page 2");
        hooks.waiting(2);
    }

    @Then("TCC.Tele.001.Agree.Nextpage menampilkan data page 2")
    public void tcc_tele_001_agree_nextpage_menampilkan_data_page_2() {
        Assert.assertEquals(reportAgree.getTxtPageNumber20(), "oversize.kece");
        extentTest.log(LogStatus.PASS,"menampilkan data page 2");
    }

    //REPORT AGREE NEXTPAGE 002
    @When("TCC.Tele.002.Agree.Nextpage klik report")
    public void tcc_tele_002_agree_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.002.Agree.Nextpage klik report agree")
    public void tcc_tele_002_agree_nextpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.002.Agree.Nextpage klik button last page")
    public void tcc_tele_002_agree_nextpage_klik_button_last_page() {
        reportAgree.btnLastPage();
        extentTest.log(LogStatus.PASS,"klik button last page");
        hooks.waiting(2);
    }

    @Then("TCC.Tele.002.Agree.Nextpage menampilkan data last page")
    public void tcc_tele_002_agree_nextpage_menampilkan_data_last_page_() {
        Assert.assertEquals(reportAgree.getTxtNumberLastPage(), "wihh_skincare2");
        extentTest.log(LogStatus.PASS,"menampilkan data last page");
    }

    //REPORT AGREE NEXTPAGE 003
    @When("TCC.Tele.003.Agree.Nextpage klik report")
    public void tcc_tele_003_agree_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportAgree.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }
    @And("TCC.Tele.003.Agree.Nextpage klik report agree")
    public void tcc_tele_003_agree_nextpage_klik_report_agree() {
        reportAgree.clickReportAgree();
        extentTest.log(LogStatus.PASS,"klik report agree");
    }
    @And("TCC.Tele.003.Agree.Nextpage klik button first page")
    public void tcc_tele_003_agree_nextpage_klik_button_first_page() {
        reportAgree.btnFirstPage();
        extentTest.log(LogStatus.PASS,"klik button first page");
    }

    @Then("TCC.Tele.003.Agree.Nextpage menampilkan data first page")
    public void tcc_tele_003_agree_nextpage_menampilkan_data_first_page() {
        Assert.assertEquals(reportAgree.getTxtNumberFirstPage(), "mas harun 1");
        extentTest.log(LogStatus.PASS,"menampilkan data first page");
    }
}
