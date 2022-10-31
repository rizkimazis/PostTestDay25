package com.juaracoding.rizkimaulana;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.Login.feature",
                "src/main/resources/features/02.AddCart.feature",
                "src/main/resources/features/03.CheckoutProduct.feature"},
        glue = "com.juaracoding.rizkimaulana",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
