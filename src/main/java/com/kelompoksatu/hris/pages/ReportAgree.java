package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
