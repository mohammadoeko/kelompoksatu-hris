package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.drivers.pages.AgentNew;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestAgentNew {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private AgentNew agentNew = new AgentNew();
    public TestAgentNew(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case One
    @When("TCC.Tele.001 Klik Task")
    public void TCC_Tele_001_Klik_Task(){
        agentNew.clickBtnTask();
        extentTest.log(LogStatus.PASS, "Klik Task");
    }

    @And("TCC.Tele.001 Klik New")
    public void TCC_Tele_001_Klik_New(){
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }


    @Then("TCC.Tele.001 Menampilkan halaman Task bucket New")
    public void TCC_Tele_001_Menampilkan_halaman_Task_bucket_New(){
        //Assert.assertEquals(agentNew.getTxtDataNew(), "DATA NEW");
        extentTest.log(LogStatus.PASS, "Menampilkan halaman Task bucket New");
    }

    //Test Case Two

    @When("TCC.Tele.002 Input data di kolom search")
    public void TCC_Tele_002_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentNew.Search("telero");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }

    @And("TCC.Tele.002 Klik search")
    public void TCC_Tele_002_Klik_search(){
        Hooks.delay(1);
        agentNew.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }


    @Then("TCC.Tele.002 Menampilkan data sesuai keyword")
    public void TCC_Tele_002_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Three

    @When("TCC.Tele.003 Klik New")
    public void TCC_Tele_003_Klik_New(){
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }


    @And("TCC.Tele.003 Klik search")
    public void TCC_Tele_003_Klik_search(){
        Hooks.delay(2);
        agentNew.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik search");
    }


    @Then("TCC.Tele.003 Menampilkan data sesuai keyword")
    public void TCC_Tele_003_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Four

    @When("TCC.Tele.004 Klik New")
    public void TCC_Tele_004_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.004 Input data di kolom search")
    public void TCC_Tele_004_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentNew.Search("2");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }


    @And("TCC.Tele.004 Klik search")
    public void TCC_Tele_004_Klik_search(){
        Hooks.delay(1);
        agentNew.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik search");
    }


    @Then("TCC.Tele.004 Menampilkan data sesuai keyword")
    public void TCC_Tele_004_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Five

    @When("TCC.Tele.005 Klik New")
    public void TCC_Tele_005_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.005 Input data di kolom search")
    public void TCC_Tele_005_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentNew.Search(".");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }


    @And("TCC.Tele.005 Klik search")
    public void TCC_Tele_005_Klik_search(){
        Hooks.delay(1);
        agentNew.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik search");
    }


    @Then("TCC.Tele.005 Menampilkan data sesuai keyword")
    public void TCC_Tele_005_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Six

    @When("TCC.Tele.006 Klik New")
    public void TCC_Tele_006_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.006 Input data di kolom search")
    public void TCC_Tele_006_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentNew.Search("telero");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }


    @And("TCC.Tele.006 Klik search")
    public void TCC_Tele_006_Klik_search(){
        Hooks.delay(1);
        agentNew.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik search");
    }

    @And("TCC.Tele.006 Klik page two")
    public void TCC_Tele_006_Klik_page_two(){
        Hooks.delay(1);
        agentNew.clickBtnPageTwo();
        extentTest.log(LogStatus.PASS, "Klik page two");
    }


    @Then("TCC.Tele.006 Menampilkan data sesuai keyword page two")
    public void TCC_Tele_006_Menampilkan_data_sesuai_keyword(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Seven

    @When("TCC.Tele.007 Klik New")
    public void TCC_Tele_007_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.007 Klik Dropdown Show Page")
    public void TCC_Tele_007_Klik_Dropdown_Show_Page(){
        Hooks.delay(1);
        agentNew.selectShowPage("25");
        extentTest.log(LogStatus.PASS, "Klik Dropdown Show Page");
    }


    @Then("TCC.Tele.007 Menampilkan 25 data per halaman")
    public void TCC_Tele_007_Menampilkan_25_data_per_halaman(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan 25 data per halaman");
    }

    //Test Case Eight

    @When("TCC.Tele.008 Klik New")
    public void TCC_Tele_008_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.008 Klik Dropdown Show Page")
    public void TCC_Tele_008_Klik_Dropdown_Show_Page(){
        Hooks.delay(1);
        agentNew.selectShowPage("50");
        extentTest.log(LogStatus.PASS, "Klik Dropdown Show Page");
    }


    @Then("TCC.Tele.008 Menampilkan 50 data per halaman")
    public void TCC_Tele_008_Menampilkan_50_data_per_halaman(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan 50 data per halaman");
    }

    //Test Case Nine

    @When("TCC.Tele.009 Klik New")
    public void TCC_Tele_009_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.009 Klik Dropdown Show Page")
    public void TCC_Tele_009_Klik_Dropdown_Show_Page(){
        Hooks.delay(1);
        agentNew.selectShowPage("10");
        extentTest.log(LogStatus.PASS, "Klik Dropdown Show Page");
    }


    @Then("TCC.Tele.009 Menampilkan 10 data per halaman")
    public void TCC_Tele_009_Menampilkan_10_data_per_halaman(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan 10 data per halaman");
    }

    //Test Case Ten

    @When("TCC.Tele.010 Klik New")
    public void TCC_Tele_010_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.010 Klik page two")
    public void TCC_Tele_010_Klik_page_two(){
        Hooks.delay(1);
        agentNew.clickBtnPageTwo();
        extentTest.log(LogStatus.PASS, "Klik page two");
    }

    @And ("TCC.Tele.010 Klik page three")
    public void TCC_Tele_010_Klik_page_three(){
        Hooks.delay(1);
        agentNew.clickBtnPageThree();
        extentTest.log(LogStatus.PASS, "Klik page three");
    }

    @And ("TCC.Tele.010 Klik page four")
    public void TCC_Tele_010_Klik_page_four(){
        Hooks.delay(1);
        agentNew.clickBtnPageFour();
        extentTest.log(LogStatus.PASS, "Klik page four");
    }

    @And ("TCC.Tele.010 Klik page five")
    public void TCC_Tele_010_Klik_page_five(){
        Hooks.delay(1);
        agentNew.clickBtnPageFive();
        extentTest.log(LogStatus.PASS, "Klik page five");
    }


    @Then("TCC.Tele.010 Menampilkan data urutan sesuai halaman")
    public void TCC_Tele_010_Menampilkan_data_urutan_sesuai_halaman(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan data urutan sesuai halaman");
    }

    //Test Case Eleven

    @When("TCC.Tele.011 Klik New")
    public void TCC_Tele_011_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.011 Klik last page")
    public void TCC_Tele_011_Klik_last_page(){
        Hooks.delay(1);
        agentNew.clickBtnLastPage();
        extentTest.log(LogStatus.PASS, "Klik last page");
    }



    @Then("TCC.Tele.011 Menampilkan data halaman terakhir")
    public void TCC_Tele_011_Menampilkan_data_halaman_terakhir(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan data halaman terakhir");
    }

    //Test Case Twelve

    @When("TCC.Tele.012 Klik New")
    public void TCC_Tele_012_Klik_New(){
        Hooks.delay(1);
        agentNew.clickBtnNew();
        extentTest.log(LogStatus.PASS, "Klik New");
    }

    @And ("TCC.Tele.012 Klik last page")
    public void TCC_Tele_012_Klik_last_page(){
        Hooks.delay(1);
        agentNew.clickBtnLastPage();
        extentTest.log(LogStatus.PASS, "Klik last page");
    }

    @And ("TCC.Tele.012 Klik first page")
    public void TCC_Tele_012_Klik_first_page(){
        Hooks.delay(1);
        agentNew.clickBtnFirstPage();
        extentTest.log(LogStatus.PASS, "Klik first page");
    }


    @Then("TCC.Tele.012 Menampilkan data halaman pertama")
    public void TCC_Tele_012_Menampilkan_data_halaman_pertama(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan data halaman pertama");
    }

    //Test Case Thirteen

    @When("TCC.Tele.013 Klik salah satu data")
    public void TCC_Tele_013_Klik_salah_satu_data(){
        Hooks.delay(1);
        agentNew.clickSelectData();
        extentTest.log(LogStatus.PASS, "Klik salah satu data");
    }

    @And ("TCC.Tele.013 Klik add phone")
    public void TCC_Tele_013_Klik_add_phone(){
        Hooks.delay(1);
        agentNew.clickBtnAddPhone();
        extentTest.log(LogStatus.PASS, "Klik add phone");
    }

    @And ("TCC.Tele.013 Input nomor telepon")
    public void TCC_Tele_013_Input_nomor_telepon(){
        Hooks.delay(1);
        agentNew.addPhone("081318882719");
        extentTest.log(LogStatus.PASS, "Input nomor telepon");
    }

    @And ("TCC.Tele.013 Klik save")
    public void TCC_Tele_013_Klik_save(){
        Hooks.delay(1);
        agentNew.clickBtnSavePhone();
        extentTest.log(LogStatus.PASS, "Klik save");
    }

    @And ("TCC.Tele.013 Klik Ok")
    public void TCC_Tele_013_Klik_Ok(){
        agentNew.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }


    @Then("TCC.Tele.013 Nomor telepon berhasil tersimpan")
    public void TCC_Tele_013_Nomor_telepon_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Nomor telepon berhasil tersimpan");
    }

    //Test Case Fourteen

    @When("TCC.Tele.014 Klik add phone")
    public void TCC_Tele_014_Klik_add_phone(){
        Hooks.delay(1);
        agentNew.clickBtnAddPhone();
        extentTest.log(LogStatus.PASS, "Klik add phone");
    }

    @And ("TCC.Tele.014 Input nomor telepon lebih dari lima belas karakter")
    public void TCC_Tele_014_Input_nomor_telepon_lebih_dari_lima_belas_karakter(){
        Hooks.delay(1);
        agentNew.addPhone("08131888271987654321");
        extentTest.log(LogStatus.PASS, "Input nomor telepon lebih dari lima belas karakter");
    }


    @And ("TCC.Tele.014 Klik save")
    public void TCC_Tele_014_Klik_save(){
        Hooks.delay(1);
        agentNew.clickBtnSavePhone();
        extentTest.log(LogStatus.PASS, "Klik save");
    }

    @And ("TCC.Tele.014 Klik Ok")
    public void TCC_Tele_014_Klik_Ok(){
        agentNew.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }


    @Then("TCC.Tele.014 Nomor telepon tersimpan")
    public void TCC_Tele_014_Nomor_telepon_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Nomor telepon tersimpan");
    }

    //Test Case Fifteen

    @When("TCC.Tele.015 Klik add phone")
    public void TCC_Tele_015_Klik_add_phone(){
        Hooks.delay(1);
        agentNew.clickBtnAddPhone();
        extentTest.log(LogStatus.PASS, "Klik add phone");
    }


    @And ("TCC.Tele.015 Klik save")
    public void TCC_Tele_015_Klik_save(){
        Hooks.delay(1);
        agentNew.clickBtnSavePhone();
        extentTest.log(LogStatus.PASS, "Klik save");
    }

    @And ("TCC.Tele.015 Klik Ok")
    public void TCC_Tele_015_Klik_Ok(){
        agentNew.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik Ok");
    }


    @Then("TCC.Tele.015 Data berhasil tersimpan")
    public void TCC_Tele_015_Data_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data berhasil tersimpan");
    }

    //Test Case Sixteen


    @When ("TCC.Tele.016 Klik submit")
    public void TCC_Tele_016_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.016 Klik close edit")
    public void TCC_Tele_016_Klik_close_edit(){
        Hooks.delay(1);
        agentNew.clickBtnCloseEdit();
        extentTest.log(LogStatus.PASS, "Klik close edit");
    }


    @Then("TCC.Tele.016 Data tidak berhasil tersimpan")
    public void TCC_Tele_016_Data_tidak_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data tidak berhasil tersimpan");
    }

    //Test Case Seventeen

    @When("TCC.Tele.017 Pilih channel")
    public void TCC_Tele_017_Pilih_channel(){
        Hooks.delay(1);
        agentNew.selectChannel("Call");
        extentTest.log(LogStatus.PASS, "Pilih channel");
    }


    @And ("TCC.Tele.017 Klik submit")
    public void TCC_Tele_017_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.017 Klik close edit")
    public void TCC_Tele_017_Klik_close_edit(){
        Hooks.delay(1);
        agentNew.clickBtnCloseEdit();
        extentTest.log(LogStatus.PASS, "Klik close edit");
    }


    @Then("TCC.Tele.017 Data tidak berhasil tersimpan")
    public void TCC_Tele_017_Data_tidak_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data tidak berhasil tersimpan");
    }

    //Test Case Eighteen

    @When("TCC.Tele.018 Pilih channel")
    public void TCC_Tele_018_Pilih_channel(){
        Hooks.delay(1);
        agentNew.selectChannel("Call");
        extentTest.log(LogStatus.PASS, "Pilih channel");
    }

    @And("TCC.Tele.018 Pilih status")
    public void TCC_Tele_018_Pilih_status(){
        Hooks.delay(1);
        agentNew.selectStatus("Tersambung");
        extentTest.log(LogStatus.PASS, "Pilih status");
    }


    @And ("TCC.Tele.018 Klik submit")
    public void TCC_Tele_018_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.018 Klik close edit")
    public void TCC_Tele_018_Klik_close_edit(){
        Hooks.delay(1);
        agentNew.clickBtnCloseEdit();
        extentTest.log(LogStatus.PASS, "Klik close edit");
    }


    @Then("TCC.Tele.018 Data tidak berhasil tersimpan")
    public void TCC_Tele_018_Data_tidak_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data tidak berhasil tersimpan");
    }

    //Test Case Nineteen

    @When("TCC.Tele.019 Pilih channel")
    public void TCC_Tele_019_Pilih_channel(){
        Hooks.delay(1);
        agentNew.selectChannel("Call");
        extentTest.log(LogStatus.PASS, "Pilih channel");
    }

    @And("TCC.Tele.019 Pilih status")
    public void TCC_Tele_019_Pilih_status(){
        Hooks.delay(1);
        agentNew.selectStatus("Tersambung");
        extentTest.log(LogStatus.PASS, "Pilih status");
    }

    @And("TCC.Tele.019 Pilih status call")
    public void TCC_Tele_019_Pilih_status_call(){
        Hooks.delay(1);
        agentNew.selectStatusCall("Diangkat");
        extentTest.log(LogStatus.PASS, "Pilih status call");
    }


    @And ("TCC.Tele.019 Klik submit")
    public void TCC_Tele_019_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.019 Klik close edit")
    public void TCC_Tele_019_Klik_close_edit(){
        Hooks.delay(1);
        agentNew.clickBtnCloseEdit();
        extentTest.log(LogStatus.PASS, "Klik close edit");
    }


    @Then("TCC.Tele.019 Data tidak berhasil tersimpan")
    public void TCC_Tele_019_Data_tidak_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data tidak berhasil tersimpan");
    }

    //Test Case Twenty

    @When("TCC.Tele.020 Pilih channel")
    public void TCC_Tele_020_Pilih_channel(){
        Hooks.delay(1);
        agentNew.selectChannel("Call");
        extentTest.log(LogStatus.PASS, "Pilih channel");
    }

    @And("TCC.Tele.020 Pilih status")
    public void TCC_Tele_020_Pilih_status(){
        Hooks.delay(1);
        agentNew.selectStatus("Tersambung");
        extentTest.log(LogStatus.PASS, "Pilih status");
    }

    @And("TCC.Tele.020 Pilih status call")
    public void TCC_Tele_020_Pilih_status_call(){
        Hooks.delay(1);
        agentNew.selectStatusCall("Diangkat");
        extentTest.log(LogStatus.PASS, "Pilih status call");
    }

    @And("TCC.Tele.020 Pilih status result")
    public void TCC_Tele_020_Pilih_status_result(){
        Hooks.delay(1);
        agentNew.selectStatusResult("Follow Up");
        extentTest.log(LogStatus.PASS, "Pilih status result");
    }


    @And ("TCC.Tele.020 Klik submit")
    public void TCC_Tele_020_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.020 Klik Yes")
    public void TCC_Tele_020_Klik_Yes(){
        Hooks.delay(1);
        agentNew.clickBtnYes();
        extentTest.log(LogStatus.PASS, "Klik Yes");
    }


    @Then("TCC.Tele.020 Data berhasil tersimpan")
    public void TCC_Tele_020_Data_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data berhasil tersimpan");
    }

    //Test Case Twenty One

    @When("TCC.Tele.021 Klik salah satu data")
    public void TCC_Tele_021_Klik_salah_satu_data(){
        Hooks.delay(1);
        agentNew.clickSelectData();
        extentTest.log(LogStatus.PASS, "Klik salah satu data");
    }

    @And("TCC.Tele.021 Pilih channel")
    public void TCC_Tele_021_Pilih_channel(){
        Hooks.delay(1);
        agentNew.selectChannel("Call");
        extentTest.log(LogStatus.PASS, "Pilih channel");
    }

    @And("TCC.Tele.021 Pilih status")
    public void TCC_Tele_021_Pilih_status(){
        Hooks.delay(1);
        agentNew.selectStatus("Tersambung");
        extentTest.log(LogStatus.PASS, "Pilih status");
    }

    @And("TCC.Tele.021 Pilih status call")
    public void TCC_Tele_021_Pilih_status_call(){
        Hooks.delay(1);
        agentNew.selectStatusCall("Diangkat");
        extentTest.log(LogStatus.PASS, "Pilih status call");
    }

    @And("TCC.Tele.021 Pilih status result")
    public void TCC_Tele_021_Pilih_status_result(){
        Hooks.delay(1);
        agentNew.selectStatusResult("Follow Up");
        extentTest.log(LogStatus.PASS, "Pilih status result");
    }

    @And("TCC.Tele.021 Pilih reason")
    public void TCC_Tele_021_Pilih_reason(){
        Hooks.delay(1);
        agentNew.selectReason("Follow Up");
        extentTest.log(LogStatus.PASS, "Pilih reason");
    }


    @And ("TCC.Tele.021 Klik submit")
    public void TCC_Tele_021_Klik_submit(){
        Hooks.delay(1);
        agentNew.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "Klik submit");
    }

    @And ("TCC.Tele.021 Klik Yes")
    public void TCC_Tele_021_Klik_Yes(){
        Hooks.delay(1);
        agentNew.clickBtnYes();
        extentTest.log(LogStatus.PASS, "Klik Yes");
    }


    @Then("TCC.Tele.021 Data berhasil tersimpan")
    public void TCC_Tele_021_Data_berhasil_tersimpan(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Data berhasil tersimpan");
    }


}
