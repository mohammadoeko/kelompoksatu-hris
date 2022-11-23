package com.kelompoksatu.hris.step_definitions;

import com.kelompoksatu.hris.pages.UploadData;
import com.kelompoksatu.hris.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUploadData {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Hooks hooks = new Hooks();

    private UploadData uploadData = new UploadData();

    public TestUploadData() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // upload data 001


    @When("TCC.Tele.001 klik data isi")
    public void tcc_tele_001_klik_data() {
        driver.get(Constants.URL);
       // uploadData.formLogin("developer", "23");
        uploadData.btnOkWelcome();
        uploadData.clickData();
        extentTest.log(LogStatus.PASS, "Klik data");
    }

    @And("TCC.Tele.001 klik menu upload data isi")
    public void tcc_tele_001_klik_menu_upload_data_isi() {
        uploadData.clickMenuBtnUploadData();
        extentTest.log(LogStatus.PASS, "Klik upload data untuk file excel");
    }

    @And("TCC.Tele.001 Tekan tombol choose file")
    public void tcc_tele_001_choose_file() {
        hooks.waiting(5);
        uploadData.importFile("C:\\Users\\Akhmad Makhrus\\Documents\\upload DATA TELE 06 september 2022.xlsx");
        extentTest.log(LogStatus.PASS, "import file excel");

    }

    @And("TCC.Tele.001 Tekan upload data file excel")
    public void tcc_tele_001_klik_button_upload_data_file_excel() {
        hooks.waiting(5);
        uploadData.clickBtnUpload();
        extentTest.log(LogStatus.PASS, "klik button upload untuk file txt");

    }

    @And("TCC.Tele.001 klik simpan file isi")
    public void tcc_tele_001_klik_button_simpan_file_isi() {
        hooks.waiting(5);
        uploadData.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "klik button simpan file txt");
   }

  //  @And("TCC.Tele.001 muncul dialog yakin menyimpan")
  //  public void tcc_tele_001_muncul_dialog_yakin_menyimpan() {
       // hooks.waiting(30);
      ///  Assert.assertEquals(uploadData.getTxtInformasi_yakinmenyimpan(), "Yakin Menimpan ?");
      //  extentTest.log(LogStatus.PASS, "Menampilkan popup file tidak dapat dibaca/jumlah data");
  //  }

    @And("TCC.Tele.001 tekan tombol simpan 1 pada dialog yakin menyimpan")
    public void tcc_tele_001_tekan_tombol_simpan_1_pada_dialog_yakin_menyimpan() {
        hooks.waiting(5);
        uploadData.clickBtnSimpanKonfirmasi();
        extentTest.log(LogStatus.PASS, "klik button simpan konfirmasi file txt");

    }

  @And("TCC.Tele.001 tekan ok pada dialog informasi")
    public void tcc_tele_001_ok_pada_dialog_informasi() {
      hooks.waiting(5);
        uploadData.Click_btn_Ok_Data_berhasil_Simpan();
    extentTest.log(LogStatus.PASS, "klik button simpan konfirmasi file txt");
  }

  @Then("TCC.Tele.001 muncul dialog data berhasil disimpan")
    public void tcc_tele_001_muncul_dialog_data_berhasil_disimpan() {
        hooks.waiting(5);
       Assert.assertEquals(uploadData.getTxtInformasi_databerhasildisimpan(), "iramacaha");
      extentTest.log(LogStatus.PASS, "Menampilkan popup file tidak dapat dibaca/jumlah data");

  }

}






    // UPLOAD DATA 006
   /** @When("TCC.Tele.006 klik data")
    public void tcc_tele_006_klik_data() {
        driver.get(Constants.URL);
        uploadData.formLogin("developer", "23");
        uploadData.btnOkWelcome();
        uploadData.clickData();
        extentTest.log(LogStatus.PASS, "Klik data");
    }

    @And("TCC.Tele.006 klik upload data")
    public void tcc_tele_006_klik_upload_data() {
        uploadData.clickBtnUploadData();
        extentTest.log(LogStatus.PASS,"Klik upload data");
    }

    @And("TCC.Tele.006 klik button upload")
    public void tcc_tele_006_klik_button_upload() {
        uploadData.clickBtnUpload();
        extentTest.log(LogStatus.PASS, "klik button upload");
    }

    @Then("TCC.Tele.006 Menampilkan popup file tidak dapat dibaca\\/jumlah data")
    public void tcc_tele_006_menampilkan_popup_file_tidak_dapat_dibaca_jumlah_data_0() {
        hooks.waiting(3);
        Assert.assertEquals(uploadData.getTxtInformasiUpload(), "File tidak dapat dibaca/ jumlah data 0");
        extentTest.log(LogStatus.PASS,"Menampilkan popup file tidak dapat dibaca/jumlah data");
        driver.navigate().back();
    }

    //UPLOAD DATA 007
    @When("TCC.Tele.007 klik data untuk simpan")
    public void tcc_tele_007_klik_data_simpan() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        uploadData.clickData();
        extentTest.log(LogStatus.PASS, "Klik Data untuk simpan");
    }

    @And("TCC.Tele.007 klik upload data untuk simpan")
    public void tcc_tele_007_klik_upload_data_simpan() {
        uploadData.clickBtnUploadData();
        extentTest.log(LogStatus.PASS,"Klik upload data untuk simpan");
    }

    @And("TCC.Tele.007 klik button simpan")
    public void tcc_tele_007_klik_button_simpan() {
        uploadData.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "klik button simpan");
    }

    @And("TCC.Tele.007 klik button simpan konfirmasi")
    public void tcc_tele_007_klik_button_simpan_konfirmasi() {
        hooks.waiting(3);
        uploadData.clickBtnSimpanKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik button simpan konfirmasi");
    }

    @Then("TCC.Tele.007 Menampilkan popup data kosong")
    public void tcc_tele_007_menampilkan_popup_data_kosong() {
        hooks.waiting(3);
        Assert.assertEquals(uploadData.getTxtInformasiSimpan(), "Data Kosong");
        extentTest.log(LogStatus.PASS, "menampilkan popup data kosong");
    }

    //UPLOAD DATA 008
    @When("TCC.Tele.008 klik data untuk file txt")
    public void tcc_tele_008_klik_data_untuk_file_txt() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        uploadData.clickData();
        extentTest.log(LogStatus.PASS, "Klik data untuk file txt");
    }

    @And("TCC.Tele.008 klik upload data untuk file txt")
    public void tcc_tele_008_klik_upload_data_untuk_file_txt() {
        uploadData.clickBtnUploadData();
        extentTest.log(LogStatus.PASS,"Klik upload data untuk file txt");
    }

    @And("TCC.Tele.008 import file txt")
    public void tcc_tele_008_import_file_txt() {
        uploadData.importFile("C:\\Users\\Moh_Eko11\\Documents\\situs.txt");
        extentTest.log(LogStatus.PASS, "import file txt");
    }

    @And("TCC.Tele.008 klik button upload untuk file txt")
    public void tcc_tele_008_klik_button_upload_untuk_file_txt() {
        uploadData.clickBtnUpload();
        extentTest.log(LogStatus.PASS, "klik button upload untuk file txt");
    }

    @Then("TCC.Tele.008 Menampilkan popup file tidak dapat dibaca\\/jumlah data untuk file txt")
    public void tcc_tele_008_menampilkan_popup_file_tidak_dapat_dibaca_jumlah_data_untuk_file_txt() {
        hooks.waiting(3);
        Assert.assertEquals(uploadData.getTxtInformasiUpload(), "File tidak dapat dibaca/ jumlah data 0");
        extentTest.log(LogStatus.PASS,"Menampilkan popup file tidak dapat dibaca/jumlah data untuk file txt");
        driver.navigate().back();
    }

    //UPLOAD DATA 009
    @When("TCC.Tele.009 klik data untuk simpan file txt")
    public void tcc_tele_009_klik_data_simpan_file_txt() {
        driver.get(Constants.URL);
        uploadData.btnOkWelcome();
        uploadData.clickData();
        extentTest.log(LogStatus.PASS, "Klik Data untuk simpan file txt");
    }

    @And("TCC.Tele.009 klik upload data untuk simpan file txt")
    public void tcc_tele_009_klik_upload_data_simpan_file_txt() {
        uploadData.clickBtnUploadData();
        extentTest.log(LogStatus.PASS,"Klik upload data untuk simpan file txt");
    }

    @And("TCC.Tele.009 import simpan file txt")
    public void tcc_tele_009_import_simpan_file_txt() {
        uploadData.importFile("C:\\Users\\Moh_Eko11\\Documents\\situs.txt");
        extentTest.log(LogStatus.PASS, "import simpan file txt");
    }

    @And("TCC.Tele.009 klik button simpan file txt")
    public void tcc_tele_009_klik_button_simpan_file_txt() {
        uploadData.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "klik button simpan file txt");
    }

    @And("TCC.Tele.009 klik button simpan konfirmasi file txt")
    public void tcc_tele_009_klik_button_simpan_konfirmasi_file_txt() {
        hooks.waiting(3);
        uploadData.clickBtnSimpanKonfirmasi();
        extentTest.log(LogStatus.PASS,"klik button simpan konfirmasi file txt");
    }

    @Then("TCC.Tele.009 Menampilkan popup data kosong file txt")
    public void tcc_tele_009_menampilkan_popup_data_kosong_file_txt() {
        hooks.waiting(3);
        Assert.assertEquals(uploadData.getTxtInformasiSimpan(), "Data Kosong");
        extentTest.log(LogStatus.PASS, "menampilkan popup data kosong file txt");
    }

}**/
