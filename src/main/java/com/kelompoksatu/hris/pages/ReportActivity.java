package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportActivity {
    private WebDriver driver;

    public ReportActivity() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // ReportAgree
    @FindBy(id = "ui-id-19")
    WebElement clickReport;

    @FindBy(id = "52836_query")
    WebElement clickReportActivity;

    @FindBy(id = "tl_perform_report--51782_text")
    WebElement txtPerformReport;

    @FindBy(xpath = "//*[@id=\"ddcl-tl_perform_report--51789_select\"]/span/span")
    WebElement clickAgent;

    @FindBy(id = "ddcl-tl_perform_report--51789_select-i3")
    WebElement checklistAgent01;

    @FindBy(id = "tl_perform_report--51781_text")
    WebElement inputStartDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
    WebElement inputTanggalAwal;

    @FindBy(id = "tl_perform_report--51788_text")
    WebElement inputEndDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")
    WebElement inputTanggalAkhir;

    @FindBy(id = "51787_query")
    WebElement btnView;

    @FindBy(id = "tl_perform_report--51785-cell-0-1")
    WebElement txtNamaPerusahaan;

    @FindBy(id = "51798_query")
    WebElement btnExport;

    @FindBy(xpath = "//*[@id=\"tbody\"]/tr[256]/td[2]")
    WebElement txtSizeFileOne;

    @FindBy(xpath = "//*[@id=\"tbody\"]/tr[255]/td[2]")
    WebElement txtSizeFileTwo;


    //SHOWPAGE
    @FindBy(id = "tl_perform_report--51785_show_text")
    WebElement selectShowPage;

    @FindBy(id = "tl_perform_report--51785-cell-9-1")
    WebElement txtShowEntries10;


    //NEXTPAGE
    @FindBy(xpath = "//*[@id=\"tl_perform_report--51785\"]/div[9]/ul/li[3]")
    WebElement btnPage2;

    @FindBy(id = "tl_perform_report--51785-cell-1-1")
    WebElement txtNamePage2;

    @FindBy(xpath = "//*[@id=\"tl_perform_report--51785\"]/div[4]/ul/li[4]")
    WebElement btnLastPage;

    @FindBy(id = "tl_perform_report--51785-cell-1-1")
    WebElement txtNameLastPage;

    @FindBy(id = "tl_perform_report--51785_page")
    WebElement btnFirstPage;

    @FindBy(id = "tl_perform_report--51785-cell-0-1")
    WebElement txtNameFirstPage;

    public void clickReport() {
        clickReport.click();
    }

    public void clickReportActivity() {
        clickReportActivity.click();
    }

    public String getTxtPerformReport() {
        return txtPerformReport.getAttribute("value");
    }

    public void selectAgent() {
        clickAgent.click();
        checklistAgent01.click();
        checklistAgent01.sendKeys(Keys.ENTER);
    }

    public void inputStartDate() {
        inputStartDate.click();
    }

    public void inputTanggalAwal() {
        inputTanggalAwal.click();
    }

    public void inputEndDate() {
        inputEndDate.click();
    }

    public void inputTanggalAkhir() {
        inputTanggalAkhir.click();
    }

    public void btnView() {
        btnView.click();
    }

    public String getTxtNamaPerusahaan() {
        return txtNamaPerusahaan.getText();
    }

    public void btnExport() {
        btnExport.click();
    }

    public String getTxtSizeFileOne() {
        return txtSizeFileOne.getText();
    }

    public String getTxtSizeFileTwo() {
        return txtSizeFileTwo.getText();
    }

    public void selectShowPage(String showPage) {
        Select select = new Select(this.selectShowPage);
        select.selectByValue(showPage);
    }

    public String getTxtShowEntries10() {
        return txtShowEntries10.getText();
    }

    public void btnPage2() {
        btnPage2.click();
    }

    public String getTxtNamePage2() {
        return txtNamePage2.getText();
    }

    public void btnLastPage() {
        btnLastPage.click();
    }

    public String getTxtNameLastPage() {
        return txtNameLastPage.getText();
    }

    public void btnFirstPage() {
        btnFirstPage.click();
    }

    public String getTxtNameFirstPage() {
        return txtNameFirstPage.getText();
    }
}
