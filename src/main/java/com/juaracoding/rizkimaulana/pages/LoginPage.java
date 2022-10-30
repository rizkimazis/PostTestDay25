package com.juaracoding.rizkimaulana.pages;

import com.juaracoding.rizkimaulana.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    WebElement txtMyAccountPage;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtMyAccountPage(){
        return txtMyAccountPage.getText();
    }
}
