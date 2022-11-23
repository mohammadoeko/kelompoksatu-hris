package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditData {


    private WebDriver driver;

    public EditData() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ui-id-11")
    WebElement clickData;

    @FindBy(id = "52833_query")
    WebElement clickDistributeData;

    @FindBy(id = "tl_distribute--52071_text")
    WebElement txtDistribusi;

    @FindBy(id = "52851_query")
    WebElement clickEditData;

    @FindBy(id = "tl_edit_data--52532_text")
    WebElement inputSearch;

    @FindBy(id = "52538_query")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"tl_edit_data--52536-cell-0-2\"]")
    WebElement txtSepedaKenceng;


    @FindBy(xpath = "//*[@id=\"tl_edit_data--52536\"]/div[8]")
    WebElement txtSearchKosong;

    @FindBy(id = "tl_edit_data--52536-cell-0-2")
    WebElement txtViewTeleroEditData;


    @FindBy(id ="tl_edit_data--52536-cell-339-2")
    WebElement txtEntries500EditData;


    @FindBy(id ="tl_edit_data--52536-cell-99-2")
    WebElement txtEntries100EditData;


    @FindBy(id ="tl_edit_data--52536-cell-49-2")
    WebElement txtEntries50EditData;


    @FindBy(id= "tl_edit_data--52536-cell-24-2")
    WebElement txtEntries25EditData;

    @FindBy(id ="tl_edit_data--52536-cell-9-2")
    WebElement txtEntries10EditData;

    @FindBy(id ="tl_edit_data--52536_show_text")
    WebElement selectShowPageEditData;


    // next page
    @FindBy(id ="tl_edit_data--52536-cell-1-2")
    WebElement txtViewPage2EditData;

    @FindBy(id = "tl_edit_data--52536-cell-2-2")
    WebElement txtViewLastPageEditData;

    @FindBy(id = "tl_edit_data--52536-cell-3-2")
    WebElement txtViewFirstPageEditData;

    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[4]/ul[1]/li[3]/a[1]")
    WebElement btnPage2EditData;

    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[4]/ul[1]/li[8]/a[1]")
    WebElement btnLastPageEditData;

    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[4]/ul[1]/li[1]/a[1]")
    WebElement btnFirstPageEditData;


    // edit data

    @FindBy(id ="tl_edit_user_activity-12-52807_text")
    WebElement selectShowPageEditDataUser;

    @FindBy(id ="tl_edit_data--52536-cell-0-2")
    WebElement btnNamaPerusahaan;


    @FindBy(xpath="//body[1]/div[9]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[7]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/button[1]/span[1]")
    WebElement btnUpdateAgentEditData;


    @FindBy(id = "nikita-form-dialog dialog")
    WebElement txtDialogKotakInformasiUpdateData;


    @FindBy(xpath ="//body[1]/div[8]/div[3]/div[1]/button[1]/span[1]")
    WebElement btnOkUpdateData;


    @FindBy(id = "tl_edit_data--52536-cell-0-10")
    WebElement txtViewNamaAgent;


    public void clickBtnNamaPerusahaan() {
        btnNamaPerusahaan.click();
    }

    public String getTxtDialogInformasiUpdate() {
        return txtDialogKotakInformasiUpdateData.getText();
    }

    public String getTxtViewNamaAgent() {
        return txtViewNamaAgent.getText();
    }

    public void clickBtnUpdateAgenData() {
        btnUpdateAgentEditData.click();
    }

    public void clickBtnOkUpdateEditData() {
        btnOkUpdateData.click();
    }

    public void selectShowPageEditDataUser(String showPage){
        Select select = new Select(this.selectShowPageEditDataUser);
        select.selectByValue(showPage);
    }


    public void clickData() {
        clickData.click();
    }

    public void clickDistributeData() {
        clickDistributeData.click();
    }

    public String getTxtDistribusi() {
        return txtDistribusi.getText();
    }

    public void clickEditData() {
        clickEditData.click();
    }

    public void inputSearch(String search) {
        this.inputSearch.sendKeys(search);
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtSepedaKenceng() {
        return txtSepedaKenceng.getText();
    }

    public String getTxtSearchKosong() {
        return txtSearchKosong.getText();
    }

    public void selectShowPageEditData(String showPage){
        Select select = new Select(this.selectShowPageEditData);
        select.selectByValue(showPage);
    }

    public String getTxtShowEntries10Editdata(){
        return txtEntries10EditData.getText();
    }

    public String getTxtShowEntries25Editdata(){
        return txtEntries25EditData.getText();
    }

    public String getTxtShowEntries50Editdata(){
        return txtEntries50EditData.getText();
    }

    public String getTxtShowEntries100Editdata(){
        return txtEntries100EditData.getText();
    }

    public String getTxtShowEntries500Editdata(){
        return txtEntries500EditData.getText();
    }

    public String getTxtViewTeleroEditData(){
        return txtViewTeleroEditData.getText();
    }


    public void ClickBtnPage2EditData() {
        btnPage2EditData.click();
    }

    public String getTxtViewPage2EditData() {
        return txtViewPage2EditData.getText();
    }

    public void ClickBtnLastPageEditData() {
        btnLastPageEditData.click();
    }

    public String getTxtLastPageEditData() {
        return txtViewLastPageEditData.getText();
    }

    public void ClickBtnFirstPageEditData() {
        btnFirstPageEditData.click();
    }

    public String getTxtFirstPageEditData() {
        return txtViewFirstPageEditData.getText();
    }
}
