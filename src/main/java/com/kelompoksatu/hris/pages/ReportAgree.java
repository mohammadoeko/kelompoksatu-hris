package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReportAgree {
    private WebDriver driver;

    public ReportAgree() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // ReportAgree
    @FindBy(id = "ui-id-19")
    WebElement clickReport;

    @FindBy(id = "52828_query")
    WebElement clickReportAgree;

    @FindBy(id = "tl_report_setuju--51773_text")
    WebElement txtReportSetuju;

    @FindBy(id = "tl_report_setuju--51772_text")
    WebElement inputStartDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")
    WebElement inputTanggalAwal;

    @FindBy(id = "tl_report_setuju--51780_text")
    WebElement inputEndDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a")
    WebElement inputTanggalAkhir;

    @FindBy(id = "51778_query")
    WebElement btnView;

    @FindBy(id = "tl_report_setuju--51776-cell-0-0")
    WebElement txtNamaPerusahaan;

    @FindBy(id = "51797_query")
    WebElement btnExport;

    @FindBy(xpath = "//*[@id=\"tbody\"]/tr[257]/td[2]")
    WebElement txtSizeFile;

    @FindBy(xpath = "//*[@id=\"tbody\"]/tr[258]/td[2]")
    WebElement txtSizeFileTwo;

    //Show entries
    @FindBy(id = "tl_report_setuju--51776_show_text")
    WebElement selectShowPage;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_table\"]/tbody/tr[10]/td[1]/table/tbody/tr/td")
    WebElement txtShowPage10;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_table\"]/tbody/tr[25]/td[1]/table/tbody/tr/td")
    WebElement txtShowPage25;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_table\"]/tbody/tr[50]/td[1]/table/tbody/tr/td")
    WebElement txtShowPage50;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776_table\"]/tbody/tr[100]/td[1]/table/tbody/tr/td")
    WebElement txtShowPage100;

    //NEXT PAGE
    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776\"]/div[9]/ul/li[3]")
    WebElement btnPage2;

    @FindBy(id = "tl_report_setuju--51776-cell-9-0")
    WebElement txtPageNumber20;

    @FindBy(xpath = "//*[@id=\"tl_report_setuju--51776\"]/div[4]/ul/li[8]")
    WebElement btnLastPage;

    @FindBy(id = "tl_report_setuju--51776-cell-2-0")
    WebElement txtNumberLastPage;

    @FindBy(id = "tl_report_setuju--51776_page")
    WebElement btnFirstPage;

    @FindBy(id = "tl_report_setuju--51776-cell-0-0")
    WebElement txtNumberFirstPage;

    public void clickReport() {
        clickReport.click();
    }

    public void clickReportAgree() {
        clickReportAgree.click();
    }

    public String getTxtReportSetuju() {
        return txtReportSetuju.getAttribute("value");
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

    public String getTxtSizeFile() {
        return txtSizeFile.getText();
    }

    public String getTxtSizeFileTwo() {
        return txtSizeFileTwo.getText();
    }

    public void selectShowPage(String valueShowPage) {
        Select select = new Select(selectShowPage);
        select.selectByValue(valueShowPage);
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

    public String getTxtShowPage100() {
        return txtShowPage100.getText();
    }

    public void btnPage2() {
        btnPage2.click();
    }

    public String getTxtPageNumber20() {
        return txtPageNumber20.getText();
    }

    public void btnLastPage() {
        btnLastPage.click();
    }

    public String getTxtNumberLastPage() {
        return txtNumberLastPage.getText();
    }

    public void btnFirstPage() {
        btnFirstPage.click();
    }

    public String getTxtNumberFirstPage() {
        return txtNumberFirstPage.getText();
    }
}
