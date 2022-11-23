package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PhoneApprove {

    private WebDriver driver;

    public PhoneApprove() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // PhoneApprove
    @FindBy(id = "ui-id-13")
    WebElement clickUserManagement;

    @FindBy(xpath = "//*[@id=\"52838_query\"]/span")
    WebElement txtPhoneApprove;

    @FindBy(id = "52838_query")
    WebElement btnMenuPhoneApprove;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOkWelcome;

    @FindBy(id = "tl_add_phone--51827_text")
    WebElement txtAdditionalPhone;

    @FindBy(id = "51823_query")
    WebElement btnApprove;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
    WebElement btnYes;

    @FindBy(id = "51821_query")
    WebElement btnSearch;

    @FindBy(id = "nikita-form-dialog")
    WebElement txtInformasi;



    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825_table\"]/tbody/tr[6]/td[1]/table/tbody/tr/td[2]/input")
    WebElement checkboxAgent;

    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825_table\"]/tbody/tr[8]/td[1]/table/tbody/tr/td[2]/input")
    WebElement checkboxReject;

    @FindBy(id = "tl_add_phone--51825-cell-0-1")
    WebElement txtnamaAgent;

    @FindBy(id = "tl_add_phone--51816_text")
    WebElement inputSearchAgent;

    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825\"]/div[8]")
    WebElement txtNoEntries;

    @FindBy(xpath = "/html/body/div[8]/div[1]/button")
    WebElement btnNo;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnDone;

    @FindBy(id = "51824_query")
    WebElement btnReject;

    @FindBy(id = "tl_add_phone--51825_show_text")
    WebElement selectShowPage;

    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825_table\"]/tbody/tr[10]/td[1]/table/tbody/tr/td[1]")
    WebElement txtShowPage10;

    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825_table\"]/tbody/tr[25]/td[1]/table/tbody/tr/td[1]")
    WebElement txtShowPage25;

    @FindBy(xpath = "//*[@id=\"tl_add_phone--51825_table\"]/tbody/tr[50]/td[1]/table/tbody/tr/td[1]")
    WebElement txtShowPage50;

    @FindBy(id = "tl_add_phone--51825-cell-0-1")
    WebElement txtAgent;

    @FindBy(id = "tl_add_phone--51825-cell-0-2")
    WebElement txtNomorHandphone;

    @FindBy(id = "tl_add_phone--51825-cell-0-3")
    WebElement txtTanggalRequest;

    @FindBy(id = "tl_add_phone--51825-cell-0-4")
    WebElement txtNama;

    @FindBy(id = "tl_add_phone--51825-cell-0-5")
    WebElement txtStatus;

    public void clickUserManagement() {
        clickUserManagement.click();
    }

    public String getTxtPhoneApprove() {
        return txtPhoneApprove.getText();
    }

    public void btnMenuPhoneApprove() {
        btnMenuPhoneApprove.click();
    }

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public String getTxtAdditionalPhone() {
        return txtAdditionalPhone.getAttribute("value");
    }

    public void btnApprove() {
        btnApprove.click();
    }

    public void btnYes() {
        btnYes.click();
    }

    public String getTxtInformasi() {
        return txtInformasi.getText();
    }

    public void checkboxAgent() {
        checkboxAgent.click();
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtnamaAgent() {
        return txtnamaAgent.getText();
    }

    public void inputSearchAgent(String searchAgent) {
        this.inputSearchAgent.sendKeys(searchAgent);
    }

    public String getTxtNoEntries() {
        return txtNoEntries.getText();
    }

    public void btnNo() {
        btnNo.click();
    }

    public void btnDone() {
        btnDone.click();
    }

    public void btnReject() {
        btnReject.click();
    }

    public void checkboxReject() {
        checkboxReject.click();
    }

    public void selectShowPage(String showPage) {
        Select select = new Select(this.selectShowPage);
        select.selectByValue(showPage);
    }

    public String getTxtShowPage10() {
        return txtShowPage10.getText();
    }

    public String getTxtShowPage25() {
        return txtShowPage25.getText();
    }

    public String getTxtShowPage50() {
        return txtShowPage50.getText();
    }

    public String getTxtAgent() {
        return txtAgent.getText();
    }

    public String getTxtNumberPhone() {
        return txtNomorHandphone.getText();
    }

    public String getTxtTanggalRequest() {
        return txtTanggalRequest.getText();
    }

    public String getTxtNama() {
        return txtNama.getText();
    }

    public String getTxtStatus() {
        return txtStatus.getText();
    }
}
