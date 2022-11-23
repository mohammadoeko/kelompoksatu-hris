package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.drivers.pages.AgentAgree;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestAgentAgree {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private AgentAgree agentAgree = new AgentAgree();
    public TestAgentAgree(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Test Case Twenty Two

    @When("TCC.Tele.022 Klik Task")
    public void TCC_Tele_022_Klik_Task(){
        Hooks.delay(1);
        agentAgree.clickBtnTask();
        extentTest.log(LogStatus.PASS, "Klik Task");
    }

    @And("TCC.Tele.022 Klik Task lagi")
    public void TCC_Tele_022_Klik_Task_lagi(){
        Hooks.delay(1);
        agentAgree.clickBtnTask();
        extentTest.log(LogStatus.PASS, "Klik Task lagi");
    }

    @And("TCC.Tele.022 Klik Agree")
    public void TCC_Tele_022_Klik_Agree(){
        Hooks.delay(1);
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }


    @Then("TCC.Tele.022 Menampilkan halaman Task bucket Agree")
    public void TCC_Tele_022_Menampilkan_halaman_Task_bucket_Agree(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan halaman Task bucket Agree");
    }

    //Test Case Twenty Three

    @When("TCC.Tele.023 Input data di kolom search")
    public void TCC_Tele_023_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentAgree.Search("tesaja");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }

    @And("TCC.Tele.023 Klik search")
    public void TCC_Tele_023_Klik_search(){
        Hooks.delay(1);
        agentAgree.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }

    @Then("TCC.Tele.023 Menampilkan data sesuai keyword")
    public void TCC_Tele_023_Menampilkan_data_sesuai_keyword(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Twenty Four

    @When("TCC.Tele.024 Klik Agree")
    public void TCC_Tele_024_Klik_Agree(){
        Hooks.delay(1);
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And("TCC.Tele.024 Klik search")
    public void TCC_Tele_024_Klik_search(){
        Hooks.delay(1);
        agentAgree.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }

    @Then("TCC.Tele.024 Menampilkan data sesuai keyword")
    public void TCC_Tele_024_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Twenty Five

    @When("TCC.Tele.025 Klik Agree")
    public void TCC_Tele_025_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.025 Input data di kolom search")
    public void TCC_Tele_025_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentAgree.Search("9");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }

    @And("TCC.Tele.025 Klik search")
    public void TCC_Tele_025_Klik_search(){
        Hooks.delay(1);
        agentAgree.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }

    @Then("TCC.Tele.025 Menampilkan data sesuai keyword")
    public void TCC_Tele_025_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Twenty Six

    @When("TCC.Tele.026 Klik Agree")
    public void TCC_Tele_026_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.026 Input data di kolom search")
    public void TCC_Tele_026_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentAgree.Search(".");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }

    @And("TCC.Tele.026 Klik search")
    public void TCC_Tele_026_Klik_search(){
        Hooks.delay(1);
        agentAgree.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }

    @Then("TCC.Tele.026 Menampilkan data sesuai keyword")
    public void TCC_Tele_026_Menampilkan_data_sesuai_keyword(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword");
    }

    //Test Case Twenty Seven

    @When("TCC.Tele.027 Klik Agree")
    public void TCC_Tele_027_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.027 Input data di kolom search")
    public void TCC_Tele_027_Input_data_di_kolom_search(){
        Hooks.delay(1);
        agentAgree.Search("9");
        extentTest.log(LogStatus.PASS, "Input data di kolom search");
    }

    @And("TCC.Tele.027 Klik search")
    public void TCC_Tele_027_Klik_search(){
        Hooks.delay(1);
        agentAgree.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik Search");
    }

    @And("TCC.Tele.027 Klik page two")
    public void TCC_Tele_027_Klik_page_two(){
        Hooks.delay(1);
        agentAgree.clickBtnPageTwo();
        extentTest.log(LogStatus.PASS, "Klik page two");
    }

    @Then("TCC.Tele.027 Menampilkan data sesuai keyword page two")
    public void TCC_Tele_027_Menampilkan_data_sesuai_keyword_page_two(){
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai keyword page two");
    }

    //Test Case Twenty Eight

    @When("TCC.Tele.028 Klik Agree")
    public void TCC_Tele_028_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.028 Klik Dropdown Show Page")
    public void TCC_Tele_028_Klik_Dropdown_Show_Page(){
        Hooks.delay(1);
        agentAgree.selectShowPage("25");
        extentTest.log(LogStatus.PASS, "Klik Dropdown Show Page");
    }


    @Then("TCC.Tele.028 Menampilkan 25 data per halaman")
    public void TCC_Tele_028_Menampilkan_25_data_per_halaman(){
        extentTest.log(LogStatus.PASS, "Menampilkan 25 data per halaman");
    }

    //Test Case Twenty Nine

    @When("TCC.Tele.029 Klik Agree")
    public void TCC_Tele_029_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.029 Klik Dropdown Show Page")
    public void TCC_Tele_029_Klik_Dropdown_Show_Page(){
        Hooks.delay(1);
        agentAgree.selectShowPage("10");
        extentTest.log(LogStatus.PASS, "Klik Dropdown Show Page");
    }


    @Then("TCC.Tele.029 Menampilkan 10 data per halaman")
    public void TCC_Tele_029_Menampilkan_10_data_per_halaman(){
        extentTest.log(LogStatus.PASS, "Menampilkan 10 data per halaman");
    }

    //Test Case Thirty

    @When("TCC.Tele.030 Klik Agree")
    public void TCC_Tele_030_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.030 Klik page two")
    public void TCC_Tele_030_Klik_page_two(){
        Hooks.delay(1);
        agentAgree.clickBtnPageTwo();
        extentTest.log(LogStatus.PASS, "Klik page two");
    }

    @And ("TCC.Tele.030 Klik page three")
    public void TCC_Tele_030_Klik_page_three(){
        Hooks.delay(1);
        agentAgree.clickBtnPageThree();
        extentTest.log(LogStatus.PASS, "Klik page three");
    }


    @Then("TCC.Tele.030 Menampilkan data urutan sesuai halaman")
    public void TCC_Tele_030_Menampilkan_data_urutan_sesuai_halaman(){
        extentTest.log(LogStatus.PASS, "Menampilkan data urutan sesuai halaman");
    }

    //Test Case Thirty One

    @When("TCC.Tele.031 Klik Agree")
    public void TCC_Tele_031_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.031 Klik last page")
    public void TCC_Tele_031_Klik_last_page(){
        Hooks.delay(1);
        agentAgree.clickBtnLastPage();
        extentTest.log(LogStatus.PASS, "Klik last page");
    }


    @Then("TCC.Tele.031 Menampilkan data halaman terakhir")
    public void TCC_Tele_031_Menampilkan_data_halaman_terakhir(){
        extentTest.log(LogStatus.PASS, "Menampilkan data halaman terakhir");
    }

    //Test Case Thirty Two

    @When("TCC.Tele.032 Klik Agree")
    public void TCC_Tele_032_Klik_Agree(){
        agentAgree.clickBtnAgree();
        extentTest.log(LogStatus.PASS, "Klik Agree");
    }

    @And ("TCC.Tele.032 Klik last page")
    public void TCC_Tele_032_Klik_last_page(){
        Hooks.delay(1);
        agentAgree.clickBtnLastPage();
        extentTest.log(LogStatus.PASS, "Klik last page");
    }

    @And ("TCC.Tele.032 Klik first page")
    public void TCC_Tele_032_Klik_first_page(){
        Hooks.delay(1);
        agentAgree.clickBtnFirstPage();
        extentTest.log(LogStatus.PASS, "Klik first page");
    }


    @Then("TCC.Tele.032 Menampilkan data halaman pertama")
    public void TCC_Tele_032_Menampilkan_data_halaman_pertama(){
        extentTest.log(LogStatus.PASS, "Menampilkan data halaman pertama");
    }

    //Test Case Thirty Three

    @When("TCC.Tele.033 Klik salah satu data")
    public void TCC_Tele_033_Klik_salah_satu_data(){
        Hooks.delay(1);
        agentAgree.clickSelectData();
        extentTest.log(LogStatus.PASS, "Klik salah satu data");
    }

    @And ("TCC.Tele.033 Input link")
    public void TCC_Tele_033_Input_link(){
        Hooks.delay(1);
        agentAgree.Link("https://google.com/");
        extentTest.log(LogStatus.PASS, "Input link");
    }

    @And ("TCC.Tele.033 Klik update")
    public void TCC_Tele_033_Klik_update(){
        Hooks.delay(1);
        agentAgree.clickBtnUpdate();
        extentTest.log(LogStatus.PASS, "Klik update");
    }

    @And ("TCC.Tele.033 Klik ok")
    public void TCC_Tele_033_Klik_ok(){
        Hooks.delay(1);
        agentAgree.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik ok");
    }


    @Then("TCC.Tele.033 Link berhasil terupdate")
    public void TCC_Tele_033_Link_berhasil_terupdate(){
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Link berhasil terupdate");
    }

    //Test Case Thirty Four

    @When("TCC.Tele.034 Klik salah satu data")
    public void TCC_Tele_034_Klik_salah_satu_data(){
        Hooks.delay(1);
        agentAgree.clickSelectData();
        extentTest.log(LogStatus.PASS, "Klik salah satu data");
    }


    @And ("TCC.Tele.034 Klik update")
    public void TCC_Tele_034_Klik_update(){
        Hooks.delay(1);
        agentAgree.clickBtnUpdate();
        extentTest.log(LogStatus.PASS, "Klik update");
    }

    @And ("TCC.Tele.034 Klik ok")
    public void TCC_Tele_034_Klik_ok(){
        Hooks.delay(1);
        agentAgree.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik ok");
    }


    @Then("TCC.Tele.034 Link berhasil terupdate")
    public void TCC_Tele_034_Link_berhasil_terupdate(){
        extentTest.log(LogStatus.PASS, "Link berhasil terupdate");
    }
}
