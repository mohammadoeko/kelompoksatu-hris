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
        Assert.assertEquals(editData.getTxtStatus(), "Status");
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
    }
}
