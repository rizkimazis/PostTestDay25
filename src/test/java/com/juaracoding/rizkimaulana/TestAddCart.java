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
    @When("User go to search box item one")
    public void user_go_to_search_box_item_one() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to search box item one");

    }

    @And("User enter name product one")
    public void user_enter_name_product_one() {
        addCartPage.searchProductOne("TOKYO TALKIES");
        extentTest.log(LogStatus.PASS, "User enter name product one");
    }

    @And("User chooses color item one")
    public void user_chooses_color_item_one() {
        addCartPage.colorOne("Black");
        extentTest.log(LogStatus.PASS, "User chooses color item one");
    }

    @And("User chooses size item one")
    public void user_chooses_size_item_one() {
        addCartPage.sizeOne("L");
        extentTest.log(LogStatus.PASS, "User chooses size item one");
    }

    @And("User click quantity product one")
    public void user_click_quantity_product_one() {
        addCartPage.clickQtyProductOne();
        extentTest.log(LogStatus.PASS, "User click quantity product one");
    }
    @And("User click button add to cart item one")
    public void user_click_button_add_to_cart_item_one() {
        addCartPage.btnAddCartProductOne();
        extentTest.log(LogStatus.PASS, "User click button add to cart item one");
    }

    @Then("User on view cart product page one")
    public void user_on_view_cart_product_page_one() {
        addCartPage.btnViewCart();
        extentTest.log(LogStatus.PASS, "User on view cart product page one");
    }


    // User Add Product Two
    @When("User go to search box item two")
    public void user_go_to_search_box_item_two() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to search box item two");

    }

    @And("User enter name product two")
    public void user_enter_name_product_two() {
        addCartPage.searchProductTwo("BLACK SATIN ONE SHOULDER CUT OUT MIDI DRESS");
        extentTest.log(LogStatus.PASS, "User enter name product two");
    }

    @And("User chooses color item two")
    public void user_chooses_color_item_two() {
        addCartPage.colorTwo("Black");
        extentTest.log(LogStatus.PASS, "User chooses color item two");
    }

    @And("User chooses size item two")
    public void user_chooses_size() {
        addCartPage.sizeTwo("Large");
        extentTest.log(LogStatus.PASS, "User chooses size item two");
    }

    @And("User click quantity product item two")
    public void user_click_quantity_product_item_two() {
        addCartPage.clickQtyProductTwo();
        extentTest.log(LogStatus.PASS, "User click quantity product item two");
    }
    @And("User click button add to cart item two")
    public void user_click_button_add_to_cart_item_two() {
        addCartPage.btnAddCartProductTwo();
        extentTest.log(LogStatus.PASS, "User click button add to cart item two");
    }

    @Then("User on view cart product page two")
    public void user_on_view_cart_product_page_two() {
        addCartPage.btnViewCart();
        extentTest.log(LogStatus.PASS, "User on view cart product page two");
    }
}
