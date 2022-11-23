package com.kelompoksatu.hris.drivers.strategies;


import com.kelompoksatu.hris.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            case Constants.CHROMEHEADLESS:
                return new ChromeHeadless();

            default:
                return null;
        }
    }
}
