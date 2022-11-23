package com.kelompoksatu.hris.pages;

import com.kelompoksatu.hris.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    private WebDriver driver;

    public UserPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

        // login
        @FindBy(id = "tl_login-1-51550_text")
        WebElement usernameLogin;

        @FindBy(id = "tl_login-1-51551_text")
        WebElement passwordLogin;

        @FindBy(id = "51552_query")
        WebElement btnSignin;

        @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
        WebElement btnOkWelcome;

        // button
        @FindBy(id = "ui-id-13")
         WebElement btnUserManagement;

        @FindBy(id = "52831_query")
        WebElement btnUser;

        //text
        @FindBy(id = "tl_user_management--51695_text")
        WebElement txtUserManagementPage;

        //menu
        public void ClickBtnUserManagement() {
            btnUserManagement.click();
        }
         public void ClickBtnUser() {

            btnUser.click();
    }
        //validasi
        public String getTxtUserManagementPage() {
            return txtUserManagementPage.getAttribute("value");

        }
        public void formLogin(String username, String password) {
            this.usernameLogin.sendKeys(username);
            this.passwordLogin.sendKeys(password);
            btnSignin.click();
        }

        public void btnOkWelcome() {
            btnOkWelcome.click();
    }
}
