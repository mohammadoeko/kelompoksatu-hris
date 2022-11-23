package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AgentAgree {

    private WebDriver driver;
    public AgentAgree(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ui-id-5")
    WebElement btnTask;

    @FindBy (id = "52826_query")
    WebElement btnAgree;

    @FindBy (id = "tl_agree--52770_text")
    WebElement search;

    @FindBy (id = "52776_query")
    WebElement btnSearch;

    @FindBy (xpath = "//*[@id=\"tl_agree--52774\"]/div[9]/ul/li[3]/a")
    WebElement btnPageTwo;

    @FindBy (xpath = "//*[@id=\"tl_agree--52774\"]/div[9]/ul/li[4]/a")
    WebElement btnPageThree;

    @FindBy (id = "tl_agree--52774_show_text")
    WebElement selectShowPage;

    @FindBy (xpath = "//*[@id=\"tl_agree--52774\"]/div[9]/ul/li[5]/a")
    WebElement btnLastPage;

    @FindBy (xpath = "//*[@id=\"tl_agree--52774_page\"]")
    WebElement btnFirstPage;

    @FindBy (xpath = "//*[@id=\"tl_agree--52774-cell-0-1\"]")
    WebElement selectData;

    @FindBy (id = "tl_user_activity_agree-1212-52891_text")
    WebElement link;

    @FindBy (xpath = "//*[@id=\"52886_query\"]/span")
    WebElement btnUpdate;

    @FindBy (xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnOk;

    public void clickBtnTask() {
        btnTask.click();
    }

    public void clickBtnAgree() {
        btnAgree.click();
    }

    public void Search (String search){
        this.search.sendKeys(search);
    }

    public void clickBtnSearch() {
        btnSearch.click();
    }

    public void clickBtnPageTwo() {
        btnPageTwo.click();
    }

    public void clickBtnPageThree() {
        btnPageThree.click();
    }

    public void selectShowPage(String valueShowPage){
        Select select = new Select(selectShowPage);
        select.selectByValue(valueShowPage);
    }

    public void clickBtnLastPage() {
        btnLastPage.click();
    }

    public void clickBtnFirstPage() {
        btnFirstPage.click();
    }

    public void clickSelectData() {
        selectData.click();
    }

    public void Link (String link){
        this.link.sendKeys(link);
    }

    public void clickBtnUpdate() {
        btnUpdate.click();
    }

    public void clickBtnOk() {
        btnOk.click();
    }
}
