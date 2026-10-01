package com.corejava.section02_oop.topic06_abstraction;

/** Abstract class: can mix abstract and concrete methods, fields and constructors. */
public class AbstractClassDemo {

    public static void main(String[] args) {
        BasePage home = new HomePage("home-driver-session");
        System.out.println("Home page loaded? " + home.isLoaded());
        home.log("checked home page");
    }
}

abstract class BasePage {
    protected String driver; // stands in for a real WebDriver instance

    BasePage(String driver) {
        this.driver = driver;
    }

    abstract boolean isLoaded(); // no body here - every subclass MUST implement this

    void log(String msg) { // concrete method: shared by every subclass
        System.out.println("[LOG] " + msg);
    }
}

class HomePage extends BasePage {
    HomePage(String driver) {
        super(driver);
    }

    @Override
    boolean isLoaded() {
        return driver.contains("home"); // pretend check against the real page title
    }
}
