package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.DistributeData;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDistributeData {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private DistributeData distributeData = new DistributeData();

    private UploadData uploadData = new UploadData();

    public TestDistributeData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //add data distribusi
    @When("TCC.Tele.Distribusi.001 klik data")
    public void tcc_tele_distribusi_001_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.001 klik distribusi data")
    public void tcc_tele_distribusi_001_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.distribusi.001 checklist distribusi ke")
    public void tcc_tele_distribusi_001_checklist_distribusi_ke() {
        hooks.waiting(3);
        distributeData.checkboxDistribusiKe();
        extentTest.log(LogStatus.PASS,"checklist distribusi ke");
        hooks.waiting(3);
    }

    @And("TCC.Tele.distribusi.001 input jumlah per agent")
    public void tcc_tele_distribusi_001_input_jumlah_per_agent() {
        distributeData.jumlahPerAgent("7");
        extentTest.log(LogStatus.PASS,"input jumlah per agent");
    }

    @And("TCC.Tele.distribusi.001 klik distribusi")
    public void tcc_tele_distribusi_001_klik_distribusi() {
        distributeData.btnDistribusi();
        extentTest.log(LogStatus.PASS,"klik distribusi");
    }

    @And("TCC.Tele.distribusi.001 tekan ya pada distribusi pada kotak dialog informasi")
    public void tcc_tele_distribusi_001_tekan_ya_pada_distribusi_kotak_dialog_informasi() {
        distributeData.btnYaDialogDistribusi();
        extentTest.log(LogStatus.PASS,"ya");
    }


    @Then ("TCC.Tele.distribusi.001 kembali ke halaman distribusi data")
    public void tcc_tele_distribusi_001_kembali_ke_halaman_distribusi_data() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtHalamandistribusidata(),"Nama Perusahaan");
        extentTest.log(LogStatus.PASS,"Nama Perusahaan");
    }

    // view data distribusi
    @When("TCC.Tele.Distribusi.002 klik data")
    public void tcc_tele_distribusi_002_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.002 klik distribute data")
    public void tcc_tele_distribusi_002_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.002 checklist field status")
    public void tcc_tele_distribusi_002_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.002 checklist field buket data")
    public void tcc_tele_distribusi_002_checklist_field_buket_data() {
        // for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        // }
    }

    @And("TCC.Tele.Distribusi.002 klik button view")
    public void tcc_tele_distribusi_002_klik_button_view() {

        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @Then("TCC.Tele.distribusi.002 menampilkan halaman distribusi data")
    public void tcc_tele_distribusi_002_menampilkan_halaman_distribusi_data() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtViewDistribusiData(),"outfit.bekasan");
        extentTest.log(LogStatus.PASS,"menampilkan halaman distribusi data view");

    }

    // page ke 2 distribusi data

    @When("TCC.Tele.Distribusi.003 klik data")
    public void tcc_tele_distribusi_003_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.003 klik distribute data")
    public void tcc_tele_distribusi_003_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.003 checklist field status")
    public void tcc_tele_distribusi_003_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.003 checklist field buket data")
    public void tcc_tele_distribusi_003_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        //  }
    }

    @And("TCC.Tele.Distribusi.003 klik button view")
    public void tcc_tele_distribusi_003_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");

    }

    @And ("TCC.Tele.distribusi.003 klik page 2")
    public void tcc_tele_distribusi_003_klik_page_2() {
        hooks.waiting(5);
        distributeData.btnPage2Distribusi();
        extentTest.log(LogStatus.PASS,"klik button page 2");
    }

    @Then("TCC.Tele.distribusi.003 menampilkan halaman ke 2")
    public void tcc_tele_distribusi_003_menampilkan_halaman_ke_2() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtPage2Distribusi(),"cireng_udin");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_ke_2");
        hooks.waiting(3);

    }

    // test last page

    @When("TCC.Tele.Distribusi.004 klik data")
    public void tcc_tele_distribusi_004_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.004 klik distribute data")
    public void tcc_tele_distribusi_004_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.004 checklist field status")
    public void tcc_tele_distribusi_004_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.004 checklist field buket data")
    public void tcc_tele_distribusi_004_checklist_field_buket_data() {
        // for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        // }
    }

    @And("TCC.Tele.Distribusi.004 klik button view")
    public void tcc_tele_distribusi_004_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.004 klik last page")
    public void tcc_tele_distribusi_004_klik_last_page() {
        hooks.waiting(5);
        distributeData.ClickBtnLastPageDistribusi();
        extentTest.log(LogStatus.PASS,"klik button last_page");
    }

    @Then("TCC.Tele.distribusi.004 menampilkan halaman last page")
    public void tcc_tele_distribusi_004_menampilkan_halaman_last_page() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtLastPageDistribusi(),"bulusia 3");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_last_page");
    }


    // first page

    @When("TCC.Tele.Distribusi.005 klik data")
    public void tcc_tele_distribusi_005_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.005 klik distribute data")
    public void tcc_tele_distribusi_005_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.005 checklist field status")
    public void tcc_tele_distribusi_005_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.005 checklist field buket data")
    public void tcc_tele_distribusi_005_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        //}
    }

    @And("TCC.Tele.Distribusi.005 klik button view")
    public void tcc_tele_distribusi_005_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.005 klik last page")
    public void tcc_tele_distribusi_005_klik_last_page() {
        hooks.waiting(5);
        distributeData.ClickBtnLastPageDistribusi();
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @And ("TCC.Tele.distribusi.005 klik first page")
    public void tcc_tele_distribusi_005_klik_first_page() {
        hooks.waiting(5);
        distributeData.btnFirstPage();
        extentTest.log(LogStatus.PASS,"klik button last_page");
    }

    @Then("TCC.Tele.distribusi.005 menampilkan halaman first page")
    public void tcc_tele_distribusi_005_menampilkan_halaman_first_page() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtFirstPageDistribusi(),"xiaomay");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
    }


    // show entrie 25

    @When("TCC.Tele.Distribusi.006 klik data")
    public void tcc_tele_distribusi_006_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.006 klik distribute data")
    public void tcc_tele_distribusi_006_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.006 checklist field status")
    public void tcc_tele_distribusi_006_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.006 checklist field buket data")
    public void tcc_tele_distribusi_006_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        //}
    }

    @And("TCC.Tele.Distribusi.006 klik button view")
    public void tcc_tele_distribusi_006_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.006 klik page 25")
    public void tcc_tele_distribusi_006_klik_page_25() {
        hooks.waiting(5);
        distributeData.selectShowPageDistribusi("25");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.Tele.distribusi.006 menampilkan data entries 25")
    public void tcc_tele_distribusi_006_menampilkan_data_entries_25() {
        Assert.assertEquals(distributeData.getTxtShowEntries25Distribusidata(),"jenglotSparePart");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    // data entries 50

    @When("TCC.Tele.Distribusi.007 klik data")
    public void tcc_tele_distribusi_007_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.007 klik distribute data")
    public void tcc_tele_distribusi_007_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.007 checklist field status")
    public void tcc_tele_distribusi_007_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.007 checklist field buket data")
    public void tcc_tele_distribusi_007_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        // }
    }

    @And("TCC.Tele.Distribusi.007 klik button view")
    public void tcc_tele_distribusi_007_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.007 klik page 50")
    public void tcc_tele_distribusi_007_klik_page_50() {
        hooks.waiting(3);
        distributeData.selectShowPageDistribusi("50");
        extentTest.log(LogStatus.PASS,"show entries 50");
        hooks.waiting(3);
    }

    @Then("TCC.Tele.distribusi.007 menampilkan data entries 50")
    public void tcc_tele_distribusi_007_menampilkan_data_entries_50() {
        Assert.assertEquals(distributeData.getTxtShowEntries50Distribusidata(),"xiaomay");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    //data entries 100

    @When("TCC.Tele.Distribusi.008 klik data")
    public void tcc_tele_distribusi_008_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.008 klik distribute data")
    public void tcc_tele_distribusi_008_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.008 checklist field status")
    public void tcc_tele_distribusi_008_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.008 checklist field buket data")
    public void tcc_tele_distribusi_008_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        //}
    }

    @And("TCC.Tele.Distribusi.008 klik button view")
    public void tcc_tele_distribusi_008_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.008 klik page 100")
    public void tcc_tele_distribusi_008_klik_page_100() {
        hooks.waiting(5);
        distributeData.selectShowPageDistribusi("100");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.Tele.distribusi.008 menampilkan data entries 100")
    public void tcc_tele_distribusi_008_menampilkan_data_entries_100() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtShowEntries100Distribusidata(),"carroline 10");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    // dataentries 500

    @When("TCC.Tele.Distribusi.009 klik data")
    public void tcc_tele_distribusi_009_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.009 klik distribute data")
    public void tcc_tele_distribusi_009_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.009 checklist field status")
    public void tcc_tele_distribusi_009_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.009 checklist field buket data")
    public void tcc_tele_distribusi_009_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        // }
    }

    @And("TCC.Tele.Distribusi.009 klik button view")
    public void tcc_tele_distribusi_009_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.009 klik page 500")
    public void tcc_tele_distribusi_009_klik_page_500() {
        hooks.waiting(5);
        distributeData.selectShowPageDistribusi("500");
        extentTest.log(LogStatus.PASS,"klik button last_page");
    }

    @Then("TCC.Tele.distribusi.008 menampilkan data entries 500")
    public void tcc_tele_distribusi_009_menampilkan_data_entries_500() {
        hooks.waiting(5);
        Assert.assertEquals(distributeData.getTxtShowEntries500Distribusidata(),"bulusia 7");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    // test case 10 entries

    @When("TCC.Tele.Distribusi.010 klik data")
    public void tcc_tele_distribusi_010_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.Distribusi.010 klik distribute data")
    public void tcc_tele_distribusi_010_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.Distribusi.010 checklist field status")
    public void tcc_tele_distribusi_010_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.Distribusi.010 checklist field buket data")
    public void tcc_tele_distribusi_010_checklist_field_buket_data() {
        //for (int i = 0; i < 2; i++) {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"checklist field buket data");
        //}
    }

    @And("TCC.Tele.Distribusi.010 klik button view")
    public void tcc_tele_distribusi_010_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @And ("TCC.Tele.distribusi.010 klik page 10")
    public void tcc_tele_distribusi_010_klik_page_10() {
        distributeData.selectShowPageDistribusi("10");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.Tele.distribusi.010 Showpage menampilkan data sampai 10")
    public void tcc_tele_distribusi_010_menampilkan_data_entries_10() {
        Assert.assertEquals(distributeData.getTxtViewDistribusiData(),"outfit.bekasan");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }


    // DISTRIBUTE DATA UNCHECKLIST STATUS DAN UNCHECKLIST BUKET DATA 011
    @When("TCC.Tele.011 klik data")
    public void tcc_tele_011_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.011 klik distribute data")
    public void tcc_tele_011_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.011 unchecklist field status")
    public void tcc_tele_011_unchecklist_field_status() {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"unchecklist field status");
    }

    @And("TCC.Tele.011 unchecklist field buket data")
    public void tcc_tele_011_unchecklist_field_buket_data() {
        distributeData.checkboxBuketData();
        extentTest.log(LogStatus.PASS,"unchecklist field buket data");
    }

    @And("Tcc.Tele.011 klik button view")
    public void tcc_tele_011_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @Then("TCC.Tele.011 Menampilkan pop up Status Tidak Boleh Kosong")
    public void tcc_tele_011_menampilkan_popup_status_tidak_boleh_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Status Tidak Boleh Kosong");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Status Tidak Boleh Kosong");
    }

    // DISTRIBUTE DATA UNCHECKLIST STATUS 012
    @When("TCC.Tele.012 klik data")
    public void tcc_tele_012_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.012 klik distribute data")
    public void tcc_tele_012_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.012 unchecklist field status")
    public void tcc_tele_012_unchecklist_field_status() {
        distributeData.checkboxStatus();
        extentTest.log(LogStatus.PASS,"unchecklist field status");
    }

    @And("TCC.Tele.012 checklist field buket data")
    public void tcc_tele_012_checklist_field_buket_data() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxBuketData();
            extentTest.log(LogStatus.PASS,"checklist field buket data");
        }
    }

    @And("Tcc.Tele.012 klik button view")
    public void tcc_tele_012_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @Then("TCC.Tele.012 Menampilkan pop up Status Tidak Boleh Kosong")
    public void tcc_tele_012_menampilkan_popup_status_tidak_boleh_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Status Tidak Boleh Kosong");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Status Tidak Boleh Kosong");
    }

    // DISTRIBUTE DATA UNCHECKLIST BUKET DATA 013
    @When("TCC.Tele.013 klik data")
    public void tcc_tele_013_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.013 klik distribute data")
    public void tcc_tele_013_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("TCC.Tele.013 checklist field status")
    public void tcc_tele_013_checklist_field_status() {
        for (int i = 0; i < 2; i++) {
            distributeData.checkboxStatus();
            extentTest.log(LogStatus.PASS,"checklist field status");
        }
    }

    @And("TCC.Tele.013 unchecklist field buket data")
    public void tcc_tele_013_unchecklist_field_buket_data() {
            distributeData.checkboxBuketData();
            extentTest.log(LogStatus.PASS,"unchecklist field buket data");
    }

    @And("Tcc.Tele.013 klik button view")
    public void tcc_tele_013_klik_button_view() {
        distributeData.btnView();
        extentTest.log(LogStatus.PASS,"klik button vire");
    }

    @Then("TCC.Tele.013 Menampilkan pop up Status Tidak Boleh Kosong")
    public void tcc_tele_013_menampilkan_popup_status_tidak_boleh_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Buket Data Tidak Boleh Kosong");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Status Tidak Boleh Kosong");
    }

    // DISTRIBUTE DATA KOSONGKAN DISTRIBUSI DAN JUMLAH AGENT 014
    @When("TCC.Tele.014 klik data")
    public void tcc_tele_014_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.014 klik distribute data")
    public void tcc_tele_014_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("Tcc.Tele.014 klik distribusi")
    public void tcc_tele_014_klik_distribusi() {
            distributeData.btnDistribusi();
            extentTest.log(LogStatus.PASS,"klik distribusi");
    }

    @Then("TCC.Tele.014 Menampilkan pop up Pilih User yang akan didistribusikan")
    public void tcc_tele_014_menampilkan_popup_pilih_user_yang_akan_didistribusikan() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Pilih User yang akan didistribusikan");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Pilih User yang akan didistribusikan");
    }

    // DISTRIBUTE DATA KOSONGKAN DISTRIBUSI 015
    @When("TCC.Tele.015 klik data")
    public void tcc_tele_015_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.015 klik distribute data")
    public void tcc_tele_015_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("Tcc.Tele.015 input jumlah per agent")
    public void tcc_tele_15_input_jumlah_per_agent() {
        distributeData.jumlahPerAgent("7");
        extentTest.log(LogStatus.PASS,"input jumlah per agent");
    }

    @And("Tcc.Tele.015 klik distribusi")
    public void tcc_tele_015_klik_distribusi() {
        distributeData.btnDistribusi();
        extentTest.log(LogStatus.PASS,"klik distribusi");
    }

    @Then("TCC.Tele.015 Menampilkan pop up Pilih User yang akan didistribusikan")
    public void tcc_tele_015_menampilkan_popup_pilih_user_yang_akan_didistribusikan() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Pilih User yang akan didistribusikan");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Pilih User yang akan didistribusikan");
    }

    // DISTRIBUTE DATA KOSONGKAN JUMLAH PER AGENT 016
    @When("TCC.Tele.016 klik data")
    public void tcc_tele_016_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        distributeData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.016 klik distribute data")
    public void tcc_tele_016_klik_distribute_data() {
        distributeData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @And("Tcc.Tele.016 checklist distribusi ke")
    public void tcc_tele_16_checklist_distribusi_ke() {
        distributeData.checkboxDistribusiKe();
        extentTest.log(LogStatus.PASS,"checklist distribusi ke");
    }

    @And("Tcc.Tele.016 klik distribusi")
    public void tcc_tele_016_klik_distribusi() {
        distributeData.btnDistribusi();
        extentTest.log(LogStatus.PASS,"klik distribusi");
    }

    @Then("TCC.Tele.016 Menampilkan pop up Jumlah tidak boleh Kosong")
    public void tcc_tele_016_menampilkan_popup_jumlah_tidak_boleh_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(distributeData.getTxtInformation(),"Jumlah tidak boleh Kosong");
        extentTest.log(LogStatus.PASS,"Menampilkan pop up Jumlah tidak boleh Kosong");
    }
}
