package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAgent {
    private WebDriver driver;

    public LoginPageAgent() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tl_login-1-51550_text" )
    WebElement username;

    @FindBy(id = "tl_login-1-51551_text")
    WebElement password;

    @FindBy(id = "51552_query")
    WebElement btnLogin;

    @FindBy (className = "ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only")
    WebElement btnOkLogin;

    @FindBy(id = "file")
    WebElement TxtWelcomeToTeleKita;

    @FindBy(id = "nikita-form-dialog")
    WebElement TxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif;

    @FindBy (className = "ui-dialog-buttonset")
    WebElement btnOk;

    @FindBy (id = "52706_query")
    WebElement btnProfile;

    @FindBy (xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    WebElement btnYa;

    public void login (String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public void clickBtnOkLogin(){
        btnOkLogin.click();
    }

    public String getTxtWelcomeToTeleKita(){
        return TxtWelcomeToTeleKita.getText();

    }

    public String getTxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif(){
        return TxtUsernameAtaupPasswordTidakDitemukanAtauAkunAndaTidakAktif.getText();
    }

    public void clickBtnOK() { btnOk.click();}

    public void clickBtnProfile() { btnProfile.click();}

    public void clickBtnYa() { btnYa.click();}


}
