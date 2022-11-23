package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    public Search() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"51692_query\"]")
    WebElement btnSearchKosong;
    @FindBy(id = "tl_user_management--51695_text")
    WebElement txtUserManagementPage;

    @FindBy(id = "tl_user_management--51690_text")
    WebElement inputSearch;
    @FindBy(id = "51692_query")
    WebElement btnSearch;

    public void btnSearchKosong() {

        btnSearchKosong.click();
    }
    public String getTxtUserManagementPage() {

        return txtUserManagementPage.getText();
    }
    public void inputSearch(String stella) {

        this.inputSearch.sendKeys(stella);
    }

    public void btnSearch() {

        btnSearch.click();
    }
}
