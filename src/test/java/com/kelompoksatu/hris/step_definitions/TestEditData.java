package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.DistributeData;
import com.kelompoksatu.hris.pages.EditData;
import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestEditData {

    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private EditData editData = new EditData();

    private UploadData uploadData = new UploadData();

    public TestEditData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

/**
    // EDIT DATA TIDAK MASUK HALAMAN EDIT 011
    @When("TCC.Tele.011.EditData klik data")
    public void tcc_tele_011_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.011.EditData klik distribute data")
    public void tcc_tele_011_klik_distribute_data() {
        editData.clickDistributeData();
        extentTest.log(LogStatus.PASS,"klik distribute data");
    }

    @Then("TCC.Tele.011.EditData Menampilkan halaman distribusi")
    public void tcc_tele_11_menampilkan_halaman_distribusi() {
        Assert.assertEquals(editData.getTxtDistribusi(), "Status");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman distribusi");
    }

    // INPUT SEARCH DATA KOSONG 012
    @When("TCC.Tele.012.EditData klik data")
    public void tcc_tele_012_edit_data_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.012.EditData klik edit data")
    public void tcc_tele_012_edit_data_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.Tele.012.EditData input search data kosong")
    public void tcc_tele_012_edit_data_input_search_data_kosong() {
        editData.inputSearch("");
        extentTest.log(LogStatus.PASS,"input search data kosong");
    }

    @And("TCC.Tele.012.EditData klik search")
    public void tcc_tele_012_edit_data_klik_search() {
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.012.EditData Menampilkan semua data")
    public void tcc_tele_012_edit_data_menampilkan_semua_data() {
        Assert.assertEquals(editData.getTxtSepedaKenceng(),"sepeda.kenceng");
        extentTest.log(LogStatus.PASS,"Menampilkan semua data dengan input search kosong");
    }

    // INPUT SEARCH DATA "SEMPURNA" 013
    @When("TCC.Tele.013.EditData klik data")
    public void tcc_tele_013_edit_data_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.Tele.013.EditData klik edit data")
    public void tcc_tele_013_edit_data_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.Tele.013.EditData input search sempurna")
    public void tcc_tele_013_edit_data_input_search_sempurna() {
        editData.inputSearch("sempurna");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.Tele.013.EditData klik search")
    public void tcc_tele_013_edit_data_klik_search() {
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.Tele.013.EditData Menampilkan data kosong")
    public void tcc_tele_013_edit_data_menampilkan_data_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtSearchKosong(), " no entries");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
    } **/


    @When("TCC.EDIT DATA SEARCH.004 klik data")
    public void tcc_edit_data_search_004_klik_data() {
    driver.get(Constants.URL);
    uploadData.btnOkWelcome();
    editData.clickData();
    extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.004 klik edit data")
    public void tcc_edit_data_search_004_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.004 input search telero")
    public void tcc_edit_data_search_004_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.004 klik search")
    public void tcc_edit_data_search_004_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
    }

    @Then("TCC.EDIT DATA SEARCH.004 Menampilkan data telero")
    public void tcc_edit_data_search_004_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }


    //
    @When("TCC.EDIT DATA SEARCH.005 klik data")
    public void tcc_edit_data_search_005_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.005 klik edit data")
    public void tcc_edit_data_search_005_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.005 input search telero")
    public void tcc_edit_data_search_005_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.005 klik search")
    public void tcc_edit_data_search_005_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.005 Menampilkan data telero")
    public void tcc_edit_data_search_005_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.005 klik page 2")
    public void tcc_edit_data_search_005_klik_page_2() {
        editData.ClickBtnPage2EditData();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }


    @Then("TCC.EDIT DATA SEARCH.005 menampilkan halaman ke 2")
    public void tcc_edit_data_search_005_menampilkan_halaman_ke_2() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewPage2EditData(), "telero2");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    // LAST PAGE

    @When("TCC.EDIT DATA SEARCH.006 klik data")
    public void tcc_edit_data_search_006_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.006 klik edit data")
    public void tcc_edit_data_search_006_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.006 input search telero")
    public void tcc_edit_data_search_006_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.006 klik search")
    public void tcc_edit_data_search_006_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.006 Menampilkan data telero")
    public void tcc_edit_data_search_006_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.006 klik last page")
    public void tcc_edit_data_search_006_klik_last_page() {
        editData.ClickBtnLastPageEditData();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }


    @Then("TCC.EDIT DATA SEARCH.006 menampilkan halaman last page")
    public void tcc_edit_data_search_006_menampilkan_halaman_last_page() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtLastPageEditData(), "telero3");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    //first page

    @When("TCC.EDIT DATA SEARCH.007 klik data")
    public void tcc_edit_data_search_007_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.007 klik edit data")
    public void tcc_edit_data_search_007_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.007 input search telero")
    public void tcc_edit_data_search_007_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.007 klik search")
    public void tcc_edit_data_search_007_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.007 Menampilkan data telero")
    public void tcc_edit_data_search_007_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.007 klik last page")
    public void tcc_edit_data_search_007_klik_last_page() {
        editData.ClickBtnLastPageEditData();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }


    @And ("TCC.EDIT DATA SEARCH.007 klik first page")
    public void tcc_edit_data_search_007_klik_first_page() {
        editData.ClickBtnFirstPageEditData();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }


    @Then("TCC.EDIT DATA SEARCH.007 menampilkan halaman first page")
    public void tcc_edit_data_search_007_menampilkan_halaman_first_page() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtFirstPageEditData(), "telero4");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    // entries 25

    @When("TCC.EDIT DATA SEARCH.008 klik data")
    public void tcc_edit_data_search_008_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.008 klik edit data")
    public void tcc_edit_data_search_008_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.008 input search telero")
    public void tcc_edit_data_search_008_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.008 klik search")
    public void tcc_edit_data_search_008_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.008 Menampilkan data telero")
    public void tcc_edit_data_search_008_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.008 klik page 25")
    public void tcc_tele_edit_data_search_008_klik_page_25() {
        hooks.waiting(5);
        editData.selectShowPageEditData("25");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.EDIT DATA SEARCH.008 menampilkan data entries 25")
    public void tcc_tele_edit_data_search_008_menampilkan_data_entries_25() {
        Assert.assertEquals(editData.getTxtShowEntries25Editdata(),"telero5");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    //show entries 50

    @When("TCC.EDIT DATA SEARCH.009 klik data")
    public void tcc_edit_data_search_009_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.009 klik edit data")
    public void tcc_edit_data_search_009_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.009 input search telero")
    public void tcc_edit_data_search_009_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.009 klik search")
    public void tcc_edit_data_search_009_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.009 Menampilkan data telero")
    public void tcc_edit_data_search_009_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.009 klik page 50")
    public void tcc_tele_edit_data_search_009_klik_page_50() {
        hooks.waiting(5);
        editData.selectShowPageEditData("50");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.EDIT DATA SEARCH.009 menampilkan data entries 50")
    public void tcc_tele_edit_data_search_009_menampilkan_data_entries_50() {
        hooks.waiting(5);
        Assert.assertEquals(editData.getTxtShowEntries50Editdata(),"telero10");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_data entries 50");
        hooks.waiting(5);
    }

    //show entries 100


    @When("TCC.EDIT DATA SEARCH.010 klik data")
    public void tcc_edit_data_search_010_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.010 klik edit data")
    public void tcc_edit_data_search_010_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.010 input search telero")
    public void tcc_edit_data_search_010_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.010 klik search")
    public void tcc_edit_data_search_010_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.010 Menampilkan data telero")
    public void tcc_edit_data_search_010_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.010 klik page 100")
    public void tcc_tele_edit_data_010_klik_page_100() {
        hooks.waiting(5);
        editData.selectShowPageEditData("100");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.EDIT DATA SEARCH.010 menampilkan data entries 100")
    public void tcc_tele_edit_data_010_menampilkan_data_entries_100() {
        Assert.assertEquals(editData.getTxtShowEntries100Editdata(),"telero10");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    // show entries 500


    @When("TCC.EDIT DATA SEARCH.011 klik data")
    public void tcc_edit_data_search_011_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.011 klik edit data")
    public void tcc_edit_data_search_011_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.011 input search telero")
    public void tcc_edit_data_search_011_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.011 klik search")
    public void tcc_edit_data_search_011_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.011 Menampilkan data telero")
    public void tcc_edit_data_search_011_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.011 klik page 500")
    public void tcc_tele_edit_data_011_klik_page_500() {
        hooks.waiting(5);
        editData.selectShowPageEditData("500");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.EDIT DATA SEARCH.011 menampilkan data entries 500")
    public void tcc_tele_edit_data_011_menampilkan_data_entries_500() {
        Assert.assertEquals(editData.getTxtShowEntries500Editdata(),"telero10");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    // SHOW ENTRIE 10


    @When("TCC.EDIT DATA SEARCH.012 klik data")
    public void tcc_edit_data_search_012_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.012 klik edit data")
    public void tcc_edit_data_search_012_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.012 input search telero")
    public void tcc_edit_data_search_012_input_search_telero() {
        editData.inputSearch("telero");
        extentTest.log(LogStatus.PASS,"input search sempurna");
    }

    @And("TCC.EDIT DATA SEARCH.012 klik search")
    public void tcc_edit_data_search_012_klik_search() {
        hooks.waiting(5);
        editData.btnSearch();
        extentTest.log(LogStatus.PASS,"klik search");
        hooks.waiting(3);
    }

    @And("TCC.EDIT DATA SEARCH.012 Menampilkan data telero")
    public void tcc_edit_data_search_012_menampilkan_data_telero() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewTeleroEditData(), "telero1");
        extentTest.log(LogStatus.PASS,"Menampilkan data kosong");
        hooks.waiting(3);
    }

    @And ("TCC.EDIT DATA SEARCH.012 klik page 10")
    public void tcc_tele_edit_data_012_klik_page_10() {
        hooks.waiting(5);
        editData.selectShowPageEditData("100");
        extentTest.log(LogStatus.PASS,"klik button last_page");
        hooks.waiting(5);
    }

    @Then("TCC.EDIT DATA SEARCH.012 Showpage menampilkan data sampai 10")
    public void tcc_tele_edit_data_012_menampilkan_data_entries_10() {
        Assert.assertEquals(editData.getTxtShowEntries10Editdata(),"telero10");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    //edit data

    @When("TCC.EDIT DATA SEARCH.013 klik data")
    public void tcc_edit_data_search_013_klik_data() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        editData.clickData();
        extentTest.log(LogStatus.PASS,"klik data");
    }

    @And("TCC.EDIT DATA SEARCH.013 klik edit data")
    public void tcc_edit_data_search_013_klik_edit_data() {
        editData.clickEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And("TCC.EDIT DATA SEARCH.013 Klik nama perusahaan yang ingin di ubah")
    public void tcc_edit_data_search_013_klik_nama_perusahaan_yang_ingin_di_ubah() {
        editData.clickBtnNamaPerusahaan();
        extentTest.log(LogStatus.PASS,"klik edit data");
    }

    @And ("TCC.EDIT DATA SEARCH.013 pilih agent yang ingin di ubah")
    public void tcc_tele_edit_data_012_pilih_agent_yang_ingin_di_ubah() {
        hooks.waiting(5);
        editData.selectShowPageEditDataUser("uhuy");
        extentTest.log(LogStatus.PASS,"pilih agent uhuy");
        hooks.waiting(5);
    }

    @And("TCC.EDIT DATA SEARCH.013 klik update edit data")
    public void tcc_edit_data_search_013_klik_update_edit_data() {
        editData.clickBtnUpdateAgenData();
        extentTest.log(LogStatus.PASS,"klik edit data");
        hooks.waiting(5);
    }

    @And("TCC.EDIT DATA SEARCH.013 muncul dialog informasi berhasil update data")
    public void tcc_tele_edit_data_013_muncul_dialog_informasi_berhasil_update_data() {
        Assert.assertEquals(editData.getTxtDialogInformasiUpdate(),"data berhasil di update !");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_first_page");
        hooks.waiting(5);
    }

    @And("TCC.EDIT DATA SEARCH.013 klik OK update data")
    public void tcc_edit_data_search_013_klik_OK_Update_Data() {
        editData.clickBtnOkUpdateEditData();
        extentTest.log(LogStatus.PASS,"klik edit data");
        hooks.waiting(3);
    }

    @Then("And TCC.EDIT DATA SEARCH.013 data agent berubah")
    public void tcc_tele_edit_data_013_data_agent_berubah() {
        hooks.waiting(3);
        Assert.assertEquals(editData.getTxtViewNamaAgent(),"uhuy");
        extentTest.log(LogStatus.PASS,"menampilkan_halaman_uhuy");
        hooks.waiting(5);
    }

}
