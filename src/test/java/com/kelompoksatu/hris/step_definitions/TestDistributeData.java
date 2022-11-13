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
