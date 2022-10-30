package com.juaracoding.rizkimaulana.drivers;

import com.juaracoding.rizkimaulana.drivers.strategies.DriverStrategy;
import com.juaracoding.rizkimaulana.drivers.strategies.DriverStrategyImplementer;
import com.juaracoding.rizkimaulana.utils.Constants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) {
        instantiate(driver);
    }

    public void instantiate(String strategy) {
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        assert driverStrategy != null;
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public static void getInstance(String driver) {
        if(instance == null) {
            instance = new DriverSingleton(driver);
        }

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

}
