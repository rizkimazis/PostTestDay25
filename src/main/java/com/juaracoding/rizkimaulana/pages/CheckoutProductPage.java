package com.juaracoding.rizkimaulana.pages;

import com.juaracoding.rizkimaulana.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutProductPage {

    private final WebDriver driver;

    public CheckoutProductPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement btnCheckout;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement companyName;

    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    static
    WebElement countryName;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement addressOne;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    WebElement addressTwo;

    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement cityName;

    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement provinceName;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postCode;

    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement emailAddress;

    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement orderNotes;

    @FindBy(xpath = "//*[@id=\"terms\"]")
    static
    WebElement termsCheckbox;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    static
    WebElement btnPlaceOrder;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]")
    static
    WebElement receivedPage;

    public void btnCheckout() {
        btnCheckout.click();
    }
    public void firstName(String firstName){
        this.firstName.sendKeys(firstName);
    }
    public void lastName(String lastName){
        this.lastName.sendKeys(lastName);
    }
    public void companyName(String companyName){
        this.companyName.sendKeys(companyName);
    }
    public static void countryName(String indonesia) {
        countryName.sendKeys("Indonesia");
        countryName.click();
    }
    public void addressOne(String addressOne){
        this.addressOne.sendKeys(addressOne);
    }
    public void addressTwo(String addressTwo){
        this.addressTwo.sendKeys(addressTwo);
    }
    public void cityName(String cityName){
        this.cityName.sendKeys(cityName);
    }
    public void provinceName(String provinceName){
        this.provinceName.sendKeys(provinceName);
    }
    public void postCode(String postCode){
        this.postCode.sendKeys(postCode);
    }
    public void phone(String phone){
        this.phone.sendKeys(phone);
    }
    public void emailAddress(String emailAddrees){
        this.emailAddress.sendKeys(emailAddrees);
    }
    public void orderNotes(String orderNotes){
        this.orderNotes.sendKeys(orderNotes);
    }
    public static void termsCheckbox() {
        termsCheckbox.click();
    }
    public static void btnPlaceOrder() {
        btnPlaceOrder.click();
    }
    public static void receivedPage() {
        receivedPage.click();
    }
}
