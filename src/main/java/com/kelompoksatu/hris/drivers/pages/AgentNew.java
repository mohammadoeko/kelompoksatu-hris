package com.kelompoksatu.hris.drivers.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AgentNew {
    private WebDriver driver;

    public AgentNew() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "ui-id-5")
    WebElement btnTask;

    @FindBy(id = "52827_query")
    WebElement btnNew;

    @FindBy(xpath = "//input[@id='tl_data_new--52964_text']")
    WebElement TxtDataNew;

    @FindBy (xpath = "//input[@id='tl_data_new--52963_text']")
    WebElement search;

    @FindBy (xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;

    @FindBy (xpath = "//div[9]//ul[1]//li[3]//a[1]")
    WebElement btnPageTwo;

    @FindBy (xpath = "//*[@id=\"tl_data_new--52967\"]/div[9]/ul/li[4]/a")
    WebElement btnPageThree;

    @FindBy (xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[5]/a")
    WebElement btnPageFour;

    @FindBy (xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[6]/a")
    WebElement btnPageFive;


    @FindBy (xpath = "//select[@id='tl_data_new--52967_show_text']")
    WebElement selectShowPage;

    @FindBy (xpath = "//*[@id=\"tl_data_new--52967\"]/div[4]/ul/li[6]/a")
    WebElement btnLastPage;

    @FindBy (xpath = "//*[@id=\"tl_data_new--52967_page\"]")
    WebElement btnFirstPage;

    @FindBy (id = "tl_data_new--52967-cell-0-1")
    WebElement selectData;

    @FindBy (xpath = "//*[@id=\"53069_query\"]/span")
    WebElement btnAddPhone;

    @FindBy (id = "tl_multi_add_phone--51838_text")
    WebElement phoneNumber;

    @FindBy (xpath = "//*[@id=\"51839_query\"]")
    WebElement btnSavePhone;

    @FindBy (xpath = "/html/body/div[8]/div[3]/div")
    WebElement btnOk;

    @FindBy (xpath = "/html/body/div[11]/div[1]/div")
    WebElement btnClose;

    @FindBy (xpath = "//*[@id=\"53058_query\"]/span")
    WebElement btnSubmit;

    @FindBy (xpath = "/html/body/div[8]/div[1]/button/span[1]")
    WebElement btnCloseEdit;

    @FindBy (id = "tl_user_activity--53076_text")
    WebElement selectChannel;

    @FindBy (id = "tl_user_activity--53050_text")
    WebElement selectStatus;

    @FindBy (id = "tl_user_activity--53048_text")
    WebElement selectStatusCall;

    @FindBy (id = "tl_user_activity--53051_text")
    WebElement selectStatusResult;

    @FindBy (xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    WebElement btnYes;

    @FindBy (id = "tl_user_activity--53052_text")
    WebElement selectReason;



    public void clickBtnTask() {
        btnTask.click();
    }

    public void clickBtnNew() {
        btnNew.click();
    }

    public String getTxtDataNew() {
        return TxtDataNew.getText();
    }

    public void Search (String search){
        this.search.sendKeys(search);
    }

    public void clickBtnSearch(){
        btnSearch.click();
    }

    public void clickBtnPageTwo() { btnPageTwo.click(); }

    public void clickBtnPageThree() { btnPageThree.click(); }

    public void clickBtnPageFour() { btnPageFour.click(); }

    public void clickBtnPageFive() { btnPageFive.click(); }

    public void selectShowPage(String valueShowPage){
        Select select = new Select(selectShowPage);
        select.selectByValue(valueShowPage);
    }

    public void clickBtnLastPage() { btnLastPage.click(); }

    public void clickBtnFirstPage() { btnFirstPage.click(); }

    public void clickSelectData() { selectData.click(); }

    public void clickBtnAddPhone() { btnAddPhone.click(); }

    public void addPhone (String addPhone){
        this.phoneNumber.sendKeys(addPhone);
    }

    public void clickBtnSavePhone() { btnSavePhone.click(); }

    public void clickBtnOk() { btnOk.click(); }

    public void clickBtnClose() { btnClose.click(); }

    public void clickBtnSubmit() { btnSubmit.click(); }

    public void clickBtnCloseEdit() { btnCloseEdit.click(); }

    public void selectChannel(String valueChannel){
        Select select = new Select(selectChannel);
        select.selectByValue(valueChannel);
    }

    public void selectStatus(String valueStatus){
        Select select = new Select(selectStatus);
        select.selectByValue(valueStatus);
    }

    public void selectStatusCall(String valueStatusCall){
        Select select = new Select(selectStatusCall);
        select.selectByValue(valueStatusCall);
    }

    public void selectStatusResult(String valueStatusResult){
        Select select = new Select(selectStatusResult);
        select.selectByValue(valueStatusResult);
    }

    public void clickBtnYes() { btnYes.click(); }

    public void selectReason(String valueReason){
        Select select = new Select(selectReason);
        select.selectByValue(valueReason);
    }

}
