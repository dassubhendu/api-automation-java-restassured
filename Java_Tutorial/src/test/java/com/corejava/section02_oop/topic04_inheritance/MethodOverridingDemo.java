package com.corejava.section02_oop.topic04_inheritance;

/**
 * Overriding: a child redefines a parent method using @Override.
 * This mirrors how every test class extends a BaseTest for setup/teardown,
 * without needing a real Selenium WebDriver dependency.
 */
public class MethodOverridingDemo {

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.setUp();       // inherited from BaseTest
        test.validLogin();  // defined in LoginTest
        test.tearDown();    // inherited from BaseTest
    }
}

class BaseTest {
    protected String driver; // stands in for a real WebDriver instance

    void setUp() {
        driver = "chrome-session-started";
        System.out.println("setUp(): " + driver);
    }

    void tearDown() {
        System.out.println("tearDown(): closing " + driver);
        driver = null;
    }
}

class LoginTest extends BaseTest { // inherits driver, setUp(), tearDown()
    void validLogin() {
        System.out.println("Running validLogin() using " + driver);
    }
}
