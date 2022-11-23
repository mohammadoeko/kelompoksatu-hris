package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.TaskAgentFinal;
import com.kelompoksatu.hris.pages.TaskAgentFollowUp;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskAgentFinal {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();
    private TaskAgentFinal taskAgentFinal = new TaskAgentFinal();

    public TestTaskAgentFinal() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // TASK FINAL 001
    @When("TCC.Tele.001.Task.Final klik task")
    public void tcc_tele_001_task_final_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.Final klik final")
    public void tcc_tele_001_task_final_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @Then("TCC.Tele.001.Task.Final menampilkan halaman task final")
    public void tcc_tele_001_task_final_menampilkan_halaman_task_final() {
        Assert.assertEquals(taskAgentFinal.getTxtDataFinal(),"DATA FINAL");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman task final");
    }

    // TASK FINAL SEARCH 001
    @When("TCC.Tele.001.Task.Final.Search klik task")
    public void tcc_tele_001_task_final_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.Final.Search klik final")
    public void tcc_tele_001_task_final_search_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.001.Task.Final.Search input data di kolom search")
    public void tcc_tele_001_task_final_search_input_data_di_kolom_search() {
        taskAgentFinal.inputSearch("tesaja 7");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.001.Task.Final.Search klik search")
    public void tcc_tele_001_task_final_search_klik_search() {
        taskAgentFinal.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.001.Task.Final.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_001_task_final_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtTesAja7(),"tesaja 7");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FINAL SEARCH 003
    @When("TCC.Tele.002.Task.Final.Search klik task")
    public void tcc_tele_002_task_final_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.Final.Search klik final")
    public void tcc_tele_002_task_final_search_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.002.Task.Final.Search input data di kolom search")
    public void tcc_tele_002_task_final_search_input_data_di_kolom_search() {
        taskAgentFinal.inputSearch("7");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.002.Task.Final.Search klik search")
    public void tcc_tele_002_task_final_search_klik_search() {
        taskAgentFinal.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.002.Task.Final.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_002_task_final_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtSearch7(),"tesaja 7");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FINAL SEARCH 003
    @When("TCC.Tele.003.Task.Final.Search klik task")
    public void tcc_tele_003_task_final_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.Final.Search klik final")
    public void tcc_tele_003_task_final_search_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.003.Task.Final.Search input data di kolom search")
    public void tcc_tele_003_task_final_search_input_data_di_kolom_search() {
        taskAgentFinal.inputSearch("_");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.003.Task.Final.Search klik search")
    public void tcc_tele_003_task_final_search_klik_search() {
        taskAgentFinal.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.003.Task.Final.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_003_task_final_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtSearch_(),"cireng_udin");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FINAL SEARCH 004
    @When("TCC.Tele.004.Task.Final.Search klik task")
    public void tcc_tele_004_task_final_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.Final.Search klik final")
    public void tcc_tele_004_task_final_search_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.004.Task.Final.Search klik search")
    public void tcc_tele_004_task_final_search_klik_search() {
        taskAgentFinal.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.004.Task.Final.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_004_task_final_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtSearch_(),"cireng_udin");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FINAL SHOWPAGE 001
    @When("TCC.Tele.001.Task.Final.Showpage klik task")
    public void tcc_tele_001_task_final_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.Final.Showpage klik final")
    public void tcc_tele_001_task_final_showpage_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.001.Task.Final.Showpage klik dropdown show page pilih 10")
    public void tcc_tele_001_task_final_showpage_klik_dropdown_show_page_pilih_10() {
        taskAgentFinal.selectShowPage("10");
        extentTest.log(LogStatus.PASS,"klik dropdown show page pilih 10");
    }

    @Then("TCC.Tele.001.Task.Final.Showpage muncul data sesuai showpage")
    public void tcc_tele_001_task_final_showpage_muncul_data_sesuai_showpage() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtNamaPerusahaanFirstPage(),"bakmie bang cecep");
        extentTest.log(LogStatus.PASS,"muncul data sesuai showpage");
    }

    // TASK FINAL SHOWPAGE 002
    @When("TCC.Tele.002.Task.Final.Showpage klik task")
    public void tcc_tele_002_task_final_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.Final.Showpage klik final")
    public void tcc_tele_002_task_final_showpage_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.002.Task.Final.Showpage klik dropdown show page pilih 25")
    public void tcc_tele_002_task_final_showpage_klik_dropdown_show_page_pilih_25() {
        taskAgentFinal.selectShowPage("25");
        extentTest.log(LogStatus.PASS,"klik dropdown show page pilih 25");
    }

    @Then("TCC.Tele.002.Task.Final.Showpage muncul data sesuai showpage")
    public void tcc_tele_002_task_final_showpage_muncul_data_sesuai_showpage() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtNamaPerusahaanFirstPage(),"bakmie bang cecep");
        extentTest.log(LogStatus.PASS,"muncul data sesuai showpage");
    }

    // TASK FINAL NEXTPAGE 001
    @When("TCC.Tele.001.Task.Final.Nextpage klik task")
    public void tcc_tele_001_task_final_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.Final.Nextpage klik final")
    public void tcc_tele_001_task_final_nextpage_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.001.Task.Final.Nextpage klik page 2")
    public void tcc_tele_001_task_final_nextpage_klik_page_2() {
        taskAgentFinal.clickPage2();
        extentTest.log(LogStatus.PASS,"klik page 2");
    }

    @Then("TCC.Tele.001.Task.Final.Nextpage muncul data sesuai page 2")
    public void tcc_tele_001_task_final_nextpage_muncul_data_sesuai_page_2() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtNamaPerusahaanPage2(),"sepatu.sikil");
        extentTest.log(LogStatus.PASS,"muncul data sesuai page 2");
    }

    // TASK FINAL NEXTPAGE 002
    @When("TCC.Tele.002.Task.Final.Nextpage klik task")
    public void tcc_tele_002_task_final_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.Final.Nextpage klik final")
    public void tcc_tele_002_task_final_nextpage_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.002.Task.Final.Nextpage klik lastpage")
    public void tcc_tele_002_task_final_nextpage_klik_last_page() {
        taskAgentFinal.clickLastPage();
        extentTest.log(LogStatus.PASS,"klik last page");
    }

    @Then("TCC.Tele.002.Task.Final.Nextpage muncul data sesuai lastpage")
    public void tcc_tele_002_task_final_nextpage_muncul_data_sesuai_last_page() {
        hooks.waiting(3);
        Assert.assertEquals(taskAgentFinal.getTxtNamaPerusahaanLastPage(),"tesaja 7");
        extentTest.log(LogStatus.PASS,"muncul data sesuai last page");
    }

    // TASK FINAL NEXTPAGE 003
    @When("TCC.Tele.003.Task.Final.Nextpage klik task")
    public void tcc_tele_003_task_final_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentFinal.btnOkWelcome();
        taskAgentFinal.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.Final.Nextpage klik final")
    public void tcc_tele_003_task_final_nextpage_klik_final() {
        taskAgentFinal.btnMenuFinal();
        extentTest.log(LogStatus.PASS,"klik final");
    }

    @And("TCC.Tele.003.Task.Final.Nextpage klik first page")
    public void tcc_tele_003_task_final_nextpage_klik_first_page() {
        taskAgentFinal.setClickFirstPage();
        extentTest.log(LogStatus.PASS,"klik first page");
    }

    @Then("TCC.Tele.003.Task.Final.Nextpage muncul data sesuai first page")
    public void tcc_tele_003_task_final_nextpage_muncul_data_sesuai_first_page() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentFinal.getTxtNamaPerusahaanFirstPage(),"bakmie bang cecep");
        extentTest.log(LogStatus.PASS,"muncul data sesuai first page");
    }
}
