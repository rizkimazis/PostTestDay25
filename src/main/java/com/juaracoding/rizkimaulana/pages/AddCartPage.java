package com.juaracoding.rizkimaulana.pages;

import com.juaracoding.rizkimaulana.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddCartPage {
        private final WebDriver driver;

        public AddCartPage() {
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement searchProductOne;

    @FindBy(id = "color")
    WebElement colorOne;

    @FindBy(id = "size")
    WebElement sizeOne;

    @FindBy(xpath = "//*[@id=\"noo-quantity-4570\"]")
    WebElement clickQtyProductOne;

    @FindBy(xpath = "//*[@id=\"product-704\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAddCartProductOne;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement searchProductTwo;

    @FindBy(id = "pa_color")
    WebElement colorTwo;

    @FindBy(id = "pa_size")
    WebElement sizeTwo;

    @FindBy(xpath = "//*[@id=\"product-1225\"]/div[1]/div[2]/form/div/div[2]/div/div/button[2]]")
    WebElement clickQtyProductTwo;

    @FindBy(xpath = "//*[@id=\"product-1225\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAddCartProductTwo;

    @FindBy(id = "nav-menu-item-cart")
    WebElement btnViewCart;


    public void searchProductOne(String tokyo_talkies) {
        searchProductOne.sendKeys(Keys.ENTER);
        System.out.println("Search Product One successfully");
    }
    public <Black> void colorOne(String Black) {
        colorOne.click();
    }
    public <L> void sizeOne(String L) {
        sizeOne.click();
    }
    public void clickQtyProductOne() {
        clickQtyProductOne.click();
    }
    public void btnAddCartProductOne() {
        btnAddCartProductOne.click();
    }

    public void searchProductTwo(String black_satin_one_shoulder_cut_out_midi_dress) {
        searchProductTwo.sendKeys(Keys.ENTER);
        System.out.println("Search Product Two successfully");
    }

    public <Black> void colorTwo(String Black) {
        colorTwo.click();
    }

    public <Large> void sizeTwo(String Large) {
        sizeTwo.click();
    }

    public void clickQtyProductTwo() {
        clickQtyProductTwo.click();
    }

    public void btnAddCartProductTwo() {
        btnAddCartProductTwo.click();
    }
    public void btnViewCart() {
        btnViewCart.click();
    }
}

