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

    @FindBy(id = "ddcl-tl_distribute--52078_select-i0")
    WebElement checkboxBuketData;

    @FindBy(id = "52077_query")
    WebElement btnView;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtInformation;

    //DISTRIBUSI

    @FindBy(id = "tl_distribute--52066_verr")
    WebElement clickDistribusiKe;

    @FindBy(id = "ddcl-tl_distribute--52066_select-i0")
    WebElement checkboxDistribusiKe;

    @FindBy(id = "tl_distribute--52070_text")
    WebElement jumlahPerAgent;

    @FindBy(id = "52065_query")
    WebElement btnDistribusi;

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
        checkboxBuketData.click();
        checkboxBuketData.sendKeys(ENTER);
    }

    public void btnView() {
        btnView.click();
    }

    public String getTxtInformation() {
        return txtInformation.getText();
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
}
