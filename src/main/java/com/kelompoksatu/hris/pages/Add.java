package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add{
    private WebDriver driver;

    public Add() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "51683_query")
    WebElement btnAdd;

    @FindBy(id = "formtl_agent_editable-14")
    WebElement txtFormAddPage;
    @FindBy(id = "51742_query")
    WebElement btnSave;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    WebElement btnYes;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnOkpopup;

    //ISI FORM
    @FindBy(id = "tl_agent_editable-14-51730_text")
    WebElement inputFullName;
    @FindBy(id = "tl_agent_editable-14-51731_text")
    WebElement selectPrivileges;
    @FindBy(id = "tl_agent_editable-14-51733_text")
    WebElement selectSupervisor;
    @FindBy(id = "tl_agent_editable-14-51736_text")
    WebElement inputTelephone;
    @FindBy(id = "tl_agent_editable-14-51740_text")
    WebElement inputUserName;
    @FindBy(id = "tl_agent_editable-14-51741_text")
    WebElement inputPassword;
    @FindBy(id = "tl_agent_editable-14-51730_text")
    WebElement inputFullNameangka;
    //menu
    public void ClickBtnAdd() {

        btnAdd.click();
    }
    public void ClickBtnSave() {

        btnSave.click();
    }
    public void ClickBtnYes(){

        btnYes.click();
    }
    public void ClickBtnOkpopup(){

        btnOkpopup.click();
    }
    public void inputFullName(String Stelani) {

        this.inputFullName.sendKeys(Stelani);
    }
    public void selectPrivileges(String Privileges) {
        Select select = new Select(this.selectPrivileges);
        select.selectByValue(Privileges);
    }
    public void selectSupervisor(String Supervisor) {
        Select select = new Select(this.selectSupervisor);
        select.selectByValue(Supervisor);
    }
    public void inputTelephone(String inputTelephone) {

        this.inputTelephone.sendKeys(inputTelephone);
    }
    public void inputUserName(String smsmsm) {

        this.inputUserName.sendKeys(smsmsm);
    }
    public void inputPassword(String inputPassword) {

        this.inputPassword.sendKeys(inputPassword);
    }
    public void inputFullNameangka(String inputFullNameangka) {

        this.inputFullNameangka.sendKeys(inputFullNameangka);
    }
    //validasi
    public String getTxtFormAddPage() {

        return txtFormAddPage.getText();
    }

}
