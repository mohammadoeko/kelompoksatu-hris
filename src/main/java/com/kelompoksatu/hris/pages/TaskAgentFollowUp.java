package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskAgentFollowUp {
    private WebDriver driver;

    public TaskAgentFollowUp() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "tl_login-1-51550_text")
    WebElement usernameAgent;

    @FindBy(id = "tl_login-1-51551_text")
    WebElement passwordAgent;

    @FindBy(id = "51552_query")
    WebElement btnSignin;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOkWelcome;

    @FindBy(id = "ui-id-5")
    WebElement clickTask;

    @FindBy(id = "52834_query")
    WebElement btnMenuFollowUp;

    @FindBy(id = "tl_thinking--52762_text")
    WebElement txtDataThinking;

    @FindBy(id = "tl_thinking--52761_text")
    WebElement inputSearch;

    @FindBy(id = "52767_query")
    WebElement btnSearch;

    @FindBy(id = "tl_thinking--52765-cell-0-1")
    WebElement txtTesAja9;

    @FindBy(id = "tl_thinking--52765-cell-3-1")
    WebElement txtCacaHijab;

    //SHOWPAGE
    @FindBy(id = "tl_thinking--52765_show_text")
    WebElement selectShowPage;


    // NEXTPAGE
    @FindBy(xpath = "//*[@id=\"tl_thinking--52765\"]/div[4]/ul/li[3]")
    WebElement clickPage2;

    @FindBy(xpath = "//*[@id=\"tl_thinking--52765\"]/div[4]/ul/li[4]")
    WebElement clickLastPage;

    @FindBy(id = "tl_thinking--52765_page")
    WebElement clickFirstPage;

    @FindBy(id = "tl_thinking--52765-cell-0-1")
    WebElement txtNamaPerusahaanPage2;

    @FindBy(id = "tl_thinking--52765-cell-0-1")
    WebElement txtNamaPerusahaanLastPage;

    @FindBy(id = "tl_thinking--52765-cell-1-1")
    WebElement txtNamaPerusahaanFirstPage;


    //ADD PHONE
    @FindBy(id = "tl_thinking--52765-cell-6-1")
    WebElement clickDataRumah9;

    @FindBy(id = "53069_query")
    WebElement btnAddPhone;

    @FindBy(id = "tl_multi_add_phone--51838_text")
    WebElement inputRequestPhone;

    @FindBy(id = "51839_query")
    WebElement btnSave;

    @FindBy(id = "nikita-form-dialog")
    WebElement txtPopupInformation;

    //Edit Status Activity
    @FindBy(id = "tl_thinking--52765-cell-4-1")
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

    @FindBy(id = "tl_thinking--52765-cell-4-7")
    WebElement txtStatusResultFollowUp;

    @FindBy(id = "tl_thinking--52765-cell-4-5")
    WebElement txtReasonFollowUp;

    @FindBy(id = "tl_user_activity--53057_text")
    WebElement selectPhone;

    public void loginAgent(String usernameAgent, String passwordAgent) {
        this.usernameAgent.sendKeys(usernameAgent);
        this.passwordAgent.sendKeys(passwordAgent);
        btnSignin.click();
    }

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public void clickTask() {
        clickTask.click();
    }

    public void btnMenuFollowUp() {
        btnMenuFollowUp.click();
    }

    public String getTxtDataThinking() {
        return txtDataThinking.getAttribute("value");
    }

    public void inputSearch(String inputSearch) {
        this.inputSearch.sendKeys(inputSearch);
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtTesAja9() {
        return txtTesAja9.getText();
    }

    public String getTxtCacaHijab() {
        return txtCacaHijab.getText();
    }

    public void selectShowPage(String showPage){
        Select selectShowPage = new Select(this.selectShowPage);
        selectShowPage.selectByValue(showPage);
    }

    public void clickPage2() {
        clickPage2.click();
    }

    public void clickLastPage() {
        clickLastPage.click();
    }

    public void setClickFirstPage() {
        clickFirstPage.click();
    }

    public String getTxtNamaPerusahaanPage2() {
        return txtNamaPerusahaanPage2.getText();
    }

    public String getTxtNamaPerusahaanLastPage() {
        return txtNamaPerusahaanLastPage.getText();
    }

    public String getTxtNamaPerusahaanFirstPage() {
        return txtNamaPerusahaanFirstPage.getText();
    }

    public void clickDataRumah9() {
        clickDataRumah9.click();
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

    public void clickMasHarun3() {
        clickMasHarun3.click();
    }

    public void btnSubmit() {
        btnSubmit.click();
    }

    public void formStatusAcitivity(String selectChannel, String selectStatus, String selectStatusCall, String selectStatusResult, String selectReason) {
        Select pilihChannel = new Select(this.selectChannel);
        pilihChannel.selectByValue(selectChannel);
        waiting(2);

        Select pilihStatus = new Select(this.selectStatus);
        pilihStatus.selectByValue(selectStatus);
        waiting(2);

        Select pilihStatusCall = new Select(this.selectStatusCall);
        pilihStatusCall.selectByValue(selectStatusCall);
        waiting(2);

        Select pilihStatusResult = new Select(this.selectStatusResult);
        pilihStatusResult.selectByValue(selectStatusResult);
        waiting(2);

        Select pilihReason = new Select(this.selectReason);
        pilihReason.selectByValue(selectReason);
        waiting(2);
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
