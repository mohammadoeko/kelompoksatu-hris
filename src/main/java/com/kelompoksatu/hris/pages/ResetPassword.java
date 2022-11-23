package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword {
    private WebDriver driver;

    public ResetPassword() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "51685_query")
    WebElement btnResetPass;

    @FindBy(id = "//*[@id=\"tl_user_management--51688_table\"]/tbody/tr[2]/td[1]/input")
    WebElement btnInputdata;
    @FindBy(id = "/html/body/div[8]/div[3]/div/button[2]")
    WebElement btnSave;
    @FindBy(id = "/html/body/div[8]/div[3]/div/button")
    WebElement btnDone;

    public void ClickBtnResetPass () {

        btnResetPass.click();
    }
    public void ClickInputdata () {

        btnInputdata.click();
    }
    public void ClickSave () {

        btnSave.click();
    }
    public void ClickDone () {

        btnDone.click();
    }
}
