package com.juaracoding.rizkimaulana.drivers.strategies;

import com.juaracoding.rizkimaulana.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.CHROMEHEADLESS:
                return new ChromeHeadless();

            case Constants.FIREFOX:
                return new Firefox();

            default:
                return null;
        }
    }
}

