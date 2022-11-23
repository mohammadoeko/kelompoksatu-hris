package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tl_login-1-51550_text")
    WebElement username;

    @FindBy(id = "tl_login-1-51551_text")
    WebElement password;

    @FindBy(xpath = "//body[1]/div[8]/div[2]/div[1]/div[3]/button[1]/span[1]")
    WebElement btnLogin;

    @FindBy(id = "nikita-form-dialog")
    WebElement txtWelcomeToTelekita;

    @FindBy(xpath = "//body[1]/div[10]/div[2]")
    WebElement txtInvalidCredentials;

    @FindBy(xpath = "//body[1]/div[10]/div[3]/div[1]/button[1]/span[1]")
    WebElement btnOkInvalidCredentials;

    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement txtRequired;


    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/font[1]")
    WebElement txtTeleMarketing;


    public String getTxtTeleMarketing(){
        return txtTeleMarketing.getText();
    }
    @FindBy(xpath = "//body[1]/div[8]/div[3]/div[1]/button[1]/span[1]")
    WebElement btnOkWelcome;


    @FindBy(id = "52706_query")
    WebElement btnDeveloperProfilTeleLogout;

    @FindBy(id = "52706_query")
    WebElement btnYaProfilTeleLogout;

    public void clicklogouttele() {
        btnDeveloperProfilTeleLogout.click();
        btnYaProfilTeleLogout.click();
    }



    @FindBy(xpath = " //body[1]/div[2]/div[1]/button[1]/span[1]")
    WebElement btnDeveloperProfil;

    public void ClickBtnDeveloperProfil() {
        btnDeveloperProfil.click();
    }
    @FindBy(xpath = "//body[1]/div[8]/div[3]/div[1]/button[2]/span[1]")
    WebElement btnYaInformasiLogout;

    public void ClickbtnYaInformasiLogout() {
        btnYaInformasiLogout.click();
    }




    @FindBy(id = "formtl_login-1")
    WebElement txtDialogLogin;

    public String getTxtInformasiLogin(){
        return txtDialogLogin.getText();
    }

    @FindBy(id = "nikita-form-dialog")
    WebElement txtInformasiLogout;

    public String getTxtInformasiLogout(){
        return txtInformasiLogout.getText();
    }

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }

    public void clickOkinvalidCredentials(){
        btnOkInvalidCredentials.click();
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }


    public String getTxtWelcomeToTelekita(){
        return txtWelcomeToTelekita.getText();
    }

    public String getTxtInvalidCredentials(){
        return txtWelcomeToTelekita.getText();
    }

    public String getTxtRequired(){
        return txtRequired.getText();
    }




}