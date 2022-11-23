package com.kelompoksatu.hris.pages;



import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.Keys.ENTER;

public class DistributeData {
    private WebDriver driver;


    public DistributeData() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //DISTRIBUTE DATA VIEW

    @FindBy(id = "ui-id-11")
    WebElement clickData;

    @FindBy(id = "52833_query")
    WebElement clickDistributeData;

    @FindBy(id = "tl_distribute--52075_verr")
    WebElement clickStatus;

    @FindBy(id = "ddcl-tl_distribute--52075_select-i0")
    WebElement checkboxStatus;

    @FindBy(id = "tl_distribute--52078_verr")
    WebElement clickBuketData;

    @FindBy(id = "ddcl-tl_distribute--52078_select-i5")
    WebElement checkboxBuketData;

    @FindBy(id = "ddcl-tl_distribute--52078_select-i0")
    WebElement checkboxBuketDatadefault;


    @FindBy(id = "52077_query")
    WebElement btnView;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtInformation;


    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[4]/div[4]/ul[1]/li[3]/a[1]")
    WebElement btnPage2Distribusi;

    @FindBy(id = "tl_distribute--52062-cell-1-1")
    WebElement txtPageDuaDistribusi;


    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[4]/div[4]/ul[1]/li[8]/a[1]")
    WebElement BtnLastPageDistribusi;

    @FindBy(id = "tl_distribute--52062-cell-2-1")
    WebElement txtLastPageDistribusi;

    @FindBy(id = "tl_distribute--52062_page")
    WebElement btnFirstPage;

    @FindBy(id = "tl_distribute--52062-cell-3-1")
    WebElement txtFirstPageDistribusi;



    @FindBy(id = "tl_distribute--52062_show_text")
    WebElement selectShowPageDistribusi;

    @FindBy(id = "tl_distribute--52062-cell-9-1")
    WebElement txtShowEntriesDistribusidata10;




    @FindBy(id = "tl_distribute--52062-cell-24-1")
    WebElement txtShowEntriesDistribusidata25;

    @FindBy(id = "tl_distribute--52062-cell-49-1")
    WebElement txtShowEntriesDistribusidata50;

    @FindBy(id = "tl_distribute--52062-cell-99-1")
    WebElement txtShowEntriesDistribusidata100;

    @FindBy(id = "tl_distribute--52062-cell-126-1")
    WebElement txtShowEntriesDistribusidata500;

    @FindBy(xpath = "//thead/tr[@id='tl_distribute--52062-header']/th[3]")
    WebElement txthalamandistribusidata;

    @FindBy(id = "tl_distribute--52062-cell-0-1")
    WebElement txtViewDistribusiData;


    //DISTRIBUSI

    @FindBy(id = "tl_distribute--52066_verr")
    WebElement clickDistribusiKe;

    @FindBy(id = "ddcl-tl_distribute--52066_select-i2")
    WebElement checkboxDistribusiKe;

    @FindBy(id = "tl_distribute--52070_text")
    WebElement jumlahPerAgent;

    @FindBy(id = "52065_query")
    WebElement btnDistribusi;

    @FindBy(xpath = "//body[1]/div[8]/div[3]/div[1]/button[2]/span[1]")
    WebElement btnYaDialogDistribusi;

    // VIEW
    public void clickData() {
        clickData.click();
    }

    public void clickDistributeData() {
        clickDistributeData.click();
    }

    public void checkboxStatus() {
        clickStatus.click();
        checkboxStatus.click();
        checkboxStatus.sendKeys(ENTER);
    }

    public void checkboxBuketData() {
        clickBuketData.click();
        checkboxBuketDatadefault.click();
        checkboxBuketData.click();
        checkboxBuketData.sendKeys(ENTER);
    }

    public void btnView() {
        btnView.click();
    }

    public String getTxtInformation() {
        return txtInformation.getText();
    }

    public void selectShowPageDistribusi(String showPage){
        Select select = new Select(this.selectShowPageDistribusi);
        select.selectByValue(showPage);
    }

    public String getTxtShowEntries10Distribusidata(){
        return txtShowEntriesDistribusidata10.getText();
    }

    public String getTxtShowEntries25Distribusidata(){
        return txtShowEntriesDistribusidata25.getText();
    }

    public String getTxtShowEntries50Distribusidata(){
        return txtShowEntriesDistribusidata50.getText();
    }

    public String getTxtShowEntries100Distribusidata(){
        return txtShowEntriesDistribusidata100.getText();
    }

    public String getTxtShowEntries500Distribusidata(){
        return txtShowEntriesDistribusidata500.getText();
    }

    public String getTxtHalamandistribusidata(){
        return txthalamandistribusidata.getText();
    }

    public String getTxtViewDistribusiData(){
        return txtViewDistribusiData.getText();
    }

    public void btnPage2Distribusi() {
        btnPage2Distribusi.click();
    }

    public String getTxtPage2Distribusi() {
        return txtPageDuaDistribusi.getText();
    }

    public void ClickBtnLastPageDistribusi() {
        BtnLastPageDistribusi.click();
    }

    public String getTxtLastPageDistribusi() {
        return txtLastPageDistribusi.getText();
    }

    public void btnFirstPage() {
        btnFirstPage.click();
    }

    public String getTxtFirstPageDistribusi() {
        return txtFirstPageDistribusi.getText();
    }







    // DISTRIBUSI KE
    public void checkboxDistribusiKe() {
        clickDistribusiKe.click();
        checkboxDistribusiKe.click();
        checkboxDistribusiKe.sendKeys(ENTER);
    }

    public void jumlahPerAgent(String jumlahPerAgent) {
        this.jumlahPerAgent.sendKeys(jumlahPerAgent);
    }

    public void btnDistribusi() {
        btnDistribusi.click();
    }

    public void btnYaDialogDistribusi() {
        btnYaDialogDistribusi.click();
    }
}