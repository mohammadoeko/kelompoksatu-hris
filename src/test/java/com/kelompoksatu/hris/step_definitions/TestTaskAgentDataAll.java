package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.TaskAgentDataAll;
import com.kelompoksatu.hris.pages.TaskAgentFollowUp;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskAgentDataAll {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private TaskAgentFollowUp taskFollowUp = new TaskAgentFollowUp();

    private TaskAgentDataAll taskAgentDataAl = new TaskAgentDataAll();

    public TestTaskAgentDataAll() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // TASK DATA ALL 001
    @When("TCC.Tele.001.Task.All klik task")
    public void tcc_tele_001_task_all_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskFollowUp.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.All klik data all")
    public void tcc_tele_001_task_all_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @Then("TCC.Tele.001.Task.All menampilkan halaman data all")
    public void tcc_tele_001_task_all_menampilkan_halaman_data_all() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtDataAll(),"DATA ALL");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman data all");
    }

    // TASK DATA ALL SEARCH 001
    @When("TCC.Tele.001.Task.All.Search klik task")
    public void tcc_tele_001_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.All.Search klik data all")
    public void tcc_tele_001_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.001.Task.All.Search input search customer")
    public void tcc_tele_001_task_all_search_input_search_customer() {
        taskAgentDataAl.inputSearchCustomer("bakso.bakar");
        extentTest.log(LogStatus.PASS,"input data di kolom search");
    }

    @And("TCC.Tele.001.Task.All.Search klik search")
    public void tcc_tele_001_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.001.Task.All.Search muncul data sesuai keyword yang dimasukkan")
    public void tcc_tele_001_task_all_search_muncul_data_sesuai_keyword_yang_dimasukkan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"bakso.bakar");
        extentTest.log(LogStatus.PASS,"muncul data sesuai keyword yang dimasukkan");
    }

    // TASK DATA ALL SEARCH 002
    @When("TCC.Tele.002.Task.All.Search klik task")
    public void tcc_tele_002_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.All.Search klik data all")
    public void tcc_tele_002_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.002.Task.All.Search pilih agent")
    public void tcc_tele_002_task_all_search_pilih_agent() {
        taskAgentDataAl.selectSearchAgent("AGENT01");
        extentTest.log(LogStatus.PASS,"pilih agent");
    }

    @And("TCC.Tele.002.Task.All.Search klik search")
    public void tcc_tele_002_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.002.Task.All.Search muncul data sesuai agent dipilih")
    public void tcc_tele_002_task_all_search_muncul_data_sesuai_agent_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchAgent(),"bakso.bakar");
        extentTest.log(LogStatus.PASS,"muncul data sesuai agent dipilih");
    }

    // TASK DATA ALL SEARCH 003
    @When("TCC.Tele.003.Task.All.Search klik task")
    public void tcc_tele_003_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.All.Search klik data all")
    public void tcc_tele_003_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.003.Task.All.Search pilih status")
    public void tcc_tele_003_task_all_search_pilih_status() {
        taskAgentDataAl.selectSearchStatus("Berhasil");
        extentTest.log(LogStatus.PASS,"pilih status");
    }

    @And("TCC.Tele.003.Task.All.Search klik search")
    public void tcc_tele_003_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.003.Task.All.Search muncul data sesuai status dipilih")
    public void tcc_tele_003_task_all_search_muncul_data_sesuai_status_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchStatus(),"tesaja 5");
        extentTest.log(LogStatus.PASS,"muncul data sesuai status dipilih");
    }

    // TASK DATA ALL SEARCH 004
    @When("TCC.Tele.004.Task.All.Search klik task")
    public void tcc_tele_004_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.All.Search klik data all")
    public void tcc_tele_004_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.004.Task.All.Search input search customer")
    public void tcc_tele_004_task_all_search_input_search_customer() {
        taskAgentDataAl.inputSearchCustomer("bakso.bakar");
        extentTest.log(LogStatus.PASS,"input search customer");
    }

    @And("TCC.Tele.004.Task.All.Search pilih agent")
    public void tcc_tele_004_task_all_search_pilih_agent() {
        taskAgentDataAl.selectSearchAgent("AGENT01");
        extentTest.log(LogStatus.PASS,"pilih agent");
    }

    @And("TCC.Tele.004.Task.All.Search klik search")
    public void tcc_tele_004_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.004.Task.All.Search muncul data sesuai input customer dan agent dipilih")
    public void tcc_tele_004_task_all_search_muncul_data_sesuai_input_customer_dan_agent_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"bakso.bakar");
        extentTest.log(LogStatus.PASS,"muncul data sesuai input customer dan agent dipilih");
    }

    // TASK DATA ALL SEARCH 005
    @When("TCC.Tele.005.Task.All.Search klik task")
    public void tcc_tele_005_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.005.Task.All.Search klik data all")
    public void tcc_tele_005_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.005.Task.All.Search pilih status")
    public void tcc_tele_005_task_all_search_pilih_status() {
        taskAgentDataAl.selectSearchStatus("Berhasil");
        extentTest.log(LogStatus.PASS,"pilih status");
    }

    @And("TCC.Tele.005.Task.All.Search pilih agent")
    public void tcc_tele_005_task_all_search_pilih_agent() {
        taskAgentDataAl.selectSearchAgent("AGENT01");
        extentTest.log(LogStatus.PASS,"pilih agent");
    }

    @And("TCC.Tele.005.Task.All.Search klik search")
    public void tcc_tele_005_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.005.Task.All.Search muncul data sesuai status dipilih dan agent dipilih")
    public void tcc_tele_005_task_all_search_muncul_data_sesuai_status_dipilih_dan_agent_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchStatus(),"tesaja 5");
        extentTest.log(LogStatus.PASS,"muncul data sesuai status dipilih dan agent dipilih");
    }

    // TASK DATA ALL SEARCH 006
    @When("TCC.Tele.006.Task.All.Search klik task")
    public void tcc_tele_006_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.006.Task.All.Search klik data all")
    public void tcc_tele_006_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.006.Task.All.Search input search customer")
    public void tcc_tele_006_task_all_search_input_search_customer() {
        taskAgentDataAl.inputSearchCustomer("cireng_udin");
        extentTest.log(LogStatus.PASS,"input search customer");
    }

    @And("TCC.Tele.006.Task.All.Search pilih status")
    public void tcc_tele_006_task_all_search_pilih_status() {
        taskAgentDataAl.selectSearchStatus("Berhasil");
        extentTest.log(LogStatus.PASS,"pilih status");
    }

    @And("TCC.Tele.006.Task.All.Search klik search")
    public void tcc_tele_006_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.006.Task.All.Search muncul data sesuai input customer dan status dipilih")
    public void tcc_tele_006_task_all_search_muncul_data_sesuai_input_customer_dan_status_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"cireng_udin");
        extentTest.log(LogStatus.PASS,"muncul data sesuai input customer status dipilih");
    }

    // TASK DATA ALL SEARCH 007
    @When("TCC.Tele.007.Task.All.Search klik task")
    public void tcc_tele_007_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.007.Task.All.Search klik data all")
    public void tcc_tele_007_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.007.Task.All.Search input search customer")
    public void tcc_tele_007_task_all_search_input_search_customer() {
        taskAgentDataAl.inputSearchCustomer("cireng_udin");
        extentTest.log(LogStatus.PASS,"input search customer");
    }

    @And("TCC.Tele.007.Task.All.Search pilih agent")
    public void tcc_tele_007_task_all_search_pilih_agent() {
        taskAgentDataAl.selectSearchAgent("AGENT01");
        extentTest.log(LogStatus.PASS,"pilih agent");
    }

    @And("TCC.Tele.007.Task.All.Search pilih status")
    public void tcc_tele_007_task_all_search_pilih_status() {
        taskAgentDataAl.selectSearchStatus("Berhasil");
        extentTest.log(LogStatus.PASS,"pilih status");
    }

    @And("TCC.Tele.007.Task.All.Search klik search")
    public void tcc_tele_007_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.007.Task.All.Search muncul data sesuai input customer, agent dan status dipilih")
    public void tcc_tele_007_task_all_search_muncul_data_sesuai_input_customer_agent_dan_status_dipilih() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"cireng_udin");
        extentTest.log(LogStatus.PASS,"muncul data sesuai input customer, agent dan status dipilih");
    }

    // TASK DATA ALL SEARCH 008
    @When("TCC.Tele.008.Task.All.Search klik task")
    public void tcc_tele_008_task_all_search_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.008.Task.All.Search klik data all")
    public void tcc_tele_008_task_all_search_klik_data_all() {
        hooks.waiting(2);
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.008.Task.All.Search klik search")
    public void tcc_tele_008_task_all_search_klik_search() {
        taskAgentDataAl.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.008.Task.All.Search menampilkan semua data")
    public void tcc_tele_008_task_all_search_menampilkan_semua_data() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"BahlulElektronik");
        extentTest.log(LogStatus.PASS,"menampilkan semua data");
    }

    // TASK DATA ALL SHOWPAGE 001
    @When("TCC.Tele.001.Task.All.Showpage klik task")
    public void tcc_tele_001_task_all_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.All.Showpage klik data all")
    public void tcc_tele_001_task_all_showpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.001.Task.All.Showpage pilih entries 10")
    public void tcc_tele_001_task_all_showpage_pilih_entries_10() {
        hooks.waiting(1);
        taskAgentDataAl.selectShowEntries("10");
        extentTest.log(LogStatus.PASS,"pilih entries 10");
    }

    @Then("TCC.Tele.001.Task.All.Showpage menampilkan data entries 10")
    public void tcc_tele_001_task_all_showpage_menampilkan_data_entries_10() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtShowEntries10(),"10");
        extentTest.log(LogStatus.PASS,"menampilkan data entries 10");
    }

    // TASK DATA ALL SHOWPAGE 002
    @When("TCC.Tele.002.Task.All.Showpage klik task")
    public void tcc_tele_002_task_all_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.All.Showpage klik data all")
    public void tcc_tele_002_task_all_showpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.002.Task.All.Showpage pilih entries 25")
    public void tcc_tele_002_task_all_showpage_pilih_entries_25() {
        hooks.waiting(1);
        taskAgentDataAl.selectShowEntries("25");
        extentTest.log(LogStatus.PASS,"pilih entries 25");
    }

    @Then("TCC.Tele.002.Task.All.Showpage menampilkan data entries 25")
    public void tcc_tele_002_task_all_showpage_menampilkan_data_entries_25() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtShowEntries25(),"25");
        extentTest.log(LogStatus.PASS,"menampilkan data entries 25");
    }

    // TASK DATA ALL SHOWPAGE 003
    @When("TCC.Tele.003.Task.All.Showpage klik task")
    public void tcc_tele_003_task_all_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.All.Showpage klik data all")
    public void tcc_tele_003_task_all_showpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.003.Task.All.Showpage pilih entries 50")
    public void tcc_tele_003_task_all_showpage_pilih_entries_50() {
        hooks.waiting(1);
        taskAgentDataAl.selectShowEntries("50");
        extentTest.log(LogStatus.PASS,"pilih entries 50");
    }

    @Then("TCC.Tele.003.Task.All.Showpage menampilkan data entries 50")
    public void tcc_tele_003_task_all_showpage_menampilkan_data_entries_50() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtShowEntries50(),"50");
        extentTest.log(LogStatus.PASS,"menampilkan data entries 50");
    }

    // TASK DATA ALL SHOWPAGE 004
    @When("TCC.Tele.004.Task.All.Showpage klik task")
    public void tcc_tele_004_task_all_showpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.All.Showpage klik data all")
    public void tcc_tele_004_task_all_showpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.004.Task.All.Showpage pilih entries 100")
    public void tcc_tele_004_task_all_showpage_pilih_entries_100() {
        hooks.waiting(1);
        taskAgentDataAl.selectShowEntries("100");
        extentTest.log(LogStatus.PASS,"pilih entries 100");
    }

    @Then("TCC.Tele.004.Task.All.Showpage menampilkan data entries 100")
    public void tcc_tele_004_task_all_showpage_menampilkan_data_entries_100() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtShowEntries100(),"100");
        extentTest.log(LogStatus.PASS,"menampilkan data entries 100");
    }

    // TASK DATA ALL NEXTPAGE 001
    @When("TCC.Tele.001.Task.All.NextPage klik task")
    public void tcc_tele_001_task_all_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.All.NextPage klik data all")
    public void tcc_tele_001_task_all_nextpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.001.Task.All.NextPage klik page 2")
    public void tcc_tele_001_task_all_nextpage_klik_page_2() {
        hooks.waiting(2);
        taskAgentDataAl.clickPage2();
        extentTest.log(LogStatus.PASS,"klik page 2");
    }

    @Then("TCC.Tele.001.Task.All.NextPage menampilkan data page 2")
    public void tcc_tele_001_task_all_nextpage_menampilkan_data_page_2() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtShowPage2(),"caca_hijab");
        extentTest.log(LogStatus.PASS,"menampilkan data page 2");
    }

    // TASK DATA ALL NEXTPAGE 002
    @When("TCC.Tele.002.Task.All.NextPage klik task")
    public void tcc_tele_002_task_all_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.All.NextPage klik data all")
    public void tcc_tele_002_task_all_nextpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.002.Task.All.NextPage klik lastpage")
    public void tcc_tele_002_task_all_nextpage_klik_last_page() {
        hooks.waiting(2);
        taskAgentDataAl.clickLastPage();
        extentTest.log(LogStatus.PASS,"klik last page");
    }

    @Then("TCC.Tele.002.Task.All.NextPage menampilkan data lastpage")
    public void tcc_tele_002_task_all_nextpage_menampilkan_data_lastpage() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"mas harun 3");
        extentTest.log(LogStatus.PASS,"menampilkan data lastpage");
    }

    // TASK DATA ALL NEXTPAGE 003
    @When("TCC.Tele.003.Task.All.NextPage klik task")
    public void tcc_tele_003_task_all_nextpage_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.All.NextPage klik data all")
    public void tcc_tele_003_task_all_nextpage_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.003.Task.All.NextPage klik first page")
    public void tcc_tele_003_task_all_nextpage_klik_first_page() {
        hooks.waiting(2);
        taskAgentDataAl.clickFirstPage();
        extentTest.log(LogStatus.PASS,"klik first page");
    }

    @Then("TCC.Tele.003.Task.All.NextPage menampilkan data first page")
    public void tcc_tele_003_task_all_nextpage_menampilkan_data_first_page() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtSearchCustomer(),"BahlulElektronik");
        extentTest.log(LogStatus.PASS,"menampilkan data first page");
    }

    // TASK ALL EDIT 001
    @When("TCC.Tele.001.Task.All.Edit klik task")
    public void tcc_tele_001_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.001.Task.All.Edit klik data all")
    public void tcc_tele_001_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.001.Task.All.Edit klik salah satu data")
    public void tcc_tele_001_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.001.Task.All.Edit klik add phone")
    public void tcc_tele_001_task_all_edit_klik_add_phone() {
        hooks.waiting(2);
        taskAgentDataAl.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.001.Task.All.Edit input nomor telepon")
    public void tcc_tele_001_task_all_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskAgentDataAl.inputRequestPhone("081728273822");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.001.Task.All.Edit klik save")
    public void tcc_tele_001_task_all_edit_klik_save() {
        taskAgentDataAl.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.001.Task.All.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_001_task_all_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.PASS,"muncul pop up data berhasil diajukan");
    }

    // TASK FOLLOW UP EDIT 002
    @When("TCC.Tele.002.Task.All.Edit klik task")
    public void tcc_tele_002_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.002.Task.All.Edit klik data all")
    public void tcc_tele_002_task_all_edit_klik_follow_up() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.002.Task.All.Edit klik salah satu data")
    public void tcc_tele_002_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.002.Task.All.Edit klik add phone")
    public void tcc_tele_002_task_all_edit_klik_add_phone() {
        hooks.waiting(2);
        taskAgentDataAl.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.002.Task.All.Edit input nomor telepon")
    public void tcc_tele_002_task_all_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskAgentDataAl.inputRequestPhone("081728273822234");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.002.Task.All.Edit klik save")
    public void tcc_tele_002_task_all_edit_klik_save() {
        taskAgentDataAl.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.002.Task.All.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_002_task_all_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.FAIL,"Bisa menginput dan mengirim lebih dari 15 karakter");
    }

    // TASK All EDIT 003
    @When("TCC.Tele.003.Task.All.Edit klik task")
    public void tcc_tele_003_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.003.Task.All.Edit klik data all")
    public void tcc_tele_003_task_all_edit_klik_follow_up() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.003.Task.All.Edit klik salah satu data")
    public void tcc_tele_003_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.003.Task.All.Edit klik add phone")
    public void tcc_tele_003_task_all_edit_klik_add_phone() {
        hooks.waiting(2);
        taskAgentDataAl.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.003.Task.All.Edit input nomor telepon")
    public void tcc_tele_003_task_all_edit_input_nomor_telepon() {
        hooks.waiting(2);
        taskAgentDataAl.inputRequestPhone("tesajaya");
        extentTest.log(LogStatus.PASS,"input nomor telepon");
    }

    @And("TCC.Tele.003.Task.All.Edit klik save")
    public void tcc_tele_003_task_all_edit_klik_save() {
        taskAgentDataAl.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.003.Task.All.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_003_task_all_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(3);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.PASS,"muncul pop up data berhasil diajukan");
    }

    // TASK ALL EDIT 004
    @When("TCC.Tele.004.Task.All.Edit klik task")
    public void tcc_tele_004_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.004.Task.All.Edit klik data all")
    public void tcc_tele_004_task_all_edit_klik_follow_up() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.004.Task.All.Edit klik salah satu data")
    public void tcc_tele_004_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.004.Task.All.Edit klik add phone")
    public void tcc_tele_004_task_all_edit_klik_add_phone() {
        hooks.waiting(2);
        taskAgentDataAl.btnAddPhone();
        extentTest.log(LogStatus.PASS,"klik add phone");
    }

    @And("TCC.Tele.004.Task.All.Edit klik save")
    public void tcc_tele_004_task_all_edit_klik_save() {
        taskAgentDataAl.btnSave();
        extentTest.log(LogStatus.PASS,"klik save");
    }

    @Then("TCC.Tele.004.Task.All.Edit muncul pop up data berhasil diajukan")
    public void tcc_tele_004_task_all_edit_muncul_pop_up_data_berhasil_diajukan() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Data Berhasil Diajukan!");
        extentTest.log(LogStatus.FAIL,"muncul pop up data berhasil diajukan");
    }

    // TASK ALL EDIT STATUS ACTIVITY 005
    @When("TCC.Tele.005.Task.All.Edit klik task")
    public void tcc_tele_005_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.005.Task.All.Edit klik data all")
    public void tcc_tele_005_task_follow_up_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.005.Task.All.Edit klik salah satu data")
    public void tcc_tele_005_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.005.Task.All.Edit klik submit")
    public void tcc_tele_005_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.005.Task.All.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_005_task_all_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK ALL EDIT STATUS ACTIVITY 006
    @When("TCC.Tele.006.Task.All.Edit klik task")
    public void tcc_tele_006_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.006.Task.All.Edit klik data all")
    public void tcc_tele_006_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.006.Task.All.Edit klik salah satu data")
    public void tcc_tele_006_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.006.Task.All.Edit memilih channel")
    public void tcc_tele_006_task_all_edit_memilih_channel() {
        taskAgentDataAl.formStatusAcitivity("Call","","","","");
        extentTest.log(LogStatus.PASS,"memilih channel");
    }

    @And("TCC.Tele.006.Task.All.Edit klik submit")
    public void tcc_tele_006_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.006.Task.All.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_006_task_all_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK ALL EDIT STATUS ACTIVITY 007
    @When("TCC.Tele.007.Task.All.Edit klik task")
    public void tcc_tele_007_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.007.Task.All.Edit klik data all")
    public void tcc_tele_007_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.007.Task.All.Edit klik salah satu data")
    public void tcc_tele_007_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.007.Task.All.Edit memilih channel dan status")
    public void tcc_tele_007_task_all_edit_memilih_channel_dan_status() {
        taskAgentDataAl.formStatusAcitivity("Call","Tersambung","","","");
        extentTest.log(LogStatus.PASS,"memilih channel dan status");
    }

    @And("TCC.Tele.007.Task.All.Edit klik submit")
    public void tcc_tele_007_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.007.Task.All.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_007_task_all_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK ALL EDIT STATUS ACTIVITY 008
    @When("TCC.Tele.008.Task.All.Edit klik task")
    public void tcc_tele_008_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.008.Task.All.Edit klik data all")
    public void tcc_tele_008_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.008.Task.All.Edit klik salah satu data")
    public void tcc_tele_008_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.008.Task.All.Edit memilih channel, status dan status call")
    public void tcc_tele_008_task_all_edit_memilih_channel_status_dan_status_call() {
        taskAgentDataAl.formStatusAcitivity("Call","Tersambung","Diangkat","","");
        extentTest.log(LogStatus.PASS,"memilih channel, status dan status call");
    }

    @And("TCC.Tele.008.Task.All.Edit klik submit")
    public void tcc_tele_008_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.008.Task.All.Edit muncul pop up status result wajib diisi")
    public void tcc_tele_008_task_all_edit_muncul_pop_up_status_result_wajib_diisi() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtPopupInformation(),"Status Result Wajib Diisi !");
        extentTest.log(LogStatus.PASS,"muncul pop up status result wajib diisi");
    }

    // TASK ALL EDIT STATUS ACTIVITY 009
    @When("TCC.Tele.009.Task.All.Edit klik task")
    public void tcc_tele_009_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.009.Task.All.Edit klik data all")
    public void tcc_tele_009_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.009.Task.All.Edit klik salah satu data")
    public void tcc_tele_009_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.009.Task.All.Edit memilih channel, status, status call dan status result")
    public void tcc_tele_009_task_all_edit_memilih_channel_status_status_call_dan_status_result() {
        taskAgentDataAl.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call dan status result");
    }

    @And("TCC.Tele.009.Task.All.Edit klik yes")
    public void tcc_tele_009_task_all_edit_klik_yes() {
        taskAgentDataAl.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.009.Task.All.Edit klik submit")
    public void tcc_tele_009_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.009.Task.All.Edit menampilkan status result")
    public void tcc_tele_009_task_all_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtStatusResultFollowUp(),"Follow Up");
        extentTest.log(LogStatus.PASS,"menampilkan status result");
    }

    // TASK ALL EDIT STATUS ACTIVITY 010
    @When("TCC.Tele.010.Task.All.Edit klik task")
    public void tcc_tele_010_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.010.Task.All.Edit klik data all")
    public void tcc_tele_010_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.010.Task.All.Edit klik salah satu data")
    public void tcc_tele_010_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.010.Task.All.Edit memilih channel, status, status call, status result dan reason")
    public void tcc_tele_010_task_all_edit_memilih_channel_status_status_call_status_result_dan_reason() {
        taskAgentDataAl.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","Follow Up");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call, status result dan reason");
    }

    @And("TCC.Tele.010.Task.All.Edit klik yes")
    public void tcc_tele_010_task_all_edit_klik_yes() {
        taskAgentDataAl.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.010.Task.All.Edit klik submit")
    public void tcc_tele_010_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.010.Task.All.Edit menampilkan status result dan reason")
    public void tcc_tele_010_task_all_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtStatusResultFollowUp(),"Follow Up");
        extentTest.log(LogStatus.PASS,"menampilkan status result dan reason");
    }

    // TASK ALL EDIT STATUS ACTIVITY DAN EDIT PHONE 011
    @When("TCC.Tele.011.Task.All.Edit klik task")
    public void tcc_tele_011_task_all_edit_klik_task() {
        driver.get(Constants.URL);
        taskAgentDataAl.btnOkWelcome();
        taskAgentDataAl.clickTask();
        extentTest.log(LogStatus.PASS, "Klik task");
    }

    @And("TCC.Tele.011.Task.All.Edit klik data all")
    public void tcc_tele_011_task_all_edit_klik_data_all() {
        taskAgentDataAl.btnMenuDataAll();
        extentTest.log(LogStatus.PASS,"klik data all");
    }

    @And("TCC.Tele.011.Task.All.Edit klik salah satu data")
    public void tcc_tele_011_task_all_edit_klik_salah_satu_data() {
        taskAgentDataAl.clickLastPage();
        hooks.waiting(2);
        taskAgentDataAl.clickMasHarun3();
        extentTest.log(LogStatus.PASS,"klik salah satu data");
    }

    @And("TCC.Tele.011.Task.All.Edit pilih phone")
    public void tcc_tele_011_task_all_edit_pilih_phone() {
        taskAgentDataAl.selectPhone("085607417494");
        extentTest.log(LogStatus.PASS,"pilih phone");
    }

    @And("TCC.Tele.011.Task.All.Edit memilih channel, status, status call, status result dan reason")
    public void tcc_tele_011_task_all_edit_memilih_channel_status_status_call_status_result_dan_reason() {
        taskAgentDataAl.formStatusAcitivity("Call","Tersambung","Diangkat","Follow Up","Follow Up");
        extentTest.log(LogStatus.PASS,"memilih channel, status, status call, status result dan reason");
    }

    @And("TCC.Tele.011.Task.All.Edit klik yes")
    public void tcc_tele_011_task_all_edit_klik_yes() {
        taskAgentDataAl.btnYesKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik yes");
    }

    @And("TCC.Tele.011.Task.All.Edit klik submit")
    public void tcc_tele_011_task_all_edit_klik_submit() {
        hooks.waiting(2);
        taskAgentDataAl.btnSubmit();
        extentTest.log(LogStatus.PASS,"klik submit");
    }

    @Then("TCC.Tele.011.Task.All.Edit menampilkan status result, reason dan data phone tidak terisi")
    public void tcc_tele_011_task_all_edit_menampilkan_status_result() {
        hooks.waiting(2);
        Assert.assertEquals(taskAgentDataAl.getTxtReasonFollowUp(),"Follow Up");
        extentTest.log(LogStatus.FAIL,"Data phone tidak terisi ketika memilih status result Follow Up");
    }
}
