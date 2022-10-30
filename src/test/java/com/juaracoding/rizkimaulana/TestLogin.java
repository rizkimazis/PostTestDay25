package com.juaracoding.rizkimaulana;

import com.juaracoding.rizkimaulana.pages.LoginPage;
import com.juaracoding.rizkimaulana.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private final LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    // Test Case One
    @When("User go to Web DEMOQA")
    public void user_go_to_Web_DEMOQA() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web DEMOQA");

    }

    @And("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("rizkimaulanaazis12@email.com", "RizkiM123456--");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("User on My Account Page")
    public void user_on_My_Account_Page() {
        Assert.assertEquals(loginPage.getTxtMyAccountPage(), "My Account Page");
        extentTest.log(LogStatus.PASS, "My Account");
    }
}

