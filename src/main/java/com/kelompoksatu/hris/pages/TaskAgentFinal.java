package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskAgentFinal {
    private WebDriver driver;

    public TaskAgentFinal() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOkWelcome;

    @FindBy(id = "ui-id-5")
    WebElement clickTask;

    @FindBy(id = "52841_query")
    WebElement btnMenuFinal;

    @FindBy(id = "tl_final--52228_text")
    WebElement txtDataFinal;

    @FindBy(id = "tl_final--52227_text")
    WebElement inputSearch;

    @FindBy(id = "52233_query")
    WebElement btnSearch;

    @FindBy(id = "tl_final--52231-cell-0-1")
    WebElement txtTesAja7;

    @FindBy(id = "tl_final--52231-cell-7-1")
    WebElement txtSearch7;

    @FindBy(id = "tl_final--52231-cell-1-1")
    WebElement txtSearch_;

    //SHOWPAGE
    @FindBy(id = "tl_final--52231_show_text")
    WebElement selectShowPage;

    @FindBy(id = "tl_final--52231-cell-24-1")
    WebElement txtShowpage25;

    // NEXTPAGE
    @FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[9]/ul/li[3]")
    WebElement clickPage2;

    @FindBy(xpath = "//*[@id=\"tl_final--52231\"]/div[4]/ul/li[5]")
    WebElement clickLastPage;

    @FindBy(id = "tl_final--52231_page")
    WebElement clickFirstPage;

    @FindBy(id = "tl_final--52231-cell-9-1")
    WebElement txtNamaPerusahaanPage2;

    @FindBy(id = "tl_final--52231-cell-8-1")
    WebElement txtNamaPerusahaanLastPage;

    @FindBy(id = "tl_final--52231-cell-9-1")
    WebElement txtNamaPerusahaanFirstPage;

    public void btnOkWelcome() {
        btnOkWelcome.click();
    }

    public void clickTask() {
        clickTask.click();
    }

    public void btnMenuFinal() {
        btnMenuFinal.click();
    }

    public String getTxtDataFinal() {
        return txtDataFinal.getAttribute("value");
    }

    public void inputSearch(String inputSearch) {
        this.inputSearch.sendKeys(inputSearch);
    }

    public void btnSearch() {
        btnSearch.click();
    }

    public String getTxtTesAja7() {
        return txtTesAja7.getText();
    }

    public String getTxtSearch7() {
        return txtSearch7.getText();
    }

    public String getTxtSearch_() {
        return txtSearch_.getText();
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

    public String getTxtShowpage25() {
        return txtShowpage25.getText();
    }
}
