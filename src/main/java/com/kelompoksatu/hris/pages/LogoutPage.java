package com.kelompoksatu.hris.pages;

//import com.kelompoksatu.hris.step_definitions;
import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogoutPage {
    private WebDriver driver;

    //private Hooks hooks = new Hooks();
    public LogoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "52706_query")
    WebElement btnDeveloperProfilTeleLogout;

    @FindBy(id = "52706_query")
    WebElement btnYaProfilTeleLogout;

    public void ClickLogoutTele() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        btnDeveloperProfilTeleLogout.click();
        //hooks.waiting(2);
        js.executeScript("arguments[0].click();", btnYaProfilTeleLogout);
        //btnYaProfilTeleLogout.click();
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
}
