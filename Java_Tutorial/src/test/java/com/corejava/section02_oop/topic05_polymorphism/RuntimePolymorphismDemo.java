package com.corejava.section02_oop.topic05_polymorphism;

/** Runtime polymorphism: method overriding + upcasting - resolved by the actual object type. */
public class RuntimePolymorphismDemo {

    public static void main(String[] args) {
        Page p = new LoginPage(); // upcasting: a parent reference holding a child object
        System.out.println(p.title()); // "Login" - Java looks at the REAL object, not the reference type

        Page genericPage = new Page();
        System.out.println(genericPage.title()); // "Generic page"

        // Same idea used for cross-browser code: one reference type, many concrete forms
        String browser = "firefox";
        Driver driver = browser.equals("chrome") ? new ChromeDriverFake() : new FirefoxDriverFake();
        driver.open();
    }
}

class Page {
    String title() {
        return "Generic page";
    }
}

class LoginPage extends Page {
    @Override
    String title() {
        return "Login";
    }
}

interface Driver {
    void open();
}

class ChromeDriverFake implements Driver {
    public void open() {
        System.out.println("Opening Chrome");
    }
}

class FirefoxDriverFake implements Driver {
    public void open() {
        System.out.println("Opening Firefox");
    }
}
