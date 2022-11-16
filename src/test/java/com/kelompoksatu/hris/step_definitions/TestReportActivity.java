package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.ReportActivity;
import com.kelompoksatu.hris.pages.ReportAgree;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReportActivity {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private UploadData uploadData = new UploadData();

    private ReportActivity reportActivity = new ReportActivity();

    public TestReportActivity() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // REPORT ACTIVITY 001
    @When("TCC.Tele.001.Report.Activity klik report")
    public void tcc_tele_001_report_activity_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Report.Activity klik report activity")
    public void tcc_tele_001_report_activity_klik_report_activity() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @Then("TCC.Tele.001.Report.Activity menampilkan halaman report activity")
    public void tcc_tele_001_report_activity_menampilkan_halaman_report_activity() {
        Assert.assertEquals(reportActivity.getTxtPerformReport(),"PERFORM REPORT");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman report activity");
    }

    // TCC.REPORTACTIVITY VIEW.001
    @When("TCC.Tele.001.Activity.View klik report")
    public void tcc_tele_001_activity_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Activity.View klik report activity")
    public void tcc_tele_001_activity_view_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.001.Activity.View memilih agent")
    public void tcc_tele_001_activity_view_memilih_agent() {
        reportActivity.selectAgent();
        extentTest.log(LogStatus.PASS,"memilih agent");
    }

    @And("TCC.Tele.001.Activity.View input start date")
    public void tcc_tele_001_activity_view_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Activity.View klik tanggal 9")
    public void tcc_tele_001_activity_view_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Activity.View input end date")
    public void tcc_tele_001_activity_view_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Activity.View klik tanggal 14")
    public void tcc_tele_001_activity_view_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Activity.View klik button view")
    public void tcc_tele_001_activity_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.001.Activity.View menampilkan perform report sesuai agent dan tanggal input")
    public void tcc_tele_001_activity_view_menampilkan_report_sesuai_agent_dan_tanggal_input() {
        Assert.assertEquals(reportActivity.getTxtNamaPerusahaan(), "xiaomay");
        extentTest.log(LogStatus.PASS,"Menampilkan perform report sesuai agent dan tanggal input");
    }

    // TCC.REPORTACTIVITY VIEW.002
    @When("TCC.Tele.002.Activity.View klik report")
    public void tcc_tele_002_activity_view_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.002.Activity.View klik report activity")
    public void tcc_tele_002_activity_view_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.002.Activity.View input start date")
    public void tcc_tele_002_activity_view_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.002.Activity.View klik tanggal 9")
    public void tcc_tele_002_activity_view_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.002.Activity.View input end date")
    public void tcc_tele_002_activity_view_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.002.Activity.View klik tanggal 14")
    public void tcc_tele_002_activity_view_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.002.Activity.View klik button view")
    public void tcc_tele_002_activity_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @Then("TCC.Tele.002.Activity.View menampilkan perform report sesuai tanggal input")
    public void tcc_tele_002_activity_view_menampilkan_report_sesuai_agent_dan_tanggal_input() {
        Assert.assertEquals(reportActivity.getTxtNamaPerusahaan(), "xiaomay");
        extentTest.log(LogStatus.PASS,"Menampilkan perform report sesuai tanggal input");
    }

    //REPORT ACTIVITY EXPORT 001
    @When("TCC.Tele.001.Activity.Export klik report")
    public void tcc_tele_001_activity_export_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Activity.Export klik report agree")
    public void tcc_tele_001_activity_export_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.001.Activity.Export memilih agent")
    public void tcc_tele_001_activity_export_memilih_agent() {
        reportActivity.selectAgent();
        extentTest.log(LogStatus.PASS,"memilih agent");
    }

    @And("TCC.Tele.001.Activity.Export input start date")
    public void tcc_tele_001_activity_export_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Activity.Export klik tanggal 9")
    public void tcc_tele_001_activity_export_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Activity.Export input end date")
    public void tcc_tele_001_activity_export_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Activity.Export klik tanggal 14")
    public void tcc_tele_001_activity_export_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Activity.Export klik button export")
    public void tcc_tele_001_activity_export_klik_button_export() {
        reportActivity.btnExport();
        extentTest.log(LogStatus.PASS,"klik button export");
    }

    @Then("TCC.Tele.001.Activity.Export mendownload file sesuai agent dan tanggal input")
    public void tcc_tele_001_activity_export_mendownload_file_sesuai_agent_dan_tanggal_input() {
        hooks.waiting(5);
        driver.navigate().to("file:///C:/Users/Moh_Eko11/Downloads/");
        Assert.assertEquals(reportActivity.getTxtSizeFileTwo(), "15.5 kB");
        extentTest.log(LogStatus.PASS,"mendownload file sesuai agent dan tanggal input");
    }

    //REPORT ACTIVITY EXPORT 002
    @When("TCC.Tele.002.Activity.Export klik report")
    public void tcc_tele_002_activity_export_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.002.Activity.Export klik report agree")
    public void tcc_tele_002_activity_export_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.002.Activity.Export input start date")
    public void tcc_tele_002_activity_export_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.002.Activity.Export klik tanggal 9")
    public void tcc_tele_002_activity_export_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.002.Activity.Export input end date")
    public void tcc_tele_002_activity_export_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.002.Activity.Export klik tanggal 14")
    public void tcc_tele_002_activity_export_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.002.Activity.Export klik button export")
    public void tcc_tele_002_activity_export_klik_button_export() {
        reportActivity.btnExport();
        extentTest.log(LogStatus.PASS,"klik button export");
    }

    @Then("TCC.Tele.002.Activity.Export mendownload file sesuai tanggal input")
    public void tcc_tele_002_activity_export_mendownload_file_sesuai_tanggal_input() {
        hooks.waiting(5);
        driver.navigate().to("file:///C:/Users/Moh_Eko11/Downloads/");
        Assert.assertEquals(reportActivity.getTxtSizeFileOne(), "15.5 kB");
        extentTest.log(LogStatus.PASS,"mendownload file sesuai tanggal input");
    }

    // TCC.REPORTACTIVITY SHOWPAGE.001
    @When("TCC.Tele.001.Activity.Showpage klik report")
    public void tcc_tele_001_activity_showpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Activity.Showpage klik report activity")
    public void tcc_tele_001_activity_showpage_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.001.Activity.Showpage input start date")
    public void tcc_tele_001_activity_showpage_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Activity.Showpage klik tanggal 9")
    public void tcc_tele_001_activity_showpage_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Activity.Showpage input end date")
    public void tcc_tele_001_activity_showpage_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Activity.Showpage klik tanggal 14")
    public void tcc_tele_001_activity_showpage_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Activity.Showpage klik button view")
    public void tcc_tele_001_showpage_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
    }

    @And("TCC.Tele.001.Activity.Showpage pilih show page 10")
    public void tcc_tele_001_activity_showpage_pilih_show_page_10() {
        reportActivity.selectShowPage("10");
        extentTest.log(LogStatus.PASS,"pilih show page 10");
    }

    @Then("TCC.Tele.001.Activity.Showpage menampilkan data sampai 10")
    public void tcc_tele_001_activity_showpage_menampilkan_data_sampai_10() {
        Assert.assertEquals(reportActivity.getTxtShowEntries10(), "tesaja 4");
        extentTest.log(LogStatus.PASS,"Menampilkan data sampai 10");
    }

    // TCC.REPORTACTIVITY NEXTPAGE.001
    @When("TCC.Tele.001.Activity.Nextpage klik report")
    public void tcc_tele_001_activity_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.001.Activity.Nextpage klik report activity")
    public void tcc_tele_001_activity_nextpage_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.001.Activity.Nextpage input start date")
    public void tcc_tele_001_activity_nextpage_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.001.Activity.Nextpage klik tanggal 9")
    public void tcc_tele_001_activity_nextpage_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.001.Activity.Nextpage input end date")
    public void tcc_tele_001_activity_nextpage_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.001.Activity.Nextpage klik tanggal 14")
    public void tcc_tele_001_activity_nextpage_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.001.Activity.Nextpage klik button view")
    public void tcc_tele_001_nextpage_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
        hooks.waiting(2);
    }

    @And("TCC.Tele.001.Activity.Nextpage klik button page 2")
    public void tcc_tele_001_activity_nextpage_klik_button_page_2() {
        reportActivity.btnPage2();
        extentTest.log(LogStatus.PASS,"klik button page 2");
        hooks.waiting(2);
    }

    @Then("TCC.Tele.001.Activity.Nextpage menampilkan data page 2")
    public void tcc_tele_001_activity_nextpage_menampilkan_data_page_2() {
        Assert.assertEquals(reportActivity.getTxtNamePage2(), "tesaja 2");
        extentTest.log(LogStatus.PASS,"Menampilkan data page 2");
    }

    // TCC.REPORTACTIVITY NEXTPAGE.002
    @When("TCC.Tele.002.Activity.Nextpage klik report")
    public void tcc_tele_002_activity_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.002.Activity.Nextpage klik report activity")
    public void tcc_tele_002_activity_nextpage_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.002.Activity.Nextpage input start date")
    public void tcc_tele_002_activity_nextpage_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.002.Activity.Nextpage klik tanggal 9")
    public void tcc_tele_002_activity_nextpage_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.002.Activity.Nextpage input end date")
    public void tcc_tele_002_activity_nextpage_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.002.Activity.Nextpage klik tanggal 14")
    public void tcc_tele_002_activity_nextpage_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.002.Activity.Nextpage klik button view")
    public void tcc_tele_002_nextpage_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
        hooks.waiting(2);
    }

    @And("TCC.Tele.002.Activity.Nextpage klik button lastpage")
    public void tcc_tele_001_activity_nextpage_klik_button_lastpage() {
        reportActivity.btnLastPage();
        extentTest.log(LogStatus.PASS,"klik button lastpage");
        hooks.waiting(2);
    }

    @Then("TCC.Tele.002.Activity.Nextpage menampilkan data lastpage")
    public void tcc_tele_002_activity_nextpage_menampilkan_data_lastpage() {
        Assert.assertEquals(reportActivity.getTxtNameLastPage(), "tesaja 2");
        extentTest.log(LogStatus.PASS,"Menampilkan data lastpage");
    }

    // TCC.REPORTACTIVITY NEXTPAGE.003
    @When("TCC.Tele.003.Activity.Nextpage klik report")
    public void tcc_tele_003_activity_nextpage_klik_report() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        reportActivity.clickReport();
        extentTest.log(LogStatus.PASS, "Klik report");
    }

    @And("TCC.Tele.003.Activity.Nextpage klik report activity")
    public void tcc_tele_003_activity_nextpage_klik_report_agree() {
        reportActivity.clickReportActivity();
        extentTest.log(LogStatus.PASS,"klik report activity");
    }

    @And("TCC.Tele.003.Activity.Nextpage input start date")
    public void tcc_tele_003_activity_nextpage_input_start_date() {
        reportActivity.inputStartDate();
        extentTest.log(LogStatus.PASS,"input start date");
    }

    @And("TCC.Tele.003.Activity.Nextpage klik tanggal 9")
    public void tcc_tele_003_activity_nextpage_klik_tanggal_9() {
        reportActivity.inputTanggalAwal();
        extentTest.log(LogStatus.PASS,"klik tanggal 9");
    }

    @And("TCC.Tele.003.Activity.Nextpage input end date")
    public void tcc_tele_003_activity_nextpage_end_date() {
        reportActivity.inputEndDate();
        extentTest.log(LogStatus.PASS,"input end date");
    }

    @And("TCC.Tele.003.Activity.Nextpage klik tanggal 14")
    public void tcc_tele_003_activity_nextpage_klik_tanggal_14() {
        reportActivity.inputTanggalAkhir();
        extentTest.log(LogStatus.PASS,"klik tanggal 14");
    }

    @And("TCC.Tele.003.Activity.Nextpage klik button view")
    public void tcc_tele_003_nextpage_view_klik_button_view() {
        reportActivity.btnView();
        extentTest.log(LogStatus.PASS,"klik button view");
        hooks.waiting(2);
    }

    @And("TCC.Tele.003.Activity.Nextpage klik button firstpage")
    public void tcc_tele_003_activity_nextpage_klik_button_firstpage() {
        reportActivity.btnFirstPage();
        extentTest.log(LogStatus.PASS,"klik button firstpage");
        hooks.waiting(2);
    }

    @Then("TCC.Tele.003.Activity.Nextpage menampilkan data firstpage")
    public void tcc_tele_003_activity_nextpage_menampilkan_data_firstpage() {
        Assert.assertEquals(reportActivity.getTxtNameFirstPage(), "xiaomay");
        extentTest.log(LogStatus.PASS,"Menampilkan data lastpage");
    }
}
