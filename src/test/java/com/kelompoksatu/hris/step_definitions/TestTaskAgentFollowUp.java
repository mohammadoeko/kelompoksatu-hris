package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.TaskAgentFollowUp;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskAgentFollowUp {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private TaskAgentFollowUp taskFollowUp = new TaskAgentFollowUp();

    public TestTaskAgentFollowUp() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TASK FOLLOW UP 001
    @When("TCC.Tele.001.Task.FollowUp klik task")
    public void tcc_tele_001_task_follow_up_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.FollowUp klik follow up")
    public void tcc_tele_001_task_follow_up_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @Then("TCC.Tele.001.Task.FollowUp menampilkan halaman follow up")
    public void tcc_tele_001_task_follow_up_menampilkan_halaman_follow_up() {
        Assert.assertEquals(taskFollowUp.getTxtDataThinking(),"DATA THINKING");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman follow up");
    }

    // TASK FOLLOW UP SEARCH 001
    @When("TCC.Tele.001.Task.FollowUp.Search klik task")
    public void tcc_tele_001_task_follow_up_search_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.FollowUp.Search klik follow up")
    public void tcc_tele_001_task_follow_up_search_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.001.Task.FollowUp.Search input data di kolom search")
    public void tcc_tele_001_task_follow_up_search_input_data_di_kolom_search() {
        taskFollowUp.inputSearch("tesaja 9");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.001.Task.FollowUp.Search klik search")
    public void tcc_tele_001_task_follow_up_search_klik_search() {
        taskFollowUp.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.001.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_001_task_follow_up_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtTesAja9(),"tesaja 9");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FOLLOW UP SEARCH 002
    @When("TCC.Tele.002.Task.FollowUp.Search klik task")
    public void tcc_tele_002_task_follow_up_search_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.FollowUp.Search klik follow up")
    public void tcc_tele_002_task_follow_up_search_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.002.Task.FollowUp.Search input data di kolom search")
    public void tcc_tele_002_task_follow_up_search_input_data_di_kolom_search() {
        taskFollowUp.inputSearch("9");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.002.Task.FollowUp.Search klik search")
    public void tcc_tele_002_task_follow_up_search_klik_search() {
        taskFollowUp.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.002.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_002_task_follow_up_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtTesAja9(),"tesaja 9");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FOLLOW UP SEARCH 003
    @When("TCC.Tele.003.Task.FollowUp.Search klik task")
    public void tcc_tele_003_task_follow_up_search_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.FollowUp.Search klik follow up")
    public void tcc_tele_003_task_follow_up_search_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.003.Task.FollowUp.Search input data di kolom search")
    public void tcc_tele_003_task_follow_up_search_input_data_di_kolom_search() {
        taskFollowUp.inputSearch("_");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.003.Task.FollowUp.Search klik search")
    public void tcc_tele_003_task_follow_up_search_klik_search() {
        taskFollowUp.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.003.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_003_task_follow_up_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtCacaHijab(),"caca_hijab");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FOLLOW UP SEARCH 004
    @When("TCC.Tele.004.Task.FollowUp.Search klik task")
    public void tcc_tele_004_task_follow_up_search_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.FollowUp.Search klik follow up")
    public void tcc_tele_004_task_follow_up_search_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.004.Task.FollowUp.Search klik search")
    public void tcc_tele_004_task_follow_up_search_klik_search() {
        taskFollowUp.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.004.Task.FollowUp.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_004_task_follow_up_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtCacaHijab(),"caca_hijab");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK FOLLOW UP SHOWPAGE 001
    @When("TCC.Tele.001.Task.FollowUp.Showpage klik task")
    public void tcc_tele_001_task_follow_up_showpage_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.FollowUp.Showpage klik follow up")
    public void tcc_tele_001_task_follow_up_showpage_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.001.Task.FollowUp.Showpage klik dropdown show page pilih 10")
    public void tcc_tele_001_task_follow_up_showpage_klik_dropdown_show_page_pilih_10() {
        taskFollowUp.selectShowPage("10");
        extentTest.log(LogStatus.PASS,"klik dropdown show page pilih 10");
    }

    @Then("TCC.Tele.001.Task.FollowUp.Showpage muncul data sesuai showpage")
    public void tcc_tele_001_task_follow_up_showpage_muncul_data_sesuai_showpage() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtCacaHijab(),"caca_hijab");
        extentTest.log(LogStatus.PASS,"muncul data sesuai showpage");
    }

    // TASK FOLLOW UP NEXTPAGE 001
    @When("TCC.Tele.001.Task.FollowUp.Nextpage klik task")
    public void tcc_tele_001_task_follow_up_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.FollowUp.Nextpage klik follow up")
    public void tcc_tele_001_task_follow_up_nextpage_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.001.Task.FollowUp.Nextpage klik page 2")
    public void tcc_tele_001_task_follow_up_nextpage_klik_page_2() {
        taskFollowUp.clickPage2();
        extentTest.log(LogStatus.PASS,"klik page 2");
    }

    @Then("TCC.Tele.001.Task.FollowUp.Nextpage muncul data sesuai page 2")
    public void tcc_tele_001_task_follow_up_nextpage_muncul_data_sesuai_page_2() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtNamaPerusahaanPage2(),"rumah 3");
        extentTest.log(LogStatus.PASS,"muncul data sesuai page 2");
    }

    // TASK FOLLOW UP NEXTPAGE 002
    @When("TCC.Tele.002.Task.FollowUp.Nextpage klik task")
    public void tcc_tele_002_task_follow_up_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.FollowUp.Nextpage klik follow up")
    public void tcc_tele_002_task_follow_up_nextpage_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.002.Task.FollowUp.Nextpage klik lastpage")
    public void tcc_tele_002_task_follow_up_nextpage_klik_last_page() {
        taskFollowUp.clickLastPage();
        extentTest.log(LogStatus.PASS,"klik last page");
    }

    @Then("TCC.Tele.002.Task.FollowUp.Nextpage muncul data sesuai lastpage")
    public void tcc_tele_002_task_follow_up_nextpage_muncul_data_sesuai_last_page() {
        hooks.waiting(3);
        Assert.assertEquals(taskFollowUp.getTxtNamaPerusahaanLastPage(),"rumah 3");
        extentTest.log(LogStatus.PASS,"muncul data sesuai last page");
    }

    // TASK FOLLOW UP NEXTPAGE 003
    @When("TCC.Tele.003.Task.FollowUp.Nextpage klik task")
    public void tcc_tele_003_task_follow_up_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.FollowUp.Nextpage klik follow up")
    public void tcc_tele_003_task_follow_up_nextpage_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.003.Task.FollowUp.Nextpage klik first page")
    public void tcc_tele_003_task_follow_up_nextpage_klik_first_page() {
        taskFollowUp.setClickFirstPage();
        extentTest.log(LogStatus.PASS,"klik first page");
    }

    @Then("TCC.Tele.003.Task.FollowUp.Nextpage muncul data sesuai first page")
    public void tcc_tele_003_task_follow_up_nextpage_muncul_data_sesuai_first_page() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtNamaPerusahaanFirstPage(),"tesaja 9");
        extentTest.log(LogStatus.PASS,"muncul data sesuai first page");
    }

    // TASK FOLLOW UP EDIT 001
    @When("TCC.Tele.001.Task.FollowUp.Edit klik task")
    public void tcc_tele_001_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_001_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.001.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_001_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickDataRumah9();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.001.Task.FollowUp.Edit klik add phone")
    public void tcc_tele_001_task_follow_up_edit_klik_add_phone() {
        hooks.waiting(2);
        taskFollowUp.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.001.Task.FollowUp.Edit input nomor telepon")
    public void tcc_tele_001_task_follow_up_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskFollowUp.inputRequestPhone("081728273822");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.001.Task.FollowUp.Edit klik save")
    public void tcc_tele_001_task_follow_up_edit_klik_save() {
        taskFollowUp.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.001.Task.FollowUp.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_001_task_follow_up_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.PASS,"muncul pop up data berhasil diajukan");
    }

    // TASK FOLLOW UP EDIT 002
    @When("TCC.Tele.002.Task.FollowUp.Edit klik task")
    public void tcc_tele_002_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_002_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.002.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_002_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickDataRumah9();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.002.Task.FollowUp.Edit klik add phone")
    public void tcc_tele_002_task_follow_up_edit_klik_add_phone() {
        hooks.waiting(2);
        taskFollowUp.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.002.Task.FollowUp.Edit input nomor telepon")
    public void tcc_tele_002_task_follow_up_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskFollowUp.inputRequestPhone("081728273822234");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.002.Task.FollowUp.Edit klik save")
    public void tcc_tele_002_task_follow_up_edit_klik_save() {
        taskFollowUp.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.002.Task.FollowUp.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_002_task_follow_up_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.FAIL,"Bisa menginput dan mengirim lebih dari 15 karakter");
    }

    // TASK FOLLOW UP EDIT 003
    @When("TCC.Tele.003.Task.FollowUp.Edit klik task")
    public void tcc_tele_003_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_003_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.003.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_003_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickDataRumah9();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.003.Task.FollowUp.Edit klik add phone")
    public void tcc_tele_003_task_follow_up_edit_klik_add_phone() {
        hooks.waiting(2);
        taskFollowUp.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.003.Task.FollowUp.Edit input nomor telepon")
    public void tcc_tele_003_task_follow_up_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskFollowUp.inputRequestPhone("tesajaya");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.003.Task.FollowUp.Edit klik save")
    public void tcc_tele_003_task_follow_up_edit_klik_save() {
        taskFollowUp.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.003.Task.FollowUp.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_003_task_follow_up_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.PASS,"muncul pop up data berhasil diajukan");
    }

    // TASK FOLLOW UP EDIT 004
    @When("TCC.Tele.004.Task.FollowUp.Edit klik task")
    public void tcc_tele_004_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_004_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.004.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_004_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickDataRumah9();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.004.Task.FollowUp.Edit klik add phone")
    public void tcc_tele_004_task_follow_up_edit_klik_add_phone() {
        hooks.waiting(2);
        taskFollowUp.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.004.Task.FollowUp.Edit klik save")
    public void tcc_tele_004_task_follow_up_edit_klik_save() {
        taskFollowUp.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.004.Task.FollowUp.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_004_task_follow_up_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.FAIL,"muncul pop up data berhasil diajukan");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 005
    @When("TCC.Tele.005.Task.FollowUp.Edit klik task")
    public void tcc_tele_005_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.005.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_005_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.005.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_005_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.005.Task.FollowUp.Edit klik submit")
    public void tcc_tele_005_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.005.Task.FollowUp.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_005_task_follow_up_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 006
    @When("TCC.Tele.006.Task.FollowUp.Edit klik task")
    public void tcc_tele_006_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.006.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_006_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.006.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_006_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.006.Task.FollowUp.Edit memilih channel")
    public void tcc_tele_006_task_follow_up_edit_memilih_channel() {
        taskFollowUp.formStatusAcitivity("Call","","","","");
        extentTest.log(LogStatus.PASS,"memilih channel");
    }

    @And("TCC.Tele.006.Task.FollowUp.Edit klik submit")
    public void tcc_tele_006_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.006.Task.FollowUp.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_006_task_follow_up_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 007
    @When("TCC.Tele.007.Task.FollowUp.Edit klik task")
    public void tcc_tele_007_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.007.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_007_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.007.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_007_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.007.Task.FollowUp.Edit memilih channel dan status")
    public void tcc_tele_007_task_follow_up_edit_memilih_channel_dan_status() {
        taskFollowUp.formStatusAcitivity("Call","Tersambung","","","");
        extentTest.log(LogStatus.PASS,"memilih channel dan status");
    }

    @And("TCC.Tele.007.Task.FollowUp.Edit klik submit")
    public void tcc_tele_007_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.007.Task.FollowUp.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_007_task_follow_up_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 008
    @When("TCC.Tele.008.Task.FollowUp.Edit klik task")
    public void tcc_tele_008_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.008.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_008_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.008.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_008_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.008.Task.FollowUp.Edit memilih channel, status dan status call")
    public void tcc_tele_008_task_follow_up_edit_memilih_channel_status_dan_status_call() {
        taskFollowUp.formStatusAcitivity("Call","Tersambung","Diangkat","","");
        extentTest.log(LogStatus.PASS,"memilih channel, status dan status call");
    }

    @And("TCC.Tele.008.Task.FollowUp.Edit klik submit")
    public void tcc_tele_008_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.008.Task.FollowUp.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_008_task_follow_up_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 009
    @When("TCC.Tele.009.Task.FollowUp.Edit klik task")
    public void tcc_tele_009_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.009.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_009_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.009.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_009_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.009.Task.FollowUp.Edit memilih channel, status, status call dan status result")
    public void tcc_tele_009_task_follow_up_edit_memilih_channel_status_status_call_dan_status_result() {
        taskFollowUp.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call dan status result");
    }

    @And("TCC.Tele.009.Task.FollowUp.Edit klik yes")
    public void tcc_tele_009_task_follow_up_edit_klik_yes() {
        taskFollowUp.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.009.Task.FollowUp.Edit klik submit")
    public void tcc_tele_009_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.009.Task.FollowUp.Edit menampilkan status result")
    public void tcc_tele_009_task_follow_up_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtStatusResultFollowUp(),"Follow Up");
        extentTest.log(LogStatus.PASS,"menampilkan status result");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY 010
    @When("TCC.Tele.010.Task.FollowUp.Edit klik task")
    public void tcc_tele_010_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.010.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_010_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.010.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_010_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.010.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason")
    public void tcc_tele_010_task_follow_up_edit_memilih_channel_status_status_call_status_result_dan_reason() {
        taskFollowUp.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","Follow Up");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call, status result dan reason");
    }

    @And("TCC.Tele.010.Task.FollowUp.Edit klik yes")
    public void tcc_tele_010_task_follow_up_edit_klik_yes() {
        taskFollowUp.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.010.Task.FollowUp.Edit klik submit")
    public void tcc_tele_010_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.010.Task.FollowUp.Edit menampilkan status result dan reason")
    public void tcc_tele_010_task_follow_up_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtReasonFollowUp(),"Follow Up");
        extentTest.log(LogStatus.PASS,"menampilkan status result dan reason");
    }

    // TASK FOLLOW UP EDIT STATUS ACTIVITY DAN EDIT PHONE 011
    @When("TCC.Tele.011.Task.FollowUp.Edit klik task")
    public void tcc_tele_011_task_follow_up_edit_klik_task() {
        driver.get(Constants.URL);
        taskFollowUp.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit klik follow up")
    public void tcc_tele_011_task_follow_up_edit_klik_follow_up() {
        taskFollowUp.btnMenuFollowUp();
        extentTest.log(LogStatus.PASS,"klik follow up");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit klik salah satu data")
    public void tcc_tele_011_task_follow_up_edit_klik_salah_satu_data() {
        taskFollowUp.clickPage2();
        hooks.waiting(2);
        taskFollowUp.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit pilih phone")
    public void tcc_tele_011_task_follow_up_edit_pilih_phone() {
        taskFollowUp.selectPhone("085607417494");
        extentTest.log(LogStatus.PASS,"pilih phone");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit memilih channel, status, status call, status result dan reason")
    public void tcc_tele_011_task_follow_up_edit_memilih_channel_status_status_call_status_result_dan_reason() {
        taskFollowUp.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","Follow Up");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call, status result dan reason");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit klik yes")
    public void tcc_tele_011_task_follow_up_edit_klik_yes() {
        taskFollowUp.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.011.Task.FollowUp.Edit klik submit")
    public void tcc_tele_011_task_follow_up_edit_klik_submit() {
        hooks.waiting(2);
        taskFollowUp.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.011.Task.FollowUp.Edit menampilkan status result, reason dan data phone tidak terisi")
    public void tcc_tele_011_task_follow_up_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskFollowUp.getTxtReasonFollowUp(),"Follow Up");
        extentTest.log(LogStatus.FAIL,"Data phone tidak terisi ketika memilih status result Follow Up");
    }
}
