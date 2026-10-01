package com.corejava.section03_exceptions_utilities.topic04_enums;

/** Enums work naturally inside a switch statement. */
public class EnumSwitchDemo {

    enum Browser { CHROME, FIREFOX, EDGE }

    public static void main(String[] args) {
        launch(Browser.FIREFOX);
        launch(Browser.CHROME);
    }

    static void launch(Browser browser) {
        String driverName;
        switch (browser) {
            case CHROME:
                driverName = "ChromeDriver";
                break;
            case FIREFOX:
                driverName = "FirefoxDriver";
                break;
            case EDGE:
                driverName = "EdgeDriver";
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        System.out.println(browser + " -> " + driverName);
    }
}
