package com.juaracoding.rizkimaulana;

import com.juaracoding.rizkimaulana.pages.AddCartPage;
import com.juaracoding.rizkimaulana.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestAddCart {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private final AddCartPage addCartPage = new AddCartPage();

    public TestAddCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    // User Add Product One
    @When("User go to search box")
    public void user_go_to_search_box() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to search box");

    }

    @And("User enter name product one")
    public void user_enter_name_product_one() {
        addCartPage.searchProductOne("TOKYO TALKIES");
        extentTest.log(LogStatus.PASS, "User enter name product one");
    }

    @And("User chooses color")
    public void user_chooses_color() {
        addCartPage.colorOne("Black");
        extentTest.log(LogStatus.PASS, "User chooses color");
    }

    @And("User chooses size")
    public void user_chooses_size() {
        addCartPage.sizeOne("L");
        extentTest.log(LogStatus.PASS, "User chooses size");
    }

    @And("User click quantity product")
    public void user_click_quantity_prodcut() {
        addCartPage.clickQtyProductOne();
        extentTest.log(LogStatus.PASS, "User click quantity product");
    }
    @And("User click button add to cart")
    public void user_click_button_add_to_cart() {
        addCartPage.btnAddCartProductOne();
        extentTest.log(LogStatus.PASS, "User click button add to cart");
    }

    @Then("User on view cart product page")
    public void user_on_view_cart_product_page() {
        addCartPage.btnViewCart();
        extentTest.log(LogStatus.PASS, "User on view cart product page");
    }


    // User Add Product Two
    @When("User go to search box")
    public void user_go_to_search_box() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to search box");

    }

    @And("User enter name product two")
    public void user_enter_name_product_one() {
        addCartPage.searchProductTwo("BLACK SATIN ONE SHOULDER CUT OUT MIDI DRESS");
        extentTest.log(LogStatus.PASS, "User enter name product two");
    }

    @And("User chooses color")
    public void user_chooses_color() {
        addCartPage.colorTwo("Black");
        extentTest.log(LogStatus.PASS, "User chooses color");
    }

    @And("User chooses size")
    public void user_chooses_size() {
        addCartPage.sizeTwo("Large");
        extentTest.log(LogStatus.PASS, "User chooses size");
    }

    @And("User click quantity product")
    public void user_click_quantity_prodcut() {
        addCartPage.clickQtyProductTwo();
        extentTest.log(LogStatus.PASS, "User click quantity product");
    }
    @And("User click button add to cart")
    public void user_click_button_add_to_cart() {
        addCartPage.btnAddCartProductTwo();
        extentTest.log(LogStatus.PASS, "User click button add to cart");
    }

    @Then("User on view cart product page")
    public void user_on_view_cart_product_page() {
        addCartPage.btnViewCart();
        extentTest.log(LogStatus.PASS, "User on view cart product page");
    }
}
