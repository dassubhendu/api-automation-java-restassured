package com.corejava.section01_java_fundamentals.topic06_control_flow;

/** switch picks one branch from many values (int, String, enum). break exits the switch. */
public class SwitchStatementDemo {

    public static void main(String[] args) {
        String browser = "firefox";
        String driverName;

        switch (browser) {
            case "chrome":
                driverName = "ChromeDriver";
                break;
            case "firefox":
                driverName = "FirefoxDriver"; // this case runs
                break;
            default:
                throw new IllegalArgumentException("Unknown browser: " + browser);
        }
        System.out.println("driverName -> " + driverName);

        // Without break, execution falls through to the next case - usually a bug
        int day = 2;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}
