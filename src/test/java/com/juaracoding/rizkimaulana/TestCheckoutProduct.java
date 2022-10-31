package com.juaracoding.rizkimaulana;

import com.juaracoding.rizkimaulana.pages.AddCartPage;
import com.juaracoding.rizkimaulana.pages.CheckoutProductPage;
import com.juaracoding.rizkimaulana.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestCheckoutProduct {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private final AddCartPage addCartPage = new AddCartPage();

    public TestCheckoutProduct() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User clicked checkout button")
    public void user_clicked_checkout_button() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User clicked checkout button");
    }

    @And("User on checkout page")
    public void user_on_checkout_page() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User on checkout page");
    }

    @And("User enter firstname")
    public void user_enter_firstname() {
        CheckoutProductPage.firstName("rizki maulana");
        extentTest.log(LogStatus.PASS, "User enter firstname");
    }

    @And("User enter lastname")
    public void user_enter_lastname() {
        CheckoutProductPage.lastName("azis");
        extentTest.log(LogStatus.PASS, "User enter lastname");
    }

    @And("User enter companyname")
    public void user_enter_companyname() {
        CheckoutProductPage.companyName("PT.5758");
        extentTest.log(LogStatus.PASS, "User enter companyname");
    }

    @And("User enter countryname")
    public void user_enter_countryname() {
        CheckoutProductPage.countryName("Indonesia");
        extentTest.log(LogStatus.PASS, "User enter countryname");
    }

    @And("User enter address one")
    public void user_enter_address_one() {
        CheckoutProductPage.addressOne("Jl. Maju Kena Mundur Kena");
        extentTest.log(LogStatus.PASS, "User enter address one");
    }

    @And("User enter address two")
    public void user_enter_address_two() {
        CheckoutProductPage.addressTwo("RT.000/000 Kec.Maju Kel.Mundur");
        extentTest.log(LogStatus.PASS, "User enter address two");
    }

    @And("User enter city name")
    public void user_enter_city_name() {
        CheckoutProductPage.cityName("Jakarta");
        extentTest.log(LogStatus.PASS, "User enter city name");
    }

    @And("User enter province name")
    public void user_enter_province_name() {
        CheckoutProductPage.provinceName("Jakarta");
        extentTest.log(LogStatus.PASS, "User enter province name");
    }

    @And("User enter postCode")
    public void user_enter_postcode() {
        CheckoutProductPage.postCode("12345");
        extentTest.log(LogStatus.PASS, "User enter postcode");
    }

    @And("User enter phone number")
    public void user_enter_phone_number() {
        CheckoutProductPage.phone("08122222222");
        extentTest.log(LogStatus.PASS, "User enter phone number");
    }

    @And("User enter email address")
    public void user_enter_email_address() {
        CheckoutProductPage.emailAddress("rizkimaulanaazis@email.com");
        extentTest.log(LogStatus.PASS, "User enter email address");
    }

    @And("User enter order notes")
    public void user_enter_order_notes() {
        CheckoutProductPage.orderNotes("tidak ada notes");
        extentTest.log(LogStatus.PASS, "User enter order notes");
    }

    @And("User click terms checkbox")
    public void user_click_checkbox() {
        CheckoutProductPage.termsCheckbox();
        extentTest.log(LogStatus.PASS, "User click terms checkbox");
    }

    @Then("User click button placeorder")
    public void user_click_button_placeorder() {
        CheckoutProductPage.btnPlaceOrder();
        extentTest.log(LogStatus.PASS, "User click button placeorder");
    }

    @And("User on received page")
    public void user_on_received_page() {
        CheckoutProductPage.receivedPage();
        extentTest.log(LogStatus.PASS, "User on received page");
    }
}
