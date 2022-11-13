package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void clickData() {
        clickData.click();
    }

    public void clickDistributeData() {
        clickDistributeData.click();
    }

    public String getTxtDistribusi() {
        return txtDistribusi.getAttribute("value");
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
}
