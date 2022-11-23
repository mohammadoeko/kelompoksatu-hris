package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskAgentDataAll {

    private WebDriver driver;

    public TaskAgentDataAll() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOkWelcome;

    @FindBy(id = "ui-id-5")
    WebElement clickTask;

    @FindBy(id = "52858_query")
    WebElement btnMenuDataAll;

    @FindBy(id = "tl_all_data--53024_text")
    WebElement txtDataAll;

    //SEARCH
    @FindBy(id = "tl_all_data--53023_text")
    WebElement inputSearchCustomer;

    @FindBy(id = "tl_all_data--53031_text")
    WebElement selectSearchAgent;

    @FindBy(id = "tl_all_data--53032_text")
    WebElement selectSearchStatus;

    @FindBy(id = "53029_query")
    WebElement btnSearch;

    @FindBy(id = "tl_all_data--53027-cell-0-1")
    WebElement txtSearchCustomer;

    @FindBy(id = "tl_all_data--53027-cell-1-1")
    WebElement txtSearchAgent;

    @FindBy(id = "tl_all_data--53027-cell-5-1")
    WebElement txtSearchStatus;

    //SHOWPAGE
    @FindBy(id = "tl_all_data--53027_show_text")
    WebElement selectShowEntries;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027_table\"]/tbody/tr[10]/td[1]/table/tbody/tr/td")
    WebElement txtShowEntries10;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027_table\"]/tbody/tr[25]/td[1]/table/tbody/tr/td")
    WebElement txtShowEntries25;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027_table\"]/tbody/tr[50]/td[1]/table/tbody/tr/td")
    WebElement txtShowEntries50;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027_table\"]/tbody/tr[100]/td[1]/table/tbody/tr/td")
    WebElement txtShowEntries100;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027\"]/div[9]/ul/li[3]")
    WebElement clickPage2;

    @FindBy(id = "tl_all_data--53027-cell-9-1")
    WebElement txtShowPage2;

    @FindBy(xpath = "//*[@id=\"tl_all_data--53027\"]/div[9]/ul/li[8]")
    WebElement clickLastPage;

    @FindBy(id = "tl_all_data--53027_page")
    WebElement clickFirstPage;

    @FindBy(id = "53069_query")
    WebElement btnAddPhone;

    @FindBy(id = "tl_multi_add_phone--51838_text")
    WebElement inputRequestPhone;

    @FindBy(id = "51839_query")
    WebElement btnSave;

    @FindBy(id = "nikita-form-dialog")
    WebElement txtPopupInformation;

    @FindBy(id = "tl_all_data--53027-cell-0-1")
    WebElement clickMasHarun3;

    @FindBy(id = "53058_query")
    WebElement btnSubmit;

    @FindBy(id = "tl_user_activity--53076_text")
    WebElement selectChannel;

    @FindBy(id = "tl_user_activity--53050_text")
    WebElement selectStatus;

    @FindBy(id = "tl_user_activity--53048_text")
    WebElement selectStatusCall;

    @FindBy(id = "tl_user_activity--53051_text")
    WebElement selectStatusResult;

    @FindBy(id = "tl_user_activity--53052_text")
    WebElement selectReason;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]")
    WebElement btnYesKonfirmasi;

    @FindBy(id = "tl_all_data--53027-cell-0-8")
    WebElement txtStatusResultFollowUp;

    @FindBy(id = "tl_all_data--53027-cell-0-6")
    WebElement txtReasonFollowUp;

    @FindBy(id = "tl_user_activity--53057_text")
    WebElement selectPhone;

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public void clickTask() {
        clickTask.click();
    }

    public void btnMenuDataAll() {
        btnMenuDataAll.click();
    }

    public String getTxtDataAll() {
        return txtDataAll.getAttribute("value");
    }

    public void inputSearchCustomer(String searchCustomer) {
        this.inputSearchCustomer.sendKeys(searchCustomer);
    }

    public void selectSearchAgent(String selectAgent) {
        Select select = new Select(this.selectSearchAgent);
        select.selectByValue(selectAgent);
    }

    public void selectSearchStatus(String selectStatus) {
        Select select = new Select(this.selectSearchStatus);
        select.selectByValue(selectStatus);
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtSearchCustomer() {
        return txtSearchCustomer.getText();
    }

    public String getTxtSearchAgent() {
        return txtSearchAgent.getText();
    }

    public String getTxtSearchStatus() {
        return txtSearchStatus.getText();
    }

    public void selectShowEntries(String selectEntries) {
        Select select = new Select(this.selectShowEntries);
        select.selectByValue(selectEntries);
    }

    public String getTxtShowEntries10() {
        return txtShowEntries10.getText();
    }

    public String getTxtShowEntries25() {
        return txtShowEntries25.getText();
    }

    public String getTxtShowEntries50() {
        return txtShowEntries50.getText();
    }

    public String getTxtShowEntries100() {
        return txtShowEntries100.getText();
    }

    public void clickPage2() {
        clickPage2.click();
    }

    public void clickLastPage() {
        clickLastPage.click();
    }

    public void clickFirstPage() {
        clickFirstPage.click();
    }

    public String getTxtShowPage2() {
        return txtShowPage2.getText();
    }

    public void clickMasHarun3() {
        clickMasHarun3.click();
    }

    public void btnAddPhone() {
        btnAddPhone.click();
    }

    public void inputRequestPhone(String phoneNumber) {
        this.inputRequestPhone.sendKeys(phoneNumber);
    }

    public void btnSave() {
        btnSave.click();
    }

    public String getTxtPopupInformation() {
        return txtPopupInformation.getText();
    }

    public void btnSubmit() {
        btnSubmit.click();
    }

    public void formStatusAcitivity(String selectChannel, String selectStatus, String selectStatusCall, String selectStatusResult, String selectReason) {
        Select pilihChannel = new Select(this.selectChannel);
        pilihChannel.selectByValue(selectChannel);
        waiting(3);

        Select pilihStatus = new Select(this.selectStatus);
        pilihStatus.selectByValue(selectStatus);
        waiting(3);

        Select pilihStatusCall = new Select(this.selectStatusCall);
        pilihStatusCall.selectByValue(selectStatusCall);
        waiting(3);

        Select pilihStatusResult = new Select(this.selectStatusResult);
        pilihStatusResult.selectByValue(selectStatusResult);
        waiting(3);

        Select pilihReason = new Select(this.selectReason);
        pilihReason.selectByValue(selectReason);
        waiting(3);
    }

    public void btnYesKonfirmasi() {
        btnYesKonfirmasi.click();
    }

    public String getTxtStatusResultFollowUp() {
        return txtStatusResultFollowUp.getText();
    }

    public String getTxtReasonFollowUp() {
        return txtReasonFollowUp.getText();
    }

    public void selectPhone(String selectPhone) {
        Select pilihPhone = new Select(this.selectPhone);
        pilihPhone.selectByValue(selectPhone);
    }

    public void waiting(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
