package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadData {
    private WebDriver driver;

    public UploadData() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Login
    @FindBy(id = "tl_login-1-51550_text")
    WebElement usernameLogin;

    @FindBy(id = "tl_login-1-51551_text")
    WebElement passwordLogin;

    @FindBy(id = "51552_query")
    WebElement btnSignin;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOkWelcome;

    //Upload Data
    @FindBy(id = "ui-id-11")
    WebElement clickData;

    @FindBy(id = "52837_query")
    WebElement btnUploadData;

    @FindBy(id = "tl_upload_new--52043_text")
    WebElement importFile;

    @FindBy(id = "52044_query")
    WebElement btnUpload;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtInformasiUpload;

    //Simpan Data
    @FindBy(id = "52055_query")
    WebElement btnSimpan;

    @FindBy(id = "52057_query")
    WebElement btnSimpanKonfirmasi;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtInformasiSimpan;

    public void formLogin(String username, String password) {
        this.usernameLogin.sendKeys(username);
        this.passwordLogin.sendKeys(password);
        btnSignin.click();
    }

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public void clickData() {
        clickData.click();
    }

    //Upload
    public void clickBtnUploadData() {
        btnUploadData.click();
    }

    public void importFile(String pilihFile) {
        this.importFile.sendKeys(pilihFile);
    }

    public void clickBtnUpload() {
        btnUpload.click();
    }

    public String getTxtInformasiUpload() {
        return txtInformasiUpload.getText();
    }

    //Simpan
    public void clickBtnSimpan() {
        btnSimpan.click();
    }

    public void clickBtnSimpanKonfirmasi() {
        btnSimpanKonfirmasi.click();
    }

    public String getTxtInformasiSimpan() {
        return txtInformasiSimpan.getText();
    }
}
