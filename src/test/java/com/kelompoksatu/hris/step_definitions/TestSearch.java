package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.Search;
import com.kelompoksatu.hris.pages.UserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSearch {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private Search search = new Search();
    private UserPage userPage = new UserPage();


    public TestSearch() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //TCC.USERMANAGEMENT.Search

    @When("TCC.USERMANAGEMENT.003 Mencari data tanpa mengisi kolom")
    public void tcc_usermanagement_003_kolom_search_kosong() {
        extentTest.log(LogStatus.PASS,"Mencari data tanpa mengisi kolom");
    }

    @And("TCC.USERMANAGEMENT.003 Klik Search")
    public void tcc_usermanagement_003_button_search() {
        search.btnSearchKosong();
        extentTest.log(LogStatus.PASS,"Klik Search");
    }

    @Then("TCC.USERMANAGEMENT.003 Menampilkan seluruh data user")
    public void tcc_usermanagement_003_data_user_tampil_seluruh() {
        hooks.waiting(3);
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Menampilkan seluruh data user");
    }
    @When("TCC.USERMANAGEMENT.004 Memasukan data terdaftar pada kolom")
    public void tcc_usermanagement_004_kolom_search() {
        search.inputSearch("stella");
        extentTest.log(LogStatus.PASS,"Memasukan data terdaftar pada kolom");
    }

    @And("TCC.USERMANAGEMENT.004 Klik Search")
    public void tcc_usermanagement_004_button_search() {
        search.btnSearch();
        extentTest.log(LogStatus.PASS,"Klik Search");
    }

    @Then("TCC.USERMANAGEMENT.004 Data User ditampilkan")
    public void tcc_usermanagement_004_data_user_tampil() {
        hooks.waiting(3);
        Assert.assertEquals(userPage.getTxtUserManagementPage(), "USER MANAGEMENT");
        extentTest.log(LogStatus.PASS,"Data User ditampilkan");
    }
}
